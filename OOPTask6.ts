class Student1{
    name : string;
    rollNumber : number;
    constructor(name : string,rollNumber :number);
    constructor(name : string);
    constructor(name : string,rollNumber ? : any){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    displayDetails() : void{
        if(this.rollNumber !== undefined){
            console.log(`Student Name : ${this.name} , RollNumber : ${this.rollNumber}`);

        }else{
            console.log(`Student Name : ${this.name} Roll Number : Unknown`);
        }
    }
}
var stdObj1 : Student1 = new Student1("Raj")
stdObj1.displayDetails();
// console.log(stdObj.name);
// console.log(stdObj.std)