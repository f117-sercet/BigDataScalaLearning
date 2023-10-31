package chapter03

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2023/10/30 8:39
 */
object FuncMethod {

  def main(args: Array[String]): Unit = {

    // (1) 可变参数
    def test(s: String*): Unit = {
      println(s)
    }

    // (2) 有输入参数：输出Array
    test("Hello", "Scala")

    // 无输入参数：输出 List()
    test()

    // (3)如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def test2(name: String, s: String*): Unit = {
      println(name + "," + s)
      test2("jinlian", "dalang")
    }

    // (3)参数默认值
    def test3(name: String, age: Int = 30): Unit = {

      println(s"$name, $age")
    }
    // 如果参数传递了值，那么会覆盖默认值
    test3("jinlian", 20)
  }


  //（4） return 可以省略,Scala 会使用函数体的最后一行代码作为返回值
  def f1(s: String): String = {
    s + " jinlian"
  }

  println(f1("Hello"))

  //*(5) 如过函数体只有一行代码，可以省略花括号
  def f2(s: String): String = s + "hello"

  println(f2("123"))

  //（6）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起 省略）
  def f3(s: String) = s + " jinlian"

  println(f3("Hello3"))

  //(7) 如果有return,则不能省略返回值类型,必须指定
  def f4(): String = {
    return "String"
  }

  println(f4())

  //（6）Scala 如果期望是无返回值类型,可以省略等号
  // 将无返回值的函数称之为过程
  def f6() {
    "dalang6"
  }

  println(f6())

  def f7 = (x: String) => {
    println("wusong")
  }

  def f10(f: String => Unit) = {
    f("")
  }

}