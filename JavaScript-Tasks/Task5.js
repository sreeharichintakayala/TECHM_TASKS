
function rotateStringRight(str) {
    return str.charAt(str.length - 1) + str.slice(0, -1);
}
let str = 'digiterati';
const rotations = 10;
for (let i = 0; i < rotations; i++) {
    str = rotateStringRight(str);
    console.log(`Rotation ${i + 1}: ${str}`);
}