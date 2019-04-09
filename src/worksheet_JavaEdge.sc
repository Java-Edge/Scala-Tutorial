object worksheet_JavaEdge{

  val l = List("JavaEdge", "Spark", "Scala")

  for (
    s <- l //generator 循环遍历 l 中的元素，赋值给 s
  ) println(s)

  for (
    s <- l
    if (s.length > 5) //filter 过滤
  ) println(s)

  val result_for = for {
    s <- l //generator
    s1 = s.toUpperCase() //variable binding
    if (s1 != "")
  } yield (s1)
  
}



