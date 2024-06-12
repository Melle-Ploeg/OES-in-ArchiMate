class Salary extends eVENT {
    constructor({delay, BankAccount}) {
        super(delay);
        this.bankAccount = BankAccount;
    }

    onEvent() {
        console.log("Salary!")
        var followUpEvents = [];
        this.bankAccount.balance += 100;
        sim.stat.balance += 100;
        sim.stat.salary += 1;
        followUpEvents.push(new Rent({BankAccount: this.bankAccount}));
        return followUpEvents;
    }

    createNextEvent() {
        return new Salary({delay: Salary.recurrence(), BankAccount: this.bankAccount})
    }

    static recurrence() {
        return 5;
    }

}