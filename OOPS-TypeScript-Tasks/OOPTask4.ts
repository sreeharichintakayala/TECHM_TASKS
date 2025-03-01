
class Engine {
    horsepower: number;
    fuelType: string;

    constructor(horsepower: number, fuelType: string) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    displayEngineDetails(): void {
        console.log(`Engine: ${this.horsepower} HP, ${this.fuelType}`);
    }
}
class Car11 {
    make: string;
    model: string;
    year: number;
    engine: Engine; // Instance of the Engine class

    constructor(make: string, model: string, year: number, engine: Engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    start(): void {
        console.log(`The ${this.year} ${this.make} ${this.model} is starting...`);
    }

    printCarDetails(): void {
        console.log(`Car Details:`);
        console.log(`Make: ${this.make}`);
        console.log(`Model: ${this.model}`);
        console.log(`Year: ${this.year}`);
        this.engine.displayEngineDetails(); // Display engine details
    }
}
// Create an instance of Engine
const myEngine = new Engine(300, "Petrol");

// Create an instance of Car with the Engine
const myCar = new Car11("Toyota", "Camry", 2023, myEngine);

// Start the car
myCar.start();

// Print car and engine details
myCar.printCarDetails();