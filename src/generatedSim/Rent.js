class Rent extends eVENT { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.BankAccount.Balance = this.BankAccount.Balance - 80.0;
       sim.stat.BankAccountBalance = sim.stat.BankAccountBalance - 80.0;
       if(Math.random() < 0.2) {
            followUpEvents.push(new GoToThePub({BankAccount: this.BankAccount}));
       }
       if(Math.random() < 1.0) {
            followUpEvents.push(new Rent({BankAccount: this.BankAccount}));
       }
       return followUpEvents;
   }
}