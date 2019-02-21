package com.example.administrator.ktlearndemo

/**
 * Created by Administrator on 2019/1/14.
 */
class BaseGrammar {
    /**
     *    val表示只读类型 只能为其赋值一次的变量
     *
     *    var表示可从新赋值的变量
     */


    //顶部变量
    val PI=3.14
    var z=0

    val items= listOf(11,22,33)

    val lan : Int=100_000_000



    /**
     * 带两个Int参数 返回Int的函数
     */

    fun sum(a:Int,b:Int):Int{
        var m :Int=0
        for (item in items){
           m=item
      }
        return a+b+m
    }

    /**
     * 返回值自动推断
     */
    fun sums(a:Int,b:Int):Int=a+b

    /**
     * 函数返回无意义的值
     */
    fun printSum(a:Int,b: Int):Unit{
        //局部变量
        val c:Int=1//立即赋值
        val d=2//自动推断
        val e:Int//如果没有初始值不能省略类型
        e=3//明确赋值
        var x=5//自动推断为Int型
        x+=1

        println("sum of$a and $b is ${a+b}")
    }
    fun incrementZ(){
        z+=1
        var s=1
        val s1="a is $s"
        s=3
        val s2="${s1.replace("is","was")},but now is $s"

    }

    /**
     * 表达式
     */
    fun maxOf(a:Int,b: Int):Int{
        if (a>b){
            return a
        }else {
            return b
        }
    }

    fun maxOfs(a: Int,b: Int):Int=if (a>b)a else b


    /**
     * 可null值及null检查
     *
     * 当某个变量的值可以为null时，必须在声明处的类型hou添加？来标识该应用可为空
     *
     *
     */
    fun parseInt(str : String) :Int?{
        //
        return null
    }



    /**
     *  kotlin的基本类型
     *  数字 Double 64   Float 32  Long 64  Int 32   Short 16   Byte  8
     *
     */

    fun data(){
        val a:Byte=1
        val b:Int=a.toInt()
    }

    fun dss(){
        loop@ for(i in 1..100){
            for (j in 1..100){
                //if (......) break@loop
            }
        }
    }




}