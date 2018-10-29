package garage

class Customer(fName:String, lName:String) extends Person(fName:String, lName:String) {
  class cust(val fName: String, val lName:String, val address:String, val number:Char) {
    println("A new customer has been added to the system.\n " + fName + " " + lName)

    def this(address: String) = {
      this(address, "", "", ' ')
    }
    def this(address: String, number:Char) = {
      this(address, "", "", ' ')
    }
    def details() ={
      println(fName + " " + lName + " their address: " + address)
    }


  }

}
