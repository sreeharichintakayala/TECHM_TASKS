function numberMatch(num){
    const randomNumber = Math.random(1,10);
    if(num == randomNumber){
        console.log('Good Work');
    }else{
        console.log('Not Matched');
    }
}
var num = prompt('Enter a number');
numberMatch(num);