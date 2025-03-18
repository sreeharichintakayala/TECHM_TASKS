var Student = /** @class */ (function () {
    function Student(name, std) {
        this.name = name;
        this.std = std;
    }
    return Student;
}());
var stdObj = new Student("Raj", "VII");
console.log(stdObj.name);
console.log(stdObj.std);
