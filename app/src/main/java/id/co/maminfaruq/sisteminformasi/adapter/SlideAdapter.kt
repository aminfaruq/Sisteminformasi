package id.co.maminfaruq.sisteminformasi.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import id.co.maminfaruq.sisteminformasi.model.info.DataInfo
import id.co.maminfaruq.sisteminformasi.utils.Constans

class SlideAdapter(val context: Context, private val dataInfoList: List<DataInfo>) : PagerAdapter() {
    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }

    override fun getCount(): Int {
        return dataInfoList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(context)

        Picasso
                .get()
                .load( Constans.baseURL + "image_info/" + dataInfoList[position].fotoPrestasi)
                .fit()
                .centerCrop()
                .into(imageView)

        container.addView(imageView)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, any: Any) {
        container.removeView(any as View)
    }
}