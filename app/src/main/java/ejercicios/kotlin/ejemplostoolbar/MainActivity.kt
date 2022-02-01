package ejercicios.kotlin.ejemplostoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ejercicios.kotlin.ejemplostoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Solo realice el binding en el gradle e inicialice las variables
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}