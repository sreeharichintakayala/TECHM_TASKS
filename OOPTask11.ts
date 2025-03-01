class Shape{
    color : string;
    constructor(color:string){
        this.color = color;
    }
    draw() : void{
        console.log(`The preferred Shape is being drawn of color ${this.color}`);
    }
}
class Circle extends Shape{
    constructor(color:string){
        super(color);
    }
    draw(): void {
        console.log(`Circle is being drawn of color ${this.color}`);
    }
}
var o : Circle = new Circle("RED");
o.draw();