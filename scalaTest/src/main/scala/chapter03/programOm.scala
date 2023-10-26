package chapter03

import java.util

/**
 * Description： TODO
 *
 * @author: 段世超
 * @aate: Created in 2023/10/26 16:57
 */

// 面向对象编程
object programOm {
  def main(args: Array[String]): Unit = {

    var arrars: util.ArrayList[String] = new util.ArrayList[String]

    arrars.add("1")
    arrars.add("1")
    arrars.add("1")
    arrars.add("1")
    arrars.add("1")
    arrars.add("1")

    arrars.forEach(s=>printf("%s",s))

  }
}

