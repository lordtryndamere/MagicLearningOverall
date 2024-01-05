function alphanumericStringSort(inputString) {
    const letters = [];
    const numbers = [];
    const specialChars = [];
    for (let char of inputString) {
        if (/[a-zA-Z]/.test(char)) {
            letters.push(char);
        } else if (/[0-9]/.test(char)) {
            numbers.push(char);
        } else {
            specialChars.push(char);
        }
    }
    letters.sort((a, b) => {
        const isUpperCaseA = a === a.toUpperCase();
        const isUpperCaseB = b === b.toUpperCase();

        if (isUpperCaseA !== isUpperCaseB) {
            return isUpperCaseA ? 1 : -1;
        }

        return a.localeCompare(b);
    });
    numbers.sort((a, b) => {
        const isOddA = parseInt(a) % 2 !== 0;
        const isOddB = parseInt(b) % 2 !== 0;

        if (isOddA !== isOddB) {
            return isOddA ? -1 : 1;
        }

        return parseInt(a) - parseInt(b);
    });

    return letters.join('') + numbers.join('') + specialChars.join('');
}

const sortedString = alphanumericStringSort("a1B3#2C");
console.log(sortedString);  // result: "aBC132#"
