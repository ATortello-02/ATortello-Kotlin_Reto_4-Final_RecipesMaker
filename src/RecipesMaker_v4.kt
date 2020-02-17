import model.Menu

fun main(args: Array<String>)
{
//=================================================================\\
//Declaración de variables:
    var responseMenu: String?    //1. Respuesta del usuario
    var r: List<String?> = listOf<String?>()         //2. Respuesta de función
    var i: Int = 0
//=================================================================\\
//Con el do while muestro el menú y recibo del usuario la opción a manejar
    do
    {   responseMenu = mostrarMenu(0)   //Respuesta del usuario (Opción)
        if (responseMenu!!.equals("1"))
        { r = r.plus(makeRecipe()) }
        else if (responseMenu!!.equals("2"))
        { viewRecipe(r) }
    }while (responseMenu!! != "3") //Salida del ciclo
    println("Saliendo de programa...")
}

//=================================================================\\
//Función para crear recetas
fun makeRecipe(): String?
{
    var responseCat:String?     //Respuesta del usuario (Categoría)
    var cantIngr: String? = ""  //Para preguntar cantidad de ingrediente:
    val menu = Menu()           //Creo objeto para cada opción del menú:
    var receta: String? = ""

    do
    {   responseCat = mostrarMenu(1)          //Muestro menú de Categorías
        when (responseCat!!.toInt())
        {   1 -> cantIngr = menu.mostrarAgua()
            2 -> cantIngr = menu.mostrarLacteos()
            3 -> cantIngr = menu.mostrarCarnes()
            4 -> cantIngr = menu.mostrarVerduras()
            5 -> cantIngr = menu.mostrarFrutas()
            6 -> cantIngr = menu.mostrarCereales()
            7 -> cantIngr = menu.mostrarHuevos()
            8 -> cantIngr = menu.mostrarAceites()
            9 -> println("")                            //Lo sé, no hace nada, pero en realidad sí hace algo
            else -> println("\nÉsta opción no existe")
        }
        if (!responseCat!!.toInt().equals(9)) //Agrego ingredientes a la receta
        { receta = receta + cantIngr }
    }while (responseCat!! != "9")
    return "$receta"
}

//=================================================================\\
//Función para mostrar recetas
fun viewRecipe(receta: List<String?>)
{
    var j: Int = 0
    var k: Int = 0

    if(j == 1)
    { println("\nTienes ${receta.size} recetas almacenadas y lleva:\n${receta.get(j - 1)}") }
    else
    {
        println("\nTienes ${receta.size} recetas almacenadas, escoge una [1 a ${receta.size}]:")
        j = readLine()!!.toInt()
        println("Tu receta No. $j lleva:\n${receta.get(j-1)}")
    }

//    for (a in receta)
//    {
//        println("Tu receta $j lleva:\n$a")
//        j++
//    }
}

//=================================================================\\
//Función para mostrar menús
fun mostrarMenu(n: Int): String?
{
    val menuPrincipal: String = """ 
    /========================================================\
    :: Bienvenido a Recipe Maker ::
    
    Selecciona la opción deseada:
    1. Hacer una receta     2. Ver mis recetas     3. Salir
    /========================================================\
  """.trimIndent()

    val menuCategory: String = """
    /-------------------------------------------------------------------\    
    Hacer receta > Selecciona por categoría el ingrediente que buscas:
    
    1. Agua         2. Lácteos      3. Carnes, legumbres
    4. Verduras     5. Frutas       6. Cereales    
    7. Huevos       8. Aceites      9. -Volver al menú P/pal- 
    /-------------------------------------------------------------------\
  """.trimIndent()

    when (n)
    {
        0 -> println(menuPrincipal)
        1 -> println(menuCategory)
    }
    return readLine()    //Respuesta del usuario (Opción)
}