class GoToThePub extends eVENT { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.BankAccount.Balance = this.BankAccount.Balance - 30.0;
       sim.stat.BankAccountBalance = sim.stat.BankAccountBalance - 30.0;
       if(Math.random() < 0.2) {
            followUpEvents.push(new GoToThePub({BankAccount: this.BankAccount}));
       }
       return followUpEvents;
   }
}