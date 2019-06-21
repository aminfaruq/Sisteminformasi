package id.co.maminfaruq.sisteminformasi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.model.alumni.DataAlumni
import id.co.maminfaruq.sisteminformasi.utils.Constans
import kotlinx.android.synthetic.main.item_alumni.view.*

class AlumniAdapter(val context: Context, private val dataAlumniList: List<DataAlumni>) : RecyclerView.Adapter<AlumniAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_alumni, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataAlumniList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindItems(dataAlumniList[p1])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val img_alumni = view.img_alumni
        val tv_alumni = view.nama_alumni
        val tv_bio = view.tv_bio

        fun bindItems(dataAlumni: DataAlumni) {
            tv_alumni.text = dataAlumni.namaAlumni
            tv_bio.text = dataAlumni.bio
            Glide.with(itemView.context)
                    .load(Constans.baseURL + "image_alumni/" + dataAlumni.fotoAlumni)
                    .into(img_alumni)
        }

    }
}