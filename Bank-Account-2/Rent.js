class Rent extends eVENT {
    constructor({BankAccount}) {
        super({delay: 0});
        this.bankAccount = BankAccount;
    }

    onEvent() {
        console.log("Rent!")
        var followUpEvents = [];
        this.bankAccount.balance -= 80;
        sim.stat.balance -= 80;
        sim.stat.rent += 1;
        if (math.getUniformRandomInteger(1, 10) > 7) {
            followUpEvents.push(new GoToThePub({BankAccount: this.bankAccount}));
        }
        return followUpEvents;
    }
}