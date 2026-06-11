public class PaymentCard {
  private double balance;

  public PaymentCard(double openingBalance) {
    this.balance = openingBalance;
  }

  public String toString() {
    return "The card has a balance of " + this.balance + " euros";
  }

  public void eatAffordably() {
    if (this.balance >= 2.60) {
      this.balance = this.balance - 2.60;
    }
  }

  public void eatHeartily() {
    if (this.balance >= 4.60) {
      this.balance = this.balance - 4.60;
    }
  }

  public void addMoney(double amount) {
    double rest = 150 - this.balance;
    if (amount > 0) {
      if (this.balance < 150.0) {
        if (rest < amount) {
          this.balance += rest;
        } else {
          this.balance += amount;
        }
      }

    }

  }

}
