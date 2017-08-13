object Raindrops {
  def convert(n: Int): String = {
    val result = List((3, "Pling"), (5, "Plang"), (7, "Plong")).foldLeft("") {
      case (acc, (factor, string)) => (n % factor) match {
        case 0 => acc + string
        case _ => acc
      }
    }

    if (result == "") n.toString else result
  }
}
