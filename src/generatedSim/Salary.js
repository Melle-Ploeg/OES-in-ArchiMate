class Salary extends eVENT { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.BankAccount.Balance = this.BankAccount.Balance + 100.0;
       sim.stat.BankAccountBalance = sim.stat.BankAccountBalance + 100.0;
       if(Math.random() < 1.0) {
            followUpEvents.push(new Rent({BankAccount: this.BankAccount}));
       }
       return followUpEvents;
   }
}