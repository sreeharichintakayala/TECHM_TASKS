class Vehicle{
    make : string;
    model : string;
    constructor(make : string,model : string){
        this.make = make;
        this.model = model;
    }
}
class Car extends Vehicle{
    constructor(make : string,model : string){
        super(make,model)
    }
}
class SportsCar extends Car{
    constructor(make : string,model : string){
        super(make,model);
    }
}
var obb : SportsCar = new SportsCar("ITLIMITED","PHANTOM");
console.log(obb.make);
console.log(obb.model)