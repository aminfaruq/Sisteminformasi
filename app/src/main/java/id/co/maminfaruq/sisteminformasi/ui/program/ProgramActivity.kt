package id.co.maminfaruq.sisteminformasi.ui.program

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.ProgramAdapter
import id.co.maminfaruq.sisteminformasi.model.program.DataProgram
import kotlinx.android.synthetic.main.activity_program.*

class ProgramActivity : AppCompatActivity(), ProgramContract.View {

    private var presenter = ProgramPresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)
        title = "Program"
        presenter.getProgram()
    }

    override fun showProgram(listProgram: List<DataProgram>) {
        rv_program.adapter = ProgramAdapter(this,listProgram)
        rv_program.layoutManager = LinearLayoutManager(this)
    }

}
