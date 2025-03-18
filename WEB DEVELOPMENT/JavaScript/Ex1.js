function displayCurrentDayandTime(){
    const days = [
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    ];
    const now = new Date();
    const day = days[now.getDay()];
    let hours = now.getHours();
    const minutes = now.getMinutes();
    const seconds = now.getSeconds();
    const ampm = hours >= 12 ? 'PM' : 'AM';
    hours = hours % 12;
    hours = hours ? hours : 12;
    const time = `${hours} ${ampm} : ${minutes} : ${seconds}`;
    console.log(`Today is : ${day}.`);
    console.log(`Current time is : ${time}`);
}
displayCurrentDayandTime();