

let firstNumber = 0;
let secondNumber = 1;
console.log(firstNumber);
console.log(secondNumber);


for (let i = 0; i < 10; i++){
    let nextNewNumber = firstNumber + secondNumber
    console.log(nextNewNumber)
    firstNumber = secondNumber;
    secondNumber = nextNewNumber;
}

// Single Thread
// Async/Await

// CallStack
// EventLoop

// Data Structures Algorithms
// Big O Notation
// Time complexity
// Space complexity
//Arrays,LinkedList,Stacks, Map, Sets,     Objects
//HashMap
//HashSet
// new Map();
// new Set();

// Promises
// Object // reject, resolved,pending
// Promise.all() && Promise.race();
// Native Modules
// Closures
// Interface && Abstract class
// What's NodeJS ?
// What's SOLID ?
// S : Single object responsibility
// O : Open Closed,
// Distributed Architectures
function main() {
    const name = "hola";
    function closure(){
        console.log(name)

    }
}

const id = setTimeout(()=>{
    console.log('first')
},5000)

setTimeout(()=>{
    clearTimeout(id)
    console.log("second")
},2000)
