object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int =
    factors.flatMap((f) => f until limit by f).sum
}

