package equipo2.examen.sushilitos

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class ProductosActivity : AppCompatActivity() {

    var entradas = ArrayList<Product>()
    var rollos = ArrayList<Product>()
    var especialidades = ArrayList<Product>()
    var platillos = ArrayList<Product>()
    var menu_kids = ArrayList<Product>()
    var bebidas = ArrayList<Product>()
    var postres = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        listview.adapter = agregarProductos();


        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();



    }

    private fun agregarProductos():AdaptadorProductos{
        if(intent.getStringExtra("tipo").equals("entradas")){
            entradas.add(Product("CAMARONES CON PHILA (8 PZ).", "Empanizados con un copo de arroz blanco con tampico.", 110.0))
            entradas.add(Product("CAMARONES TÉMPURA (10PZ.)","",110.00))
            entradas.add(Product("CAMARONES BUFFALO (10PZ.)","",110.00))
            entradas.add(Product("VERDURAS TÉMPURA.","Zanahorias, cebolla, calabaza, brócoli y chile morrón.",100.00))
            entradas.add(Product("BONELESS.","Tiras de pechuga de pollo empalizadas y bañadas en salsa Buffalo ó BBQ.",110.00))
            entradas.add(Product("BONELESS DE LA CASA.","¡Inmejorables! nueva salsa especial de la casa.",120.00))
            entradas.add(Product("ENSALADA BONELESS.","Lechuga, zanahoria, tomate y pepino con tiritas de pollo empanizado bañadas en salsa picosita.",120.00))
            entradas.add(Product("DEDOS DE QUESO (6 PZ).","Tiras de queso phila o queso manchego.",70.00))
            entradas.add(Product("CHILES RELLENOS (2 CHILES CARIBE).","Chile caribe empanizado relleno con camarón, surimi, tocino y queso phila.",75.00))
            entradas.add(Product("BROCHETAS.","Camarón, pollo o surimi alternado con chile morrón, cubierto con queso phila o trozos de queso manchego empanizadas, acompañadas con un copo de arroz con tampico.",110.00))
            entradas.add(Product("PAPAS SAZONADAS.","Ricas papas sazonadas acompañadas de queso amarillo o aderezo ranch.",65.00))
            entradas.add(Product("CHILES CARIBES RESCOLDADOS.","",40.00))
            entradas.add(Product("CEBOLLITAS CAPEADAS.","",50.00))
            entradas.add(Product("ROKA CHICKEN.","",110.00))
            entradas.add(Product("BOTANA ROJA.","Chiles Rellenos, Boneless, Camarones Buffalo y papaz sazonadas.",140.00))
            entradas.add(Product("BOTANA ESPECIAL.","Camarones con phila (3 piezas), deditos de queso manchego o phila (3 piezas), chile relleno (1 pieza) y cebollitas capeadas.",130.00))
            entradas.add(Product("CHICHARRONES DE ATÚN","Chile verde empanizado relleno de queso manchego, pollo, tocino y res.",140.00))
            entradas.add(Product("EDAMAMES","100% saludables, vaina de soja servida con limón, sal y chile tajín.",80.00))
            titulo_img.setImageResource(R.drawable.entradas)
            return AdaptadorProductos(this, entradas)
        }
        if(intent.getStringExtra("tipo").equals("rollos")){
            rollos.add(Product("CALIFORNIA TRADICIONAL.","Pepino, aguacate, phila y un ingrediente: marlin, tocino, pollo, plátano, chile toreado, camarón, surimi o tampico.", 85.00))
            rollos.add(Product("CALIFORNIA VEGETARIANO.","Pepino, aguacate, queso phila, y zanahoria.",70.00))
            rollos.add(Product("CALIFORNIA ESPECIAL.","Pepino, aguacate, queso phila y un ingrediente a elegir: Salmón, Atún, Ostión y/o Pulpo.",105.00))
            rollos.add(Product("BOMBA DE CAMARÓN.","Pepino, aguacate, queso phila, camarón.",100.00))
            rollos.add(Product("BOMBAZO SUSHI.","Pepino, aguacate, queso phila, camarón, surimi, marlin, tocino, chile y aderezo dinamita.",130.00))
            rollos.add(Product("BOMBA VEGETARIANA.","Pepino, aguacate, queso phila y zanahoria.",80.00))
            rollos.add(Product("BOMBA ESPECIALIDADES.","",130.00))
            rollos.add(Product("CHALINO ROLL.","Pepino, aguacate, queso phila, surimi y camarón, gratinado con queso manchego y cubierto de un aderezo dinamita.",115.00))
            rollos.add(Product("CHICKEN ROLL.","Pepino, aguacate, queso manchego, tampico, camarón empanizado y pollo.",115.00))
            rollos.add(Product("CHIPOTLE ROLL.","Pepino, aguacate, queso phila, camarón y tocino, bañado con una crema de chipotle.",115.00))
            rollos.add(Product("CORDON BLUE.","Pepino, aguacate, queso phila, pollo, gratinado con queso manchego y tocino.",115.00))
            rollos.add(Product("CULICHI ROLL.","Pepino, aguacate, queso phila, tocino, camarón y rajas de chile caribe toreados por dentro del rollo.",115.00))
            rollos.add(Product("GREENGO ROLL.","Vegetales (apio, zanahoria, pepino y aguacate), queso phila, tiras de pechuga de pollo empanizadas por dentro del rollo bañado con el aderezo de la casa y además un toque picante.",115.00))
            rollos.add(Product("LUZ Y FUEGO ROLL.","Pepino, aguacate , queso phila, marlin, surimi y por fuera queso manchego gratinado con tocino.",115.00))
            rollos.add(Product("MANCHEGO ROLL.","Pepino, aguacate, queso phila. tocino, res y gratinado con queso manchego.",115.00))
            rollos.add(Product("MORELOS ROLL.","Pepino, aguacate, res, pollo, deditos de queso manchego por dentro del rollo y por fuera cubierto de queso phila, chiles caribes, chile verde con un toque de tocino.",115.00))
            rollos.add(Product("NEVADO ROLL.","Pepino, aguacate, queso phila, surimi. camarón y gratinado con queso manchego o cubierto con queso phila.",115.00))
            rollos.add(Product("SONORA ROLL.","Pepino, aguacate, queso phila, chile verde, pollo, tocino, res y por fuera cubierto de aguacate y a su vez bañado con una crema de cilantro.",115.00))
            rollos.add(Product("TERIYAKI ROLL.","Aguacate, queso phila, (pollo y zanahoria con salsa teriyaki) y ajonjolí.",115.00))
            titulo_img.setImageResource(R.drawable.rollos)
            return AdaptadorProductos(this, rollos)
        }
        if(intent.getStringExtra("tipo").equals("especialidades")){
            especialidades.add(Product("ARRACHERA ROLL.","Pepino, aguacate, queso manchego, chile verde, carne de res y por fuera queso phila con tocino.",115.00))
            especialidades.add(Product("C-4 ROLL.","Pepino, aguacate, queso phila, chile serrano, camarón empanizado y tampico.",115.00))
            especialidades.add(Product("CIELO MAR Y TIERRA ROLL.","Pepino, aguacate, queso phila, pollo, res y camarón.",115.00))
            especialidades.add(Product("COSMO ROLL.","Pepino, aguacate, queso phila, camarón por dentro y salmón por fuera.",115.00))
            especialidades.add(Product("DINAMITA ROLL.","Pepino, aguacate, queso phila, camarón, marlin, chile toreado y por fuera queso manchego gratinado bañado con aderezo dinamita.",115.00))
            especialidades.add(Product("MANGO ROLL.","Pepino, aguacate, pollo y tocino, con una mezcla de queso phila con trozos de piña por fuera del rollo y cubierto de una salsa de mango con chile.",115.00))
            especialidades.add(Product("SUBARACHI ROLL.","Pepino, aguacate, queso phila, camarón; por fuera queso phila y tampico.",115.00))
            especialidades.add(Product("SUSHILITO ROLL.","Pepino, aguacate, queso phila, tocino, camarón, chiles toreados y un toque de salsa picosa por dentro del rollo.",115.00))
            especialidades.add(Product("SHUSHIYTO ROLL.","Pepino, aguacate, queso phila, cangrejo empanizado coronado con un topping de tampico spicy y trocitos de camarón empanizado.",115.00))
            especialidades.add(Product("TOCINO ESPECIAL.","Pepino, aguacate, surimi y camarón empanizados por dentro del rollo, con una mezcla de queso phila con tocino por fuera y cubierto con crema de cilantro.",115.00))
            especialidades.add(Product("ORDEN DE TAMPICO.","",25.00))
            titulo_img.setImageResource(R.drawable.especialidad)
            return AdaptadorProductos(this, especialidades)
        }
        if(intent.getStringExtra("tipo").equals("platillos")){
            platillos.add(Product("TERIYAKI","Riquísimas verduras al vapor o salteadas (cebolla, brócoli, zanahoria, apio y calabaza) servido en una cama de arroz blanco o arroz frito, bañado con salsa teriyaki y ajonjolí espolvoreado. \n 1 Ing. \$120.00 // Ingrediente extra \$30.00// Ingredientes a elegir: Camarón, Pollo y Res",120.00))
            platillos.add(Product("TEPANYAKI","Riquísimas verduras salteadas (cebolla, brócoli, zanahoria, chile morrón, apio y calabaza) servido en una cama de arroz blanco o arroz frito, bañado con salsa de la casa y ajonjolí espolvoreado.\n1 Ing. \$120.00 // Ingrediente extra \$30.00// Ingredientes a elegir: Camarón, Pollo y Res",120.00))
            platillos.add(Product("JAPAN","Riquísimas verduras salteadas (cebolla, brócoli, zanahoria, chile morrón, apio y calabaza) servido en una cama de arroz blanco o arroz frito, bañado con salsa picosita y chile quebrado espolvoreado.\n1 Ing. \$120.00 // Ingrediente extra \$30.00// Ingredientes a elegir: Camarón, Pollo y Res",120.00))
            platillos.add(Product("YAKIMESHI","Ingredients/ExplanationTazón de arroz frito preparado con verduras picadas finamente, queso phila, tampico, aguacate, espolvoreado con furikake y ajonjolí.",100.00))
            platillos.add(Product("YAKIMESHI ESPECIAL","Tazón de arroz frito preparado con verduras picadas finamente, res, pollo, tocino y tampico.",120.00))
            platillos.add(Product("GOHAN","Tazón de arroz blanco con queso phila, tampico y furikake.",80.00))
            platillos.add(Product("GOHAN ESPECIAL","Ingredients/ExplanationTazón de arroz blanco servido con queso phila, tampico, res, pollo, camarón y furikake espolvoreado.",120.00))
            platillos.add(Product("MISIL.","Chile verde empalizado relleno de queso manchego, pollo, tocino y queso phila.",130.00))
            platillos.add(Product("PORCIÓN DE ARROZ BLANCO","",40.00))
            platillos.add(Product("PORCIÓN DE ARROZ FRITO","",55.00))
            titulo_img.setImageResource(R.drawable.platillos)
            return AdaptadorProductos(this, platillos)
        }
        if(intent.getStringExtra("tipo").equals("menu_kids")){
            menu_kids.add(Product("NUGGETS DE POLLO.","",75.00))
            menu_kids.add(Product("PAPAS FRITAS.","",65.00))
            titulo_img.setImageResource(R.drawable.menukids)
            return AdaptadorProductos(this, menu_kids)
        }
        if(intent.getStringExtra("tipo").equals("bebidas")){
            bebidas.add(Product("TÉ HELADO 1/2 LITRO.","",20.00))
            bebidas.add(Product("TÉ HELADO LITRO.","",30.00))
            bebidas.add(Product("ARIZONA TÉ.","",30.00))
            bebidas.add(Product("REFRESCO 600 ML.","",30.00))
            bebidas.add(Product("LIMONADA CHICA.","",30.00))
            bebidas.add(Product("LIMONADA GRANDE.","",35.00))
            titulo_img.setImageResource(R.drawable.bebidas)
            return AdaptadorProductos(this, bebidas)
        }
        if(intent.getStringExtra("tipo").equals("postres")){
            postres.add(Product("FLAN NAPOLITANO","",30.00))
            postres.add(Product("PAY DE QUESO","",30.00))
            titulo_img.setImageResource(R.drawable.postres)
            return AdaptadorProductos(this, postres)
        }


        return AdaptadorProductos(this, entradas)

    }

}

private class AdaptadorProductos: BaseAdapter {

    var productos = ArrayList<Product>()
    var contexto: Context? = null

    constructor(contexto: Context, productos: ArrayList<Product>){
        this.contexto = contexto
        this.productos = productos
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var prod = productos[p0]
        var inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.producto_view, null)

        //vista.producto_img.setImageResource(prod.image)
        vista.producto_nombre.setText(prod.name)
        vista.producto_desc.setText(prod.description)
        vista.producto_precio.setText(prod.price.toString())

        return vista
    }

    override fun getItem(p0: Int): Any {
        return productos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return productos.size
    }

}
