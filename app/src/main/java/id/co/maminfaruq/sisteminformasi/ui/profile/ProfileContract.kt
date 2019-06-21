package id.co.maminfaruq.sisteminformasi.ui.profile

import id.co.maminfaruq.sisteminformasi.model.profil.DataProfil

interface ProfileContract {

    interface View{
        fun showProfile(listProfile : List<DataProfil>)
    }

    interface Presenter{
        fun getProfile()
    }
}