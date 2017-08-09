import collection.immutable.SortedMap

class School {
  type DB = Map[Int, Seq[String]]

  private var database: DB = SortedMap[Int, Seq[String]]().withDefaultValue(Seq())

  def add(name: String, g: Int) = database += g -> (database(g) :+ name)

  def db: DB = database

  def grade(g: Int): Seq[String] = database(g)

  def sorted: DB = database.mapValues(_.sorted)
}
