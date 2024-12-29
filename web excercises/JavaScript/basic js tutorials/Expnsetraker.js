function main() {
    class ExpenseTracker {
      #expenses = [];
      #income;
  
      constructor(income) {
        this.#income = income;
      }
  
      #calculateTotalExpenses() {
        return this.#expenses.reduce((total, expense) => total + expense.amount, 0);
      }
  
      addExpense(name, amount, date) {
        this.#expenses.push({ name, amount, date });
      }
  
      calculateBalance() {
        return this.#income - this.#calculateTotalExpenses();
      }
    }
  
    const tracker = new ExpenseTracker(5000);
    tracker.addExpense("Rent", 1000, "2021-10-01");
    tracker.addExpense("Groceries", 500, "2021-10-02");
    console.log(tracker.calculateBalance()); // should output 3500
  
    return ExpenseTracker;
  }
  
  main();
  