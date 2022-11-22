package vc.srd.molemole

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vc.srd.molemole.camera.CameraActivity
import vc.srd.molemole.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startActivity(Intent(this, CameraActivity::class.java))
    }
}