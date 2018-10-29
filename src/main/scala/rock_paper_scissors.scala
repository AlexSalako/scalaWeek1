import scala.io.StdIn.readLine

object rock_paper_scissors extends App{
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
  def playGame() = {
    val userChoice = user_choice()
    val computerChoice = getComputerChoice()
    println("You threw: " + userChoice)
    println("The computer threw: " + computerChoice)

    if(userChoice == computerChoice) {
      println("The game was a tie")
    }
    if(userChoice == "rock" && computerChoice == "paper") {
      println("Computer won this round!")
    } else {
      println("You won!")
    }
    if(userChoice == "scissors" && computerChoice == "rock") {
      println("Computer won this round!!")
    } else {
      println("You Won!")
    }

    if(userChoice == "paper" && computerChoice == "scissors"){
      println("Computer won this round")
    } else {
      println("You Won")
    }

  }
  playGame()
}
