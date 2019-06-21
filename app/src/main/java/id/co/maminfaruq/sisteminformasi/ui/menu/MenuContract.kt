package id.co.maminfaruq.sisteminformasi.ui.menu

import id.co.maminfaruq.sisteminformasi.model.info.DataInfo

interface MenuContract {

    interface View{
        fun loadData( data : List<DataInfo>)
    }

    interface Presenter{
        fun getSlide()
    }
}