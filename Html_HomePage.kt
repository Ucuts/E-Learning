package com.yusuf_222003.e_learning.HTML

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.R

class Html_HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_home_page)

        val view2 = findViewById<View>(R.id.view2)
        val textview14 = findViewById<TextView>(R.id.textView14)

        view2.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Html_pengertian::class.java))
        }

        textview14.setOnClickListener {
            // Ketika TextView di klik, buka halaman HTML
            startActivity(Intent(this, Html_pengertian::class.java))
        }

    }
}