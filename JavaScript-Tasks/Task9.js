const { time } = require("console");

function daysUntilChristmas(){
    const today = new Date();
    const currentYear = today.getFullYear();
    const christmas = new Date(currentYear,11,25);
    if ( today > christmas){
        christmas.setFullYear(currentYear + 1);
    }
    const timeDiff = christmas - today;
    const daysLeft = Math.ceil(timeDiff/(1000 * 60 * 60 * 24));
    return daysLeft;
}
console.log(`Days left until Christmas:${daysUntilChristmas()}`);