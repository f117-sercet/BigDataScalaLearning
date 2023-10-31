package chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2023/10/31 11:57
 */
object testFunction {

  def main(args: Array[String]): Unit = {

    // 将函数当成参数
    val f1 = foo _
    foo()
    f1()

    // 明确变量类型
    var f2:() =>Unit = foo

    var f3:() =>Int = foo2
    f3()

    // map映射
    def map(arr:Array[Int],op:Int =>Int) ={
      for(elem <- arr) yield op(elem)
    }

    val arr = map(Array(1, 2, 3, 4), (x: Int) => {
      x * x
    })
    println(arr.mkString(","))

    // （2）filter 过滤。有参数，且参数再后面只使用一次，则参数省略且 后面参数用_表示
    def filter(arr: Array[Int], op: Int => Boolean) = {
      var arr1: ArrayBuffer[Int] = ArrayBuffer[Int]()
      for (elem <- arr if op(elem)) {
        arr1.append(elem)
      }
      arr1.toArray
    }
    var arr1 = filter(Array(1, 2, 3, 4), _ % 2 == 1)
    println(arr1.mkString(","))


    // （3）reduce 聚合。有多个参数，且每个参数再后面只使用一次，则参数省略且后面参数用_表示,第 n 个_代表第 n 个参数
    def reduce(arr: Array[Int],op: (Int,Int)=>Int)={

      var init:Int = arr(0)
      for (elem <- 1 until arr.length) {


       init =  op(init,elem)
      }
       init
    }

    val arr2 = reduce(Array(1, 2, 3, 4, 5, 6, 7, 8, 9), _ * _)
    println(arr2)
  }
  def foo(): Unit = {
    println("123")
  }

  def foo2(): Int = {
  var  a = 1
    return a;
  }
}

