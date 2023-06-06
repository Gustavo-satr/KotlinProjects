// mapa inmutable
fun main() {
val ladas: Map<Int,String>=mapOf(
    1 to "USA",
    34 to "España",
    52 to "Mexico",
    67 to "Colombia",
    70 to "Argentina"

)
println(ladas)
println(ladas[1])
println¿()

ladas.forEach(action = {(key, value)-> println("La clave lada de $value es $key") })










52000


// Recuperar su tamaño, cuantos pares hay en el mapa
println("Tamaño: ${ladas.size}");
//Recuperar solo claves
println("Claves del mapa: ${ladas.keys}");
//Recuperar solo los valores
println("Valores del mapa: ${ladas.values}");
//Recuperar las entradas
println("Entradas del mapa: ${ladas.entries}");
//Recuperar un valor si existe, sino, envia el default 
println("Valor de la lada 48: ${ladas.getOrDeFault(48, "Pais desconocido")}");
// Comprobar si el mapa está vacio:
println("Mapa vacio: ${ladas.isEmpty()}");
//Comprobar si existe una clave especifica en el mapa 
println("Existe la clave lada 86: ${86 in ladas}");
//Comprobar si existe un valor en el mapa
println("Existe el valor Mexico en el mapa: ${"Mexico in ladas.values}");

    //Mapa mutable
var nums = mutableMapOf08 (
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4
    
);
println("Mapa de numeros: $num);
    //eliminar valores del mapa
    nums.remove("two");
    println("Mapa nuevo de numeros: $nums");

    var sorteNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");
    

// Función Diccionario ingles 

fun crearDiccionario(): MutableMap<String, String> {
    val diccionario = mutableMapOf<String, String>()
    
    diccionario["mochila"] = "backpack"
    diccionario["calle"] = "street"
    diccionario["casa"] = "house"
    diccionario["queso"] = "cheese"
    diccionario["Lapiz"] = "Pencil"
    diccionario["libro"] = "book"
    diccionario["libreta"] = "notebook"
    return diccionario
}

fun consultarTraduccion(diccionario: MutableMap<String, String>, palabra: String): String? {
    return diccionario[palabra]
}
fun main() {
    val diccionario = crearDiccionario()

    // Consulta de la traducción de la palabra
    val palabra = "casa"
    val traduccion = consultarTraduccion(diccionario, palabra)
    if (traduccion != null) {
        println("La traducción de '$palabra' es '$traduccion'.")
    } else {
        println("La palabra '$palabra' no se encontró en el diccionario.")
    }
}

