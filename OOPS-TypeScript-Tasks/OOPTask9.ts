class Animal{
    name : string;
    species : string;
    constructor(name : string,species : string){
        this.name = name;
        this.species = species;
    }

}
class Tiger extends Animal{
    constructor(name : string,species : string){
        super(name,species)

    }
    roar(){
        console.log("Tiger Roars")
    }
}
var Tob : Tiger  = new Tiger("Tiger","carnivores");
Tob.roar();
