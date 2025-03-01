class Bus{
    make : string;
    model : string;
    year : number;
    constructor(make : string,model : string,year : number){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
var busObj = new Bus("BusIndustries","IF7",2025);
console.log(busObj.make);
console.log(busObj.model);
console.log(busObj.year);