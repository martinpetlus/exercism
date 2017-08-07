import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {
  private val gigasecond = 1000000000L

  def addGigaseconds(startDate: LocalDate): LocalDateTime =
    addGigaseconds(startDate.atStartOfDay)

  def addGigaseconds(startDateTime: LocalDateTime): LocalDateTime =
    startDateTime.plusSeconds(gigasecond)
}
