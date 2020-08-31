package Challenge.VKerucut
import java.util.*

fun main () {
    var jari: Float
    var tinggi: Float
    var volumepi: Float

    val reader = Scanner(System.`in`)

    print("Masukan Jari Jari : ")
    jari = reader.nextFloat()

    print("Masukan Tinggi : ")
    tinggi =  reader.nextFloat()

    volumepi = (((1 * 22 * jari * jari * tinggi) / 3) / 7)
    val s = String.format("%.2f", volumepi)
    println("===========================")
    print("Jadi Volume Tabung : $s ")
}