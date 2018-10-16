package garage

class Garage {
  class Car(val name: String, val model:String, val colour:String, val gender:Char) {
    println("A new car has been added. Make: " + name + " Model: " + model)

    def this(name: String) {
      this(name, "", "", ' ')
    }
  }
}
