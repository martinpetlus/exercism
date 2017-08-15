object Hamming {
  def distance(s1: String, s2: String): Option[Int] = {
    if (s1.length != s2.length) return None

    val diff = s1.zip(s2).filter ({ case (n1, n2) => n1 != n2 })

    Some(diff.length)
  }
}
