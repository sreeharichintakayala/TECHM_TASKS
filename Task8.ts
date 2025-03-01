let arr: number[] = [1,2,3];
console.log(`Original array is ${arr}`);
arr.push(4,5,6);
console.log(`Updated array is ${arr}`);
var i : any = 0;
for(i in arr){
    console.log(arr[i]);
}