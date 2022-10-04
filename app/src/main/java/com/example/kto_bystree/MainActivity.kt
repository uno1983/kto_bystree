package com.example.kto_bystree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main () {

    //println("Вы запустили программу Кто быстрее, суть программы: ввести максимальное количество символов за 2 секунды")
    val abrakadabra = mutableListOf<String>() //создаем пустую коллекцию с типом элементов стринг (для любых символов)
    //var k = Int
    //var i = Int

        //val m = TimeUnit.MINUTES.toSeconds(3)  // задаем переменную, равную 3 секундам
    //print("Введите символ и нажмите Enter: ")
    //for(i in 0.. m){ //запускаем цикл на 2 секунды

        for ( k in 1..5){  // в этом цикле заполняем коллекцию с помощью ввода с консоли 5 элементов
            print("Введите символ и нажмите Enter: ")
           var n = readln()
           abrakadabra.add(n )
        }
    //}
    print( "вот, что Вы ввели $abrakadabra")

}


