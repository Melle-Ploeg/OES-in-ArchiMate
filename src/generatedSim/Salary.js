class Salary extends eVent { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.Salary.Balance = this.Salary.Balance + 100.0;
       sim.stat.SalaryBalance = sim.stat.SalaryBalance + 100.0;
       return followUpEvents;
   }
}