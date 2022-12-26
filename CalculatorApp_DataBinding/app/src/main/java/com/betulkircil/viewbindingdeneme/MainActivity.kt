package com.betulkircil.viewbindingdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.betulkircil.viewbindingdeneme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main)
        tasarim.bolmeBtn.setOnClickListener(){
            var ilkSayi = tasarim.editTextIlkSayi.text.toString()
            var ikinciSayi = tasarim.editTextIkinciSayi.text.toString()
            if(ilkSayi.toInt() != 0) {
                var sonuc:Double = (ilkSayi.toInt() / ikinciSayi.toInt()).toDouble()
                tasarim.sonucText.text = sonuc.toString()
            }
        }

        tasarim.carpmaBtn.setOnClickListener(){
            var ilkSayi = tasarim.editTextIlkSayi.text.toString()
            var ikinciSayi = tasarim.editTextIkinciSayi.text.toString()

            var sonuc: Int = ilkSayi.toInt() * ikinciSayi.toInt()
            tasarim.sonucText.text = sonuc.toString()
        }

        tasarim.cikarmaBtn.setOnClickListener(){
            var ilkSayi = tasarim.editTextIlkSayi.text.toString()
            var ikinciSayi = tasarim.editTextIkinciSayi.text.toString()

            var sonuc: Int = ilkSayi.toInt() - ikinciSayi.toInt()
            tasarim.sonucText.text = "Sonuc: " + sonuc.toString()
        }

        tasarim.toplamaBtn4.setOnClickListener(){
            var ilkSayi = tasarim.editTextIlkSayi.text.toString()
            var ikinciSayi = tasarim.editTextIkinciSayi.text.toString()

            var sonuc = ilkSayi.toInt() + ikinciSayi.toInt()
            tasarim.sonucText.text = "Sonuc: " + sonuc.toString()
        }
    }
}

