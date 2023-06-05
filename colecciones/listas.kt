// listas
fun main (){
    // Listas inmutable
    val readOnly = List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posición 3: ${readOnly.get(3)}");
    println("Elemento de la lista: ${readOnly.first()}");
    println("Ultimo elemento de la lista: ${readOnly.last()}");
    
    //Mostrar los elementos de la lista usando estructura for
    
    println("Elementos de readOnly")
    for (elemento in readOnly){
        println(elemento);
    }
    //Mostrar los elementos de la Lista usando el método forEach 

    println("Elementos de readOnly usando forEach");
    readOnly.forEach{println
        println(it)
}
    //listas mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes", "Martes");
    println("Lista mutable: $mutableList");
    mutableList.add("Miercoles");
    println("Lista mutable: $mutableList");

    //Trabajando con listas mutables vacias 

    var emptyLIst : mutableList<String> = mutableListOf();
    println("¿La lista esta vacia?: ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("Ultimo elemento de emptyList: ${emptyList.lasOrNull()}");
    println("Elemento en la posición 2 de emptyList: ${emptyList.elementoAtOrNull(2)}");

    //agregando elementos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacia: $emptyList");

    //Ordenar una Lista
    val numeroDeLoteria = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Numeros de loteria: $numerosDeLoteria");
    val numerosOrdenados = $numerosDeLoteria.sorted();
    println("Numeros ordenados: $numerosOrdenados");
    val numerosDescendentes = numeroDeLoteria.sortedDescending();
    println("Numeros ordenados en forma descendente: $numerosDescendentes");
    val numerosPares = $numerosDeLoteria.filter{num -> num % 2 == 0};
    println("Numeros pares: $numerosPares");
    
}
