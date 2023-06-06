// Usando funciones que regresen valore 
// Y funciones que no regresen valores

fun main(){
    val num1 = 12;
    val num2 = 15;

    borde("=", 20);
    var resultado = suma(num1, num2);
    println(resultado);
    borde("*", 20);


// Ejemplo 1 de funcion anonima 
    val slogan = {resultado : Int -> println("Tu puedes con $resultado problemas y mas ")};

//Invocar a una funciona nonima - Forma 1
    slogan(resultado);
    
//Invocar a una funciona nonima - Forma 2
    slogan.invoke(resultado);

//Ejercicio de resta con funcion anonima 
    val resta = {num1 : Int, num2 : Int -> println( num1 - num2)};
    resta(12, 24)


//Funcion anonima Que encuentre el mayor de tres numeros
    val max = {num1: Int, num2: Int, num3: Int->}
    println("Valor Mximo: ");

//Funcion asincrona de promedio
        val promedio = {n1 : Int, n2 : Int, n3 : Int, n4 : Int, n5 : Int -> (n1+n2+n3+n4+n5)/5};
        println("promedio = ${promedio(10,9,8,10,8)}");
    
//Funcion asincrona del mayor de tres numeros
        val max = {a: Int, b:Int, c:Int -> 
            if(a>b && a>c)a
            else if(b>a && b > c)b
            else if(c> a && c > b)c
            else "son iguales"
        }
            println("valor maximo:${max(5,8,9)}");
    
    }


fun borde(caracter : String, veces : Int){
    for( i in 1..veces){
        print(caracter);
    }
    println();
}

fun suma (num1 : Int, num2 : Int) : Int{
    return num1 + num2;
}