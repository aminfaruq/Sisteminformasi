package id.co.maminfaruq.sisteminformasi.ui.gallery

import id.co.maminfaruq.sisteminformasi.model.galeri.DataGallery

interface GalleryContract {

    interface View{
        fun showGallery(listGallery : List<DataGallery>)
    }

    interface Presenter{
        fun getGallery()
    }
}