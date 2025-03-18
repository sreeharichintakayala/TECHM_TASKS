function calculateTriangle(a,b,c){
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
}
var side1 = 5
var side2 = 6
var side3 = 7
console.log(`Area : ${calculateTriangle(side1,side2,side3)}`);