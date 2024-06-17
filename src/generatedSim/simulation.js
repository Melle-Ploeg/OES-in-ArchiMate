sim.scenario.durationInSimTime = 10;
sim.model.time = "discrete";
sim.model.timeUnit = "min";

sim.model.objectTypes = ["BankAccount"];
sim.model.eventTypes = ["Salary", "Rent", "GoToThePub"];
sim.scenario.setupInitialState = function () {
    var BankAccount = new BankAccount({id: "id-369163e55b7a4bc2b87629ba91edb51c", name: "BankAccount"});
    sim.FEL.add(new Salary({delay:0, BankAccount: this.BankAccount}));
}
sim.model.setupStatistics = function() {
    sim.stat.BankAccountBalance = 0.0;
};
