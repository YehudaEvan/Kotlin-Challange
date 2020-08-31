package Challenge.VTabung
import java.util.*

fun main () {
    val jari : Float
    val tinggi : Float
    val volumepi : Float

    val reader = Scanner(System.`in`)

    print("Masukan Jari Jari : ")
    jari = reader.nextFloat()

    print("Masukan Tinggi : ")
    tinggi = reader.nextFloat()

    volumepi = (22 * jari * jari * tinggi / 7)

    val s = String.format("%2f", volumepi)
    println("===========================")
    print("Jadi Volume Tabung = $s ")
}