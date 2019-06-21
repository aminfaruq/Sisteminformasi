package id.co.maminfaruq.sisteminformasi.ui.alumni

import id.co.maminfaruq.sisteminformasi.model.alumni.DataAlumni

interface AlumniContract {

    interface View{
        fun showAlumni(listAlumni : List<DataAlumni>)
    }

    interface Presenter{
        fun getAlumni()
    }
}