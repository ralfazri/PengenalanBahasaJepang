package com.surelabsid.pengenalanbahasajepang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.surelabsid.pengenalanbahasajepang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //kasih klik untuk masing-masing tombol
        binding.letsPlay.setOnClickListener {
            //do something in here
        }

        binding.tentang.setOnClickListener {
            //do something in here

            //ini dipakai untuk membuat sebuah object dari intent yang mana
            // akan digunakan untuk berpindah dari halaman MainActivity ke Tentang Aplikasi
            val intentTentang = Intent(this@MainActivity, TentangAplikasi::class.java)

            //mulai/proses menampilkan halaman tentang aplikasi
            startActivity(intentTentang)
        }

        binding.keluar.setOnClickListener {
            //sama dengan yang atas
        }
    }
}