// const readline = require('readline');
// const r1 = readline.createInterface({
//     input : process.stdin,
//     output : process.stdout
// });
// function isLeapYear(year){
//     if(year % 4 == 0){
//         if(year % 100 == 0){
//             if(year % 400 == 0){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }else{
//             return true;
//         }
//     }else{
//         return false;
//     }
// }
// r1.question("Enter a year: ",(input) => {
//     const year = parseInt(input);
//     if(isNaN(year)){
//         console.log('Please enter a valid year');
//     }else{
//         if(isLeapYear(year)){
//             console.log(`${year} is a leap year`);
//         }else{
//             console.log(`${year} is not a leap year`);
//         }
//     }
//     r1.close();
// });
const readline = require('readline');

// Create an interface for reading input
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function isLeapYear(year) {
    if (year % 4 === 0) {
        if (year % 100 === 0) {
            if (year % 400 === 0) {
                return true; // Leap year
            } else {
                return false; // Not a leap year
            }
        } else {
            return true; // Leap year
        }
    } else {
        return false; // Not a leap year
    }
}

// Ask the user for input
rl.question("Enter a year: ", (input) => {
    const year = parseInt(input);

    // Check if the input is a valid number
    if (isNaN(year)) {
        console.log("Please enter a valid year.");
    } else {
        if (isLeapYear(year)) {
            console.log(`${year} is a leap year.`);
        } else {
            console.log(`${year} is not a leap year.`);
		  }
    }

    // Close the readline interface
    rl.close();
});