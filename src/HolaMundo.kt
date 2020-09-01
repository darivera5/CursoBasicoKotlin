// No se puede colocar a una Varible local - Son globales
const val N = "NAME"
// var es una mala practica de programación

fun main(args: Array<String>) {
    println("Hola mundo");

    // Variables de tipo local para tiempo de ejecución
    val a = 4
    val b = 5

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = args[0] //Tiempo de ejecución
    //const tiempo de compilación

    println(name)
    println(N)

    val nombre = "Daniel"
    val apellido: String = "Muelas"

    println("Tu nombre es: $nombre $apellido ")

    val nombreapellido = "Daniel \n Muelas"
    println("Tu nombre es: $nombreapellido" )
    //raw String
    val parrafo : String = """Programación Funcional → Se realiza de manera declarativa, 
                              no se preocupara por el que si no por el como (Se usan funciones todo el tiempo)

                            Funciones puras → Dados los mismos parámetros de entrada la función debe retornar 
                            siempre el mismo valor. → La función no debe tener efectos colaterales, es decir no debe 
                            haber nada en el entorno que la altere. Como por ejemplo, variables globales que fue el 
                            ejemplo que vimos en la clase anterior.""".trimIndent()
    println(parrafo.trimMargin())

    val oneToHundred = 1..5
    for (i in oneToHundred){
        println(i)
    }

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C'){
        println(letra)
    }

    // Sentencia if logico es boolean
    val numero = 2
    if(numero.equals(2)){// false
        println("son iguales")
    }else{
        println("no son iguales")
    }

    //When - muy familiar a switch
    when(numero){
        in 1..5 -> println("Si esta entre 1 y 5")
        in 1..3 -> println("Si esta entre 1 y 3")
       // in 1..10 -> println("No esta entre 1 y 3")
        else -> println("No está en alguno de los anteriores")
    }

    //
    var i = 1
    //while -> para manejar contadores
    while (i <= 10){
        println("mensaje: $i")
        i++
    }

    i=1;

    // Primero hace y despues ejecuta
    do{
        println("mensaje: $i")
        i++
    }while (i <= 10)

    var daysOfWeek =
            listOf("Domingo","Lunes","Martes","Miercoles",
                    "Jueves","Viernes","Sabado")

    for(day in daysOfWeek){
        println(day)
    }

    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }



    listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    daysOfWeek.forEach{
        println(it)
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("k: $j")
        }
    }

    //Valores nulos ¿La nada existe? y double bang


    /*Una buena práctica de programación es comenzar con variables no nulas.

    Kotlin es Null Safety.

    Kotlin evita que una excepción sea lanzada porque provoca vulnerabilidades.

    En Kotlin por defecto ningún valor puede ser nulo. Nos marcará un error.*/

    // OPERADOR ELVIS OPERADOR TERNARIO PARA COMPARAR VALORES NULOS
    /*
    try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("No aceptamos valores nulos")
    }*/

    //Realizar llamada segura
    var compute: String? = null
    var longitud: Int? = compute?.length
    println("Longitud: $longitud")

    // Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length  ?: 0
    println("Longitud Teclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(1,null,null,4)
    println("Lista con Null:  ${listWithNulls}")

    val listWihoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWihoutNulls)
    

}