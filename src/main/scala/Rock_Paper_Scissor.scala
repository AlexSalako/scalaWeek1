import scala.io.StdIn.readLine

object Rock_Paper_Scissor {
  def user_choice()={
    var userInput = readLine("Enter a choice (Rock/Paper/Scissors): ")
    userInput.toLowerCase
    if(userInput == "rock" || userInput == "paper" || userInput == "scissors"){
      userInput
    } else {
      "Error"
    }
  }

  def getComputerChoice() = {

    Math.floor(Math.random()*3) match {
      case 0 => println("rock")
      case 1 => println("paper")
      case 2 => println("scissors")
    }
  }
  def determineWinner(userChoice: String, computerChoice: String) {
    if(userChoice == computerChoice) {
       "The game was a tie"
    }
    if(userChoice == "rock" && computerChoice == "paper") {
      "Computer won this round!"
    } else {
       "You won!"
    }
    if(userChoice == "scissors" && computerChoice == "rock") {
      "Computer won this round!!"
    } else {
       "You Won!"
    }

    if(userChoice == "paper" && computerChoice == "scissors"){
      "Computer won this round"
    } else {
       "You Won"
    }
  }
}







