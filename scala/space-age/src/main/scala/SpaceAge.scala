import math.round;

case class SpaceAge(val seconds: Long) {
  private def computeAge(times: Double): Double = {
    val ageOnEarth = seconds / 31557600.0
    round((ageOnEarth / times) * 100.0) / 100.0
  }

  val onEarth: Double = computeAge(1.0)
  val onMercury: Double = computeAge(0.2408467)
  val onVenus: Double = computeAge(0.61519726)
  val onMars: Double = computeAge(1.8808158)
  val onJupiter: Double = computeAge(11.862615)
  val onSaturn: Double = computeAge(29.447498)
  val onUranus: Double = computeAge(84.016846)
  val onNeptune: Double = computeAge(164.79132)
}
