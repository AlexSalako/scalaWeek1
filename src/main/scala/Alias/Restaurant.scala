package Alias

abstract class Restaurant {
  type SuitableDishes
  def customerCanEatMeal(meal: SuitableDishes)
}

class Vegetarian {
  override def toString: String = "I only eat vegetarian meals"
}

class Vegan {
  override def toString: String = "I don't eat animal based meals or products"
}

class Meat {
  override def toString: String = "I can eat anything!"
}

class VeganCustomer extends Restaurant {
  type SuitableDishes = (Vegan)
  override def customerCanEatMeal(meal: Vegan): Unit = println(meal.toString)
}

class Customer extends Restaurant {
  type SuitableDishes = (Vegetarian, Vegan, Meat)
  override def customerCanEatMeal(meal: (Vegetarian, Vegan, Meat)): Unit = meal.productIterator.foreach(meal => println(meal))
}
