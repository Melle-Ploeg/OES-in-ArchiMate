class Salary extends eVent { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.Salary.Balance = this.Salary.Balance + 100.0;
       sim.stat.SalaryBalance = sim.stat.SalaryBalance + 100.0;
       if(Math.random() < null) {
            followUpEvents.push(new Rent({null: this.null}));
       }
       return followUpEvents;
   }
    createNextEvent() {
       return new Salary({delay: Salary.recurrence(), BankAccount: this.BankAccount});
    }
    static recurrence() {
        return 5;
    }
}