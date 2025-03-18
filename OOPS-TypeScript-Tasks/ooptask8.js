var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
        // this.age = age;
    }
    return Student;
}());
var sob = new Student("Ravi", -5);
console.log(sob.age);
console.log(sob.name);
