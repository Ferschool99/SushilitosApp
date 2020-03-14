package equipo2.examen.sushilitos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu.setOnClickListener{
            var intent = Intent(this, Categorias::class.java)
            intent.putExtra("tipo", "Cold drinks")
            startActivity(intent)
        }

        //La pondre directo porque no tengo boton en la vista principal


    }
}
