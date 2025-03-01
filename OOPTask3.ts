class Car{
    make : string;
    model : string;
    year : number;
    constructor(make : string, model : string,year : number){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    displayInfo():void{
        console.log(`Car : ${this.year} ${this.make} ${this.model}`);
    }
}
class SUV extends Car{
    private isOffRoadCapable : boolean;
    constructor(make : string,model : string,year : number, isOffRoadCapable : boolean = false){
        super(make,model,year);
        this.isOffRoadCapable = isOffRoadCapable;
    }
    toggleOffRoadCapability() : void{
        this.isOffRoadCapable = !this.isOffRoadCapable;
        const status = this.isOffRoadCapable ? "enables" : "disabled";
        console.log(`Off-road capability has been ${status} for ${this.year} ${this.make} ${this.model}`)
    }
    displayOffRoadStatus() : void{
        const status = this.isOffRoadCapable ? "is" : "is not";
        console.log(`This SUV ${status} suitable for off-road driving`);
    }
}
const carObj = new SUV("StarkIndustries","Competition",2035,true);
// carObj.toggleOffRoadCapability();
carObj.displayOffRoadStatus();