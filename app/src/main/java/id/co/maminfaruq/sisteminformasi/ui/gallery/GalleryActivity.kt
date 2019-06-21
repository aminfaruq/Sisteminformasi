package id.co.maminfaruq.sisteminformasi.ui.gallery

import android.content.ClipData
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.GalleryAdapter
import id.co.maminfaruq.sisteminformasi.model.galeri.DataGallery
import id.co.maminfaruq.sisteminformasi.ui.alumni.AlumniPresenter
import id.co.maminfaruq.sisteminformasi.ui.detail.detailGallery.DetailGallery
import id.co.maminfaruq.sisteminformasi.utils.Constans
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity : AppCompatActivity(), GalleryContract.View {

    val items: MutableList<DataGallery> = mutableListOf()/*Gunanya untuk bisa mengubah ubah datanya*/


    private var presenter = GalleryPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        title = "Gallery"
        presenter.getGallery()
    }

    override fun showGallery(listGallery: List<DataGallery>) {
        rv_gallery.layoutManager = GridLayoutManager(this, 2)
        rv_gallery.adapter = GalleryAdapter(this, listGallery) {
            val i = Intent(this, DetailGallery::class.java)
            i.putExtra("gambar", Constans.baseURL + "gallery/" + it.gallery)
            startActivity(i)
        }


    }
}
