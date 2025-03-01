var Bus = /** @class */ (function () {
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Bus;
}());
var busObj = new Bus("BusIndustries", "IF7", 2025);
console.log(busObj.make);
console.log(busObj.model);
console.log(busObj.year);
