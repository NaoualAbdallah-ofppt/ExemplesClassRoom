//fonction lambdas
fun main()
{
    println(somme(4,6))
    //println(double(4,6)) 
    //error: too many arguments for 
}

//Fonction lambdas Somme
val somme = { x: Int, y: Int -> x + y }
//Fonction lambdas Double
//val double={x->x*2}
//error: cannot infer a type for this parameter. Please specify it explicitly.
//val double={x->x*2}
val double={x:Int->x*2}
