object Pangrams {
  def isPangram(input: String): Boolean = {
    val inputInLowerCase = input.toLowerCase
    ('a' to 'z').forall(inputInLowerCase.contains(_))
  }
}
