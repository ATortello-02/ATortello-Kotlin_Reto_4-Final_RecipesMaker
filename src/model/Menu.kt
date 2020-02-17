package model

open class Menu
{
    val listaAgua:      List<String> = listOf<String>("Agua de coco", "Agua de manzanilla", "Agua embotellada")
    val listaLacteos:   List<String> = listOf<String>("Leche", "Mantequilla", "Suero", "Queso", "Yogurt")
    val listaCarnes:    List<String> = listOf<String>("Carne de res", "Carne de cerdo", "Carne de pollo", "Guisantes")
    val listaVerduras:  List<String> = listOf<String>("Zanahoria", "Coliflor", "Tomate", "Apio", "Pepino")
    val listaFrutas:    List<String> = listOf<String>("Manzana", "Pera", "Mora", "Banano", "Uva", "Kiwi", "Mango")
    val listaCereales:  List<String> = listOf<String>("Maiz", "Trigo", "Sorgo", "Arroz", "Avena")
    val listaHuevos:    List<String> = listOf<String>("Huevos A", "Huevos AA", "Huevos AAA", "Huevos blancos")
    val listaAceites:   List<String> = listOf<String>("Aceite de palma", "Aceite de coco", "Aceite de oliva")
    var responseIngr:   String? = ""   //Respuesta del usuario (Ingrediente)

    fun mostrarAgua(): String? //Función para mostrar lista de Aguas:
    {
        var selAgua: String?
        do
        { println("""
        /******************************************************************\
        Selecciona uno:
                        
        1. Agua de coco     2. Agua de manzanilla     3. Agua embotellada
        /******************************************************************\        
        """.trimIndent())
            selAgua = readLine()
        }while (selAgua!!.toInt().compareTo(0)<=0 || selAgua!!.toInt().compareTo(4)>=0)

        println("Cuánto deseas de tu selección (${listaAgua.get(selAgua!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaAgua.get(selAgua!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarLacteos(): String? //Función para mostrar lista de Lácteos:
    {
        var selLacteos: String?
        do
        { println("""
        /******************************************************************\
        Selecciona uno:
                    
        1. Leche     2. Mantequilla     3. Suero     4. Queso     5. Yogurt
        /********************************************************************\            
        """.trimIndent())
            selLacteos = readLine()
        }while (selLacteos!!.toInt().compareTo(0)<=0 || selLacteos!!.toInt().compareTo(6)>=0)

        println("Cuánto deseas de tu selección (${listaLacteos.get(selLacteos!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaLacteos.get(selLacteos!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarCarnes(): String? //Función para mostrar lista de Carnes y Legumbres:
    {
        var selCarnes: String?
        do
        { println("""
        /*****************************************************************************\
        Selecciona uno:
        
        1. Carne de res     2. Carne de cerdo     3. Carne de pollo     4. Guisantes
        /*****************************************************************************\        
        """.trimIndent())
            selCarnes = readLine()
        }while (selCarnes!!.toInt().compareTo(0)<=0 || selCarnes!!.toInt().compareTo(5)>=0)

        println("Cuánto deseas de tu selección (${listaCarnes.get(selCarnes!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaCarnes.get(selCarnes!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarVerduras(): String? //Función para mostrar lista de Verduras:
    {
        var selVerduras: String?
        do
        { println("""
        /*********************************************************************\
        Selecciona uno:
        
        1. Zanahoria     2. Coliflor     3. Tomate     4. Apio     5. Pepino
        /*********************************************************************\
        """.trimIndent())
            selVerduras = readLine()
        }while (selVerduras!!.toInt().compareTo(0)<=0 || selVerduras!!.toInt().compareTo(6)>=0)

        println("Cuánto deseas de tu selección (${listaVerduras.get(selVerduras!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaVerduras.get(selVerduras!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarFrutas(): String? //Función para mostrar lista de Frutas:
    {
        var selFrutas: String?
        do
        { println("""
        /*************************************************\
        Selecciona uno:
        
        1. Manzana     2. Pera     3. Mora     4. Banano
        5. Uva         6. Kiwi     7. Mango
        /*************************************************\
        """.trimIndent())
            selFrutas = readLine()
        }while (selFrutas!!.toInt().compareTo(0)<=0 || selFrutas!!.toInt().compareTo(8)>=0)

        println("Cuánto deseas de tu selección (${listaFrutas.get(selFrutas!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaFrutas.get(selFrutas!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarCereales(): String? //Función para mostrar lista de Cereales:
    {
        var selCereales: String?
        do
        { println("""
        /************************************************************\
        Selecciona uno:
        
        1. Maiz     2. Trigo     3. Sorgo     4. Arroz     5. Avena
        /************************************************************\
        """.trimIndent())
            selCereales = readLine()
        }while (selCereales!!.toInt().compareTo(0)<=0 || selCereales!!.toInt().compareTo(6)>=0)

        println("Cuánto deseas de tu selección (${listaCereales.get(selCereales!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaCereales.get(selCereales!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }

    fun mostrarHuevos(): String? //Función para mostrar lista de Huevos:
    {
        var selHuevos: String?
        do
        { println("""
        /*********************************************************************\
        Selecciona uno:
        
        1. Huevos A     2. Huevos AA     3. Huevos AAA     4. Huevos blancos
        /*********************************************************************\        
        """.trimIndent())
            selHuevos = readLine()
        }while (selHuevos!!.toInt().compareTo(0)<=0 || selHuevos!!.toInt().compareTo(5)>=0)

        println("Cuánto deseas de tu selección (${listaHuevos.get(selHuevos!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaHuevos.get(selHuevos!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }
    
    fun mostrarAceites(): String? //Función para mostrar lista de Aceites:
    {
        var selAceites: String?
        do
        { println("""
        /****************************************************************\
        Selecciona uno:
        
        1. Aceite de palma     2. Aceite de coco     3. Aceite de oliva
        /****************************************************************\        
        """.trimIndent())
            selAceites = readLine()
        }while (selAceites!!.toInt().compareTo(0)<=0 || selAceites!!.toInt().compareTo(4)>=0)

        println("Cuánto deseas de tu selección (${listaAceites.get(selAceites!!.toInt()-1)})?")
        responseIngr = readLine()

        return "\n${listaAceites.get(selAceites!!.toInt()-1)}: ${responseIngr!!.toInt()}"
    }
}