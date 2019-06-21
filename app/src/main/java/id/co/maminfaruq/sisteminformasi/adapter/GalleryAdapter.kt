package id.co.maminfaruq.sisteminformasi.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.model.galeri.DataGallery
import id.co.maminfaruq.sisteminformasi.utils.Constans
import kotlinx.android.synthetic.main.item_gallery.view.*

class GalleryAdapter(val context: Context, private val dataGalleryList: List<DataGallery>, val listener : (DataGallery) -> Unit) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_gallery, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataGalleryList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindItems(dataGalleryList[p1],listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img_gallery = view.img_gallery
        val tv_judul = view.tv_judul_gallery

        fun bindItems(dataGallery: DataGallery, listener: (DataGallery) -> Unit) {
            tv_judul.text = dataGallery.judulGallery
            Glide.with(itemView.context)
                    .load(Constans.baseURL + "gallery/" + dataGallery.gallery)
                    .into(img_gallery)

            itemView.setOnClickListener {
                listener(dataGallery)
            }
        }
    }
}