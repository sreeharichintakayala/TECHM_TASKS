var Student1 = /** @class */ (function () {
    function Student1(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    Student1.prototype.displayDetails = function () {
        if (this.rollNumber !== undefined) {
            console.log("Student Name : ".concat(this.name, " , RollNumber : ").concat(this.rollNumber));
        }
        else {
            console.log("Student Name : ".concat(this.name, " Roll Number : Unknown"));
        }
    };
    return Student1;
}());
var stdObj1 = new Student1("Raj");
stdObj1.displayDetails();
// console.log(stdObj.name);
// console.log(stdObj.std)
