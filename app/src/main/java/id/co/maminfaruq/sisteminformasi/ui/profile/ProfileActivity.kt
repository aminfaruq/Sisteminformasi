package id.co.maminfaruq.sisteminformasi.ui.profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import id.co.maminfaruq.sisteminformasi.R
import id.co.maminfaruq.sisteminformasi.adapter.ProfileAdapter
import id.co.maminfaruq.sisteminformasi.model.profil.DataProfil
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity(), ProfileContract.View {

    private var presenter = ProfilePresenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        presenter.getProfile()
        title = "Profile"

    }

    override fun showProfile(listProfile: List<DataProfil>) {
        rv_profile.layoutManager = LinearLayoutManager(this)
        rv_profile.adapter = ProfileAdapter(this, listProfile)
    }

}
