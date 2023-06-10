package com.example.a10120781utsguruh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.a10120781utsguruh.databinding.ActivityHomeBinding
import com.example.a10120781utsguruh.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragment(Home())
                R.id.daily_activity -> replaceFragment(Daily())
                R.id.gallery -> replaceFragment(Gallery())
                R.id.music -> replaceFragment(Music())
                R.id.profil -> replaceFragment(Profil())

                else -> {



                }
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}

//Nama : Guruh Fillah Alfariza
//NIM  : 10120781
//KELAS : IF-9
//Tanggal Pengerjaan : 14 MEI 2023