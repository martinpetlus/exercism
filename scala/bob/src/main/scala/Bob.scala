object Bob {
  val yell = "^[^a-z]*[A-Z]+[^a-z]*$".r
  val question = raw".*\? *".r
  val silence = raw"[ \t\n]*".r

  def response(statement: String): String = statement match {
    case silence(_*) => "Fine. Be that way!"
    case yell(_*) => "Whoa, chill out!"
    case question(_*) => "Sure."
    case _ => "Whatever."
  }
}
