class GoToThePub extends eVENT {
    constructor({BankAccount}) {
        super({delay: 0});
        this.bankAccount = BankAccount;
    }

    onEvent() {
        console.log("Pub!")
        this.bankAccount.balance -= 30;
        sim.stat.balance -= 30;
        sim.stat.pub += 1;
        return [];
    }
}