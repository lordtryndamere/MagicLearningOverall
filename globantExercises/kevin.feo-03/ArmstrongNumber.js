function isArmstrongNumber(num) {
    const numStr = num.toString();
    const numDigits = numStr.length;

    let sum = 0;
    for (let i = 0; i < numDigits; i++) {
        const digit = parseInt(numStr[i]);
        sum += Math.pow(digit, numDigits);
    }
    return sum === num;
}

console.log(isArmstrongNumber(153));  // true
console.log(isArmstrongNumber(371));  // true
console.log(isArmstrongNumber(407));  // true
console.log(isArmstrongNumber(8208)); // true
console.log(isArmstrongNumber(123));  