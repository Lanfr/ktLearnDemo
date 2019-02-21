package com.example.administrator.ktlearndemo

/**
 * Created by Administrator on 2019/2/11.
 */
class Empty constructor(firstName:String){
    //在Kotlin中的一个类有一个主构造函数以及多个次构造函数，主构造函数是类头的一部分，它跟在类名后

    //主构造函数的参数可以在初始化块中使用也可以在类体内部使用
    init {
        //初始化块
    }
    constructor(name: String, empty: Empty) : this(name) {
    }
    class person(firstName: String){
        //如果主构造函数没有任何注解后可见性修饰可以省略constructor关键字

    }
    val a=firstName
}