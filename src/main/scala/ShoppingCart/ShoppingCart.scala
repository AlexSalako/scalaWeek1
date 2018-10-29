package ShoppingCart;

import scala.collection.mutable

class ShoppingCart(val products: Map[String, Item], val offer: Map[String, Offer]) {

  var total = BigDecimal("0.0")
  val items = mutable.MutableList[Item]()
  def Add(item: String) = {
    products(item) match {
      case i: Item =>
        total += i.price
        items += i
    }
    offer.get(item) match {
      case o: Some[Discount] => items +=
      case None =>
    }
  }
}

object ShoppingCart {
  def show(): ShoppingCart = {
    new ShoppingCart(Map("apple" -> Item(0.6, "apple"), "orange" -> Item(0.25, "orange")), Map("apple" -> Discount(Item)));
  }
}

