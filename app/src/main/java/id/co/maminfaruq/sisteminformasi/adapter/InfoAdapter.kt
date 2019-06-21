package id.co.maminfaruq.sisteminformasi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.model.info.DataInfo
import id.co.maminfaruq.sisteminformasi.utils.Constans
import kotlinx.android.synthetic.main.info_item.view.*

class InfoAdapter(val context: Context, private val dataInfo: List<DataInfo>) : RecyclerView.Adapter<InfoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.info_item,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataInfo.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.binItems((dataInfo[p1]))
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tv_judul = view.tvInfoJudul
        val tv_description = view.tvInfoDeskripsi
        val image_info = view.imgInfo

        fun binItems(infoData : DataInfo){
            tv_judul.text = infoData.namaPrestasi
            tv_description.text = infoData.deskripsiPrestasi
            Glide.with(itemView.context)
                    .load(Constans.baseURL + "image_info/" + infoData.fotoPrestasi)
                    .into(image_info)
        }
    }
}