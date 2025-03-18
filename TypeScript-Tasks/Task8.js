var arr = [1, 2, 3];
console.log("Original array is ".concat(arr));
arr.push(4, 5, 6);
console.log("Updated array is ".concat(arr));
var i = 0;
for (i in arr) {
    console.log(arr[i]);
}
