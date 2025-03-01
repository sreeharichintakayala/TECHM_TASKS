class Shape{
    color : string;
    constructor(color : string){
        this.color = color;
    }
}
class Circle extends Shape{
    radius : number;
    constructor(color : string,radius : number){
        super(color);
        this.radius = radius;
    }
}
var ob : Circle  = new Circle("red",5.4);
console.log(`Color of the circle is ${ob.color} \n Radius of the circle is ${ob.radius}`)