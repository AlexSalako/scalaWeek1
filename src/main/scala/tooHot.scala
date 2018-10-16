class tooHot(temp:Int, isSummer: Boolean) {

  object hot extends App {
    if(temp == 91 & temp >= 100 && isSummer == true){
      true
    } else if(temp > 60 & temp >= 90){
      false
    }

  }

}
