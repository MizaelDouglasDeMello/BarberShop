package br.com.mizaeldouglas.barbershop

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView3: TextView = findViewById(R.id.textView3)
        val styledText = "Bem-vindo à <font color='#fb9a73'>Barber Shop</font>! Agende seu estilo com a gente e aproveite a experiência de se cuidar com quem entende."
        textView3.text = Html.fromHtml(styledText, Html.FROM_HTML_MODE_LEGACY)
    }
}