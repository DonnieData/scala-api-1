
object Main extends App with requests {
    val r = requests.get("https://api.github.com/users/lihaoyi")
    println(r.statusCode)
    println(r.headers("content-type"))
    println(r.text)

  }
