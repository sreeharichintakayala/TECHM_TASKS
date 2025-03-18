type User = {
    id : number;
    name : string;
    email : string;
    isActive : boolean;
};
type status = 'active' | 'inactive' | 'pending';
type GreetFunction = (name : string) => string;
const user : User = {
    id : 101,
    name : "sreehari",
    email : "cdevi3163@gmail.com",
    isActive : true,
};
const userStatus : status = 'active';
const greet : GreetFunction = (name) => {
    return `Hello, ${name}`;
};
console.log(user);
console.log(userStatus);
console.log(greet('SREEHARI'))