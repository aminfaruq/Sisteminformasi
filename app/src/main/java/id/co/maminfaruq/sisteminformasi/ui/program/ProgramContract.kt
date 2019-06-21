package id.co.maminfaruq.sisteminformasi.ui.program

import id.co.maminfaruq.sisteminformasi.model.program.DataProgram

interface ProgramContract {

    interface View{
        fun showProgram(listProgram : List<DataProgram>)
    }

    interface Presenter{
        fun getProgram()
    }
}