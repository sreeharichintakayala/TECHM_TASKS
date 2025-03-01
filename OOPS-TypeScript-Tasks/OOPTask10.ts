class Person{
    name : string;
    age : number;
    constructor(name : string,age : number){
        this.name = name;
        this.age = age
    }
}
class Employee extends Person{
    empId : number;
    constructor(name : string,age : number,empId : number){
        super(name,age);
        this.empId = empId;
    }
}
var ob : Employee = new Employee("Cyrus",45,1000);
console.log(ob.name)
console.log(ob.age)
console.log(ob.empId);