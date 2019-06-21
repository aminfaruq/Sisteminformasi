package id.co.maminfaruq.sisteminformasi.ui.alumni

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.AlumniAdapter
import id.co.maminfaruq.sisteminformasi.model.alumni.DataAlumni
import id.co.maminfaruq.sisteminformasi.ui.info.InfoPresenter
import kotlinx.android.synthetic.main.activity_alumni.*

class AlumniActivity : AppCompatActivity(), AlumniContract.View {

    private var presenter = AlumniPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumni)
        title = " Alumni"
        presenter.getAlumni()
    }

    override fun showAlumni(listAlumni: List<DataAlumni>) {
        rv_alumni.layoutManager = LinearLayoutManager(this)
        rv_alumni.adapter = AlumniAdapter(this, listAlumni)
    }
}
