package vc.srd.molemole.review

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vc.srd.molemole.databinding.ActivityReviewBinding
import java.io.File

class ReviewActivity : AppCompatActivity() {

    lateinit var binding : ActivityReviewBinding

    lateinit var file : File

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        file = intent.extras?.getSerializable("file") as File

        if (file.exists()) {
//            val myBM = BitmapFactory.decodeFile(file.absolutePath)
//            binding.imageView.setImageBitmap(myBM)
            binding.imageView.setImageURI(Uri.fromFile(file))
        }

    }
}