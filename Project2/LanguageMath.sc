
val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

def translate(myList: List[String]) : List[Int] = {
  myList.map{
    case ("zero") => 0
    case ("ling") => 0
    case ("one") => 1
    case ("yi") => 1
    case ("two") => 2
    case ("er") => 2
    case ("three") => 3
    case ("san") => 3
    case ("four") => 4
    case ("si") => 4
    case ("five") => 5
    case ("wu") => 5
    case ("six") => 6
    case ("liu") => 6
    case ("seven") => 7
    case ("qi") => 7
    case ("eight") => 8
    case ("ba") => 8
    case ("nine") => 9
    case ("jiu") => 9
    case ("ten") => 10
    case ("shi") => 10
  }

}

def addition(myList: List[String]) : Int = {

  translate(myList)
  myList.foldLeft(0)(_+_)

}


def go(myList: List[String]) : Unit =  {

  println("Translate: " + translate(myList))
  println("Addition: " + addition(myList))

}


