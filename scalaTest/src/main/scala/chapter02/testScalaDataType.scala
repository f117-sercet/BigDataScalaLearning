package chapter02

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2023/10/26 16:51
 */
object testScalaDataType {

    def main(args: Array[String]): Unit = {

      // 变量自动推导
      var a = 1

      //var 变量名 [: 变量类型] = 初始值 var i:Int = 10
      var p1 = new Person()
      p1.name = "Johns"
      System.out.println(p1.name)

      var n2:Any = 3
      val of = n2.toString
      println(of+"\n"+n2)
      /* (1)字符常量是用单引号
       ' ' 括起来的单个字符。*/
      var c1: Char = 'a'
      println("c1=" + c1)


      //（2）\t ：一个制表位，实现对齐的功能 println("姓名\t 年龄")
      //（3）\n ：换行符 println("西门庆\n 潘金莲")
      //（4）\\ ：表示\ println("c:\\岛国\\avi")
      //（5）\" ：表示"
      println("同学们都说：\"大海哥最帅\"")


      // 布尔类型
      //（1）布尔类型也叫Boolean 类型，Booolean 类型数据只允许取值 true 和 false
      // （2）boolean 类型占 1 个字节。

      var isResult : Boolean = false
      var isResult2 : Boolean = true

      /*************Unit****************/
      // 表示无值，和其他语言中 void 等同。用作不返回任何结果的方法的结果 类型。Unit 只有一个实例值，写成()。

      def sayOK:Unit={}
      println(sayOK)

      // TODO null
      // null , Null 类型只有一个实例值 null
      // Null 类只有一个实例对象，Null 类似于 Java 中的 null 引用。Null 可以赋值给任 意引用类型（AnyRef），但是不能赋值给值类型（AnyVal）
      var cat:String = ""
      var n1:Int = 0
      // Nothing
      //Nothing 类型在 Scala 的类层级最低端；它是任何其他类型的子类型。 当一个函数，我们确定没有正常的返回值，可以用 Nothing 来指定返回类 型，这样有一个好处，就是我们可以把返回的值（异常）赋给其它的函数 或者变量（兼容性）
      //可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方 法不会正常返回，而且由于Nothing 是其他任意类型的子类，他还能跟要求返回值的方法兼 容。
      def test():Nothing={
        throw new Exception()
      }
      test()
    }
  class Person {
    var name:String ="John"
  }
}

