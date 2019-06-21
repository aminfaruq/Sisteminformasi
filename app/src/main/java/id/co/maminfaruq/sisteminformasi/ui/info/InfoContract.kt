package id.co.maminfaruq.sisteminformasi.ui.info

import id.co.maminfaruq.sisteminformasi.model.info.DataInfo

interface InfoContract {

    interface View{
        fun showInfo(listInfo : List<DataInfo>)
    }

    interface Presenter{
        fun getInfo()
    }
}