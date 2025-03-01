class Student{
    name : string;
    std : string;
    constructor(name : string,std : string){
        this.name  = name;
        this.std = std;
    }
}
var stdObj : Student = new Student("Raj","VII")
console.log(stdObj.name);
console.log(stdObj.std)