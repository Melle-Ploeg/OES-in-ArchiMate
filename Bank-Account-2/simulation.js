/*******************************************************
 Simulation Scenario Settings
 ********************************************************/
sim.scenario.durationInSimTime = 10;
/*******************************************************
 Simulation Model
 ********************************************************/
sim.model.time = "discrete";
sim.model.timeUnit = "min";
sim.model.objectTypes = ["BankAccount"];
sim.model.eventTypes = ["Salary", "Rent", "GoToThePub"];
/*******************************************************
 Initial State
 ********************************************************/
sim.scenario.setupInitialState = function () {
    // Create initial objects
    var bankAccount = new BankAccount({id: 1, name: "bankAccount"});
    // Schedule initial events
    sim.FEL.add( new Salary({delay:0, BankAccount: bankAccount}));
}
/*******************************************************
 Statistics variables
 ********************************************************/
sim.model.setupStatistics = function () {
    sim.stat.balance = 0;
    sim.stat.salary = 0;
    sim.stat.rent = 0;
    sim.stat.pub = 0;
};
/*******************************************************
 Define an experiment (type)
 ********************************************************/
/*
sim.experimentType = {
  title: `Simple Experiment with 10 replications, each running for ${sim.scenario.durationInSimTime} ${sim.model.timeUnit}.`,
  nmrOfReplications: 10
};
*/
