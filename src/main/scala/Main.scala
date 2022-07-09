import config1._
object Main extends App {
    val r = requests.get("https://api.github.com/users/lihaoyi")
    println(r.statusCode)
    //println(r.headers("content-type"))
    //println(r.text)
    val p1 = config1.profile1.name
    println(p1)


  }
