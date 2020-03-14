package equipo2.examen.sushilitos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_categorias.*

class Categorias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)


        entradas.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "entradas")
            startActivity(intent)
        }
        rollos.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "rollos")
            startActivity(intent)
        }
        platillos.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "platillos")
            startActivity(intent)
        }
        postres.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "postres")
            startActivity(intent)
        }
        menu_kids.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "menu_kids")
            startActivity(intent)
        }
        especialidad.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "especialidades")
            startActivity(intent)
        }
        bebidas.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "bebidas")
            startActivity(intent)
        }

        //La pondre directo porque no tengo boton en la vista principal


    }
}
