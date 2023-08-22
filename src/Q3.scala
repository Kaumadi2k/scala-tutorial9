class Account(val name: String, var balance: Double) {

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount
  }

  def transfer(otherAccount: Account, amount: Double): Unit = {
    this.withdraw(amount)
    otherAccount.deposit(amount)
  }
}

object Account {
  def main(args: Array[String]): Unit = {
    val account1 = new Account("John Doe", 1000)
    val account2 = new Account("Jane Doe", 500)

    account1.transfer(account2, 500)

    println(account1.balance) // 500
    println(account2.balance) // 1000
  }
}

