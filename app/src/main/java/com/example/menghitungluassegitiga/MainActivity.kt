package com.example.menghitungluassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variabel dan tipe data
        val inputAlas = findViewById<EditText>(R.id.input_alas)
        val inputTinggi = findViewById<EditText>(R.id.input_tinggi)
        val outputLuas = findViewById<TextView>(R.id.output_luas)

        // Struktur kontrol
        val buttonHitung = findViewById<Button>(R.id.button_hitung)
        buttonHitung.setOnClickListener {
            // Mendapatkan input dari pengguna
            val alas = inputAlas.text.toString().toDouble()
            val tinggi = inputTinggi.text.toString().toDouble()

            // Menghitung luas segitiga
            val luas = alas * tinggi / 2

            // Menampilkan hasil perhitungan
            outputLuas.text = "Luas segitiga adalah $luas"
        }
    }
}
