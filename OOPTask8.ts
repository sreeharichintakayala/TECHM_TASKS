class Student{
    name : string;
    age : number;
    constructor(name : string,age : number){
        this.name = name;
        if(age < 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }
        // this.age = age;
    }
}
var sob : Student = new Student("Ravi",-5)
console.log(sob.age);
console.log(sob.name);