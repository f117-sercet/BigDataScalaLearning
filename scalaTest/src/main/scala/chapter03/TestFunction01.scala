package chapter03

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2023/11/2 8:57
 */
object TestFunction01 {

  def foo1(a: =>Int): Unit = {
       println(a)
      println(a)

  }

  def main(args: Array[String])={

    // 控制抽象
    //(1) 值调用
    def f = ()=>{
      println("f...")
      10
    }
    foo(f())

    //名称调用
    //注意：Java 只有值调用；Scala 既有值调用，又有名调用。
    foo1(f())
    // 惰性加载 当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行
    lazy val res = sum(10, 30)
    println("----------------")
    println("res=" + res)
    //注意：lazy 不能修饰 var 类型的变量
  }
  def sum(n1:Int,n2:Int):Int ={
    println("sum 被执行。。。")
    return n1 +n2
  }

  def foo(a: Int)={
    println(a)
    println(a)
  }

}
