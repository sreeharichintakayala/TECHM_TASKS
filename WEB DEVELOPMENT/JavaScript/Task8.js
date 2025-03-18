function isJanFirstSunday(year){
    const date = new Date(year,0,1);
    const dayOfWeek = date.getDay();
    return dayOfWeek == 0;
}
for (let year = 2014;year <= 2050;year++){
    if(isJanFirstSunday(year)){
        console.log(`January 1st,${year} is a Sunday`);
    }
}