// Given a number n, find all the prime numbers that are smaller or equal to n
// a prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
// Example 1: 7 -> [2, 3, 5, 7]
// Example 2: 2 -> [2]


function isPrime(num) {
    if(num <=1) return false;
    if(num === 2 || num === 3) return true;
    if(num % 2 === 0 || num % 3 === 0) return  false;
    //"6k - 1" y "6k + 1",
    for(let i = 5; i * i <= num; i+=6){
        if(num % i === 0 || num % (i + 2) === 0) return false;
    }


    return true;

}
[2, 4, 5, 7].filter(num=> {
return isPrime(num) && num <= 7;
}).forEach(num=>console.log(num));

