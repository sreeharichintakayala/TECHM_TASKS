// class Engine{
//     horsePower : string;
//     fuelType : string;
//     constructor(horsePower : string,fuelType : string){
//         this.horsePower = horsePower;
//         this.fuelType  = fuelType;
//     }
//     displayEngineDetails() : void{
//         console.log(`Engine : \n HorsePower : ${this.horsePower}HP \n Fuel : ${this.fuelType}`);
//     }
// }
// class Car1 extends Engine{
//     make : string;
//     model : string;
//     year : number;
//     engine : Engine;
//     constructor(make : string,model : string,year : number){
//         super();
//         // super(this.engine);
//         this.make = make;
//         this.model = model;
//         this.year = year;
//         // this.engine = engine;
//     }
//     start(){
//         console.log('Bus is Starting');
//         return "Bus started"
//     }
//     printCarDetails() : void{
//         console.log(`Car Details : `);
//         console.log(`Make : ${this.make} \n Model : ${this.model} \n Year : ${this.year}`);
//         this.engine.displayEngineDetails.
//     }
// }
// var eng : Engine = new Engine("1230","PowerPetrol");
// var obj11 : Car1 = new Car1(
//     "IT",
//     "Competition",
//     2080,
//     eng
// );
var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    Engine.prototype.displayEngineDetails = function () {
        console.log("Engine: ".concat(this.horsepower, " HP, ").concat(this.fuelType));
    };
    return Engine;
}());
var Car11 = /** @class */ (function () {
    function Car11(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Car11.prototype.start = function () {
        console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is starting..."));
    };
    Car11.prototype.printCarDetails = function () {
        console.log("Car Details:");
        console.log("Make: ".concat(this.make));
        console.log("Model: ".concat(this.model));
        console.log("Year: ".concat(this.year));
        this.engine.displayEngineDetails(); // Display engine details
    };
    return Car11;
}());
// Create an instance of Engine
var myEngine = new Engine(300, "Petrol");
// Create an instance of Car with the Engine
var myCar = new Car11("Toyota", "Camry", 2023, myEngine);
// Start the car
myCar.start();
// Print car and engine details
myCar.printCarDetails();
