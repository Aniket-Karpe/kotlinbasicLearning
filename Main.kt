package com.aklabs.kotlinpractice.practicekotlin

import androidx.core.util.rangeTo
import java.util.TreeMap

fun main() {

   // var res=add(34,2)
    //print(res)
 //  var res1= max(23,7)
    //print(res1)
  //  hashmapcollection()
    //checknull()
   //println()
  //  evenOrOddnum()
    //calculaterange()
    //whenloop()
  //  typecasting()
    constructor()
    var avg=avergeinterst(2003,0.03)
   // print(avg)
   // val num1 = readLine()?.toIntOrNull() ?: 0
   var setup=Substances()
    setup.subName="Aniket"
    val desc="Hello user does want to know the faculty knows.." +
            "As much as th".trimIndent()

    val num1=10
    val num2=10
    val fruits= arrayOf("Banana,apple,coconut,strawberry,mango")
    val navels= listOf(1,3,2,2,2,2,3,2,2)
 //println(fruits.joinToString())

    //println("Sum of the two numbers is :${num1+num2}")
  //  println("Description Is:$desc")
   // print("The all things are :${setup.subName}")
}

fun constructor() {



}

fun typecasting() {
    var str:String ="88"
    var num:Int=str.toInt()
    print(num)

}

fun avergeinterst(amt:Int,Interest:Double) :Int{
return(amt+amt*Interest).toInt()




}

//fun max(a: Int, b: Int):Int{
//    if(a>b){
//        return a
//    }
//    else
//        return b
//}
fun max(a:Int,b:Int):Int =if (a>b) a else b


fun add(a:Int,b:Int) :Int=a+b



fun hashmapcollection() {

    var nums= listOf(1,22,3,4,4)
    for((i,e) in nums.withIndex())
    {
   //    println(" $i : $e")
    }
    var aliens=TreeMap<String,Int>()
    aliens["Aniket"]=24
    aliens["Yogesh"]=29

    for ((name,age) in aliens)
    {
        println(" $name : $age")
    }

}


fun checknull(){

    var str:String?=null
    var ac:Int?=null
    var subs:Substances?=Substances()
    subs=null
    print(subs?.subName)


}

fun whenloop(){

val data= listOf(1,2,3,4,5,6,7)
    data.forEach{
        datas->when(datas){
            1->print("one")
        2->print("Two")
        3->print("Three")
        4->print("Four")
        5->print("Five")
        6->print("Six")
        7->print("Seven")
        else->print("None")}

    }

    var num:Int=33
    var asci=when(num){

        1->"One"
        2->"Two"
        33->"thirtyThree"
        else->"none"

    }
    //print("$asci")
}

 fun evenOrOddnum() {

     var nums = listOf(1, 2, 3, 4, 5)
     nums.forEach {

             list ->
         when (list) {

             is Int -> when {
                 list % 2 == 0 -> println("$list is Even Number")
                 else -> println("$list is a Odd number")
             }

             is Int -> print("num")
             else -> print("unKnown")
         }
     }
 }

fun calculaterange(){
     var nums= 1 until 3
    var nums1 = 14 downTo 4

    for(b in nums1)
    {
        print(" $b ,")
    }
for(a in nums.reversed())
{
    println(a)
}
    print(nums.count())
}




