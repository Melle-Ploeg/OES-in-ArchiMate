class Findmoneyonthestreet extends eVENT { 
   constructor({delay, BankAccount}) {
       super(delay);
       this.BankAccount = BankAccount;
    } 

   onEvent() {
       var followUpEvents = [];
       this.BankAccount.Balance = this.BankAccount.Balance + 10.0;
       sim.stat.BankAccountBalance = sim.stat.BankAccountBalance + 10.0;
       return followUpEvents;
   }
}