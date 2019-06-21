package id.co.maminfaruq.sisteminformasi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.model.profil.DataProfil
import id.co.maminfaruq.sisteminformasi.utils.Constans
import kotlinx.android.synthetic.main.item_profile.view.*

class ProfileAdapter(val context: Context, private val dataItemList: List<DataProfil>) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_profile, p0, false)
        return ProfileAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataItemList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindItems(dataItemList[p1])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val img_profile = view.img_profile
        val tv_judul = view.tv_judul
        val tv_deskripsi = view.tv_deskripsi

        fun bindItems(profileData: DataProfil) {
            tv_judul.text = profileData.namaSekolah
            tv_deskripsi.text = profileData.deskripsiSekolah
            Glide.with(itemView.context)
                    .load(Constans.baseURL + "image/" + profileData.fotoSekolah)
                    .into(img_profile)
        }

    }
}