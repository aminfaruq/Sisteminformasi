package id.co.maminfaruq.sisteminformasi.ui.menu

import android.content.Intent
import android.icu.text.IDNA
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.SlideAdapter
import id.co.maminfaruq.sisteminformasi.model.info.DataInfo
import id.co.maminfaruq.sisteminformasi.ui.alumni.AlumniActivity
import id.co.maminfaruq.sisteminformasi.ui.gallery.GalleryActivity
import id.co.maminfaruq.sisteminformasi.ui.info.InfoActivity
import id.co.maminfaruq.sisteminformasi.ui.jurusan.JurusanActivity
import id.co.maminfaruq.sisteminformasi.ui.menu.MenuPresenter
import id.co.maminfaruq.sisteminformasi.ui.profile.ProfileActivity
import id.co.maminfaruq.sisteminformasi.ui.program.ProgramActivity
import kotlinx.android.synthetic.main.fragment_menu.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MenuFragment : Fragment() , MenuContract.View{

    private var menuPresenter = MenuPresenter(this)


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        menuPresenter.getSlide()

        fab_user.setOnClickListener{
            startActivity(Intent(context,ProfileActivity::class.java))
        }

        fab_info.setOnClickListener {
            startActivity(Intent(context, InfoActivity::class.java))
        }

        fab_alumni.setOnClickListener {
            startActivity(Intent(context, AlumniActivity::class.java))
        }

        fab_gallery.setOnClickListener {
            startActivity(Intent(context,GalleryActivity::class.java))
        }

        fab_jurusan.setOnClickListener {
            startActivity(Intent(context, JurusanActivity::class.java))
        }

        fab_program.setOnClickListener {
            startActivity(Intent(context,ProgramActivity::class.java))
        }

    }

    override fun loadData(data: List<DataInfo>) {
        val adapter = SlideAdapter(context!!, data)
        viewPagerBanner.adapter = adapter
    }



}
