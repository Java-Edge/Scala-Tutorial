package chapter1

/**
  * @author sss
  * @date 2019/1/24
  *
  */
object func_examples {

  def hello(name: String): String = {
    s"Hello, ${name}"
  }

  hello("JavaEdge")

  def add(x: Int, y: Int) = x + y

  add(1, 2)

}



