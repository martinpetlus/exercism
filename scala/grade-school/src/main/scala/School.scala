import collection.mutable.Map
import collection.mutable.SortedMap

class School {
  type DB = Map[Int, Seq[String]]

  private val database: DB = Map()

  def add(name: String, g: Int) = {
    val names = database.getOrElse(g, Seq())
    database(g) = names :+ name
  }

  def db: DB = database.clone

  def grade(g: Int): Seq[String] =
    database.getOrElse(g, Seq())

  def sorted: DB =
    SortedMap {
      database.toSeq.map {
        case (g, names) => (g, names.sorted)
      }.sortBy(_._1):_*
    }
}
