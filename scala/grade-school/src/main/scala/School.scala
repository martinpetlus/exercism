import collection.mutable.Map
import collection.mutable.SortedMap

class School {
  type DB = Map[Int, Seq[String]]

  private val database: DB = Map().withDefaultValue(Seq())

  def add(name: String, g: Int) = database += g -> (database(g) :+ name)

  def db: DB = database.clone

  def grade(g: Int): Seq[String] = database(g)

  def sorted: DB =
    SortedMap {
      database.toSeq.map {
        case (g, names) => (g, names.sorted)
      }.sortBy(_._1):_*
    }
}
