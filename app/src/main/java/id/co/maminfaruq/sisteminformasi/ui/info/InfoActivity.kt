package id.co.maminfaruq.sisteminformasi.ui.info

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.InfoAdapter
import id.co.maminfaruq.sisteminformasi.model.info.DataInfo
import id.co.maminfaruq.sisteminformasi.ui.profile.ProfilePresenter
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity(), InfoContract.View {

    private var presenter = InfoPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        title = "Info Sekolah"
        presenter.getInfo()
    }

    override fun showInfo(listInfo: List<DataInfo>) {
        rv_info.layoutManager = LinearLayoutManager(this)
        rv_info.adapter = InfoAdapter(this, listInfo)
    }

}
