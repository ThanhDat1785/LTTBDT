package com.example.btcanhan1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.btcanhan1.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ các view trong layout
        val avatar: ImageView = findViewById(R.id.avatar)
        val textName: TextView = findViewById(R.id.textName)
        val textLocation: TextView = findViewById(R.id.textLocation)
        val backButton: ImageView = findViewById(R.id.imageView2)
        val saveButton: ImageView = findViewById(R.id.imageView3)

        // Xử lý sự kiện click nếu cần
        backButton.setOnClickListener {
            // Thoát app
            finish()
        }

        saveButton.setOnClickListener {
            // Tạm thời: hiện thông báo đơn giản (nếu có Toast)
            // Toast.makeText(this, "Đã lưu thông tin!", Toast.LENGTH_SHORT).show()
        }
    }
}
