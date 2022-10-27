enum class ApiResponse1 {
    OK,
    NOT_FOUND,
    UNAUTHORIZED,
    FORBIDDEN,
    UNKNOWN
}
enum class ApiResponse2(val code: Int) {
    OK(200),
    NOT_FOUND(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    UNKNOWN(0)
}
enum class CardType(val color: String) {
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black")
}
fun main()
{
    val response: ApiResponse1 = ApiResponse1.OK
    when(response){
        ApiResponse1.OK -> print("OK")
        ApiResponse1.NOT_FOUND -> print("NOT_FOUND")
        ApiResponse1.UNAUTHORIZED -> print("UNAUTHORIZED")
        ApiResponse1.FORBIDDEN -> print("FORBIDDEN")
        ApiResponse1.UNKNOWN -> print("UNKNOWN")
    }
    val color = CardType.SILVER.color
    println(color)
    val response2: ApiResponse2=ApiResponse2.OK
 
    println(response2.code)

}