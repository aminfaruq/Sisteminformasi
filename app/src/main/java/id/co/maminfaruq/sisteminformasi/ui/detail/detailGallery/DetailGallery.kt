package id.co.maminfaruq.sisteminformasi.ui.detail.detailGallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import id.co.maminfaruq.sisteminformasi.R
import kotlinx.android.synthetic.main.activity_detail_gallery.*

class DetailGallery : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gallery)

        val gambarClub = intent.getStringExtra("gambar")

        Glide.with(this).load(gambarClub).into(img_detail_gallery)

    }
}
