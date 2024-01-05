function isAdditiveNumber(s) {
    function isAdditive(index, num1, num2) {
        if (index === s.length) {
            return true;
        }

        for (let i = index + 1; i <= s.length; i++) {
            const num3Str = s.substring(index, i);


            if (num3Str.length > 1 && num3Str[0] === '0') {
                continue;
            }

            const num3 = parseInt(num3Str);


            if (num3 === num1 + num2 && isAdditive(i, num2, num3)) {
                return true;
            }
        }

        return false;
    }
    for (let i = 1; i < s.length; i++) {
        const num1Str = s.substring(0, i);
        if (num1Str.length > 1 && num1Str[0] === '0') {
            continue;  // Salta ceros iniciales
        }

        const num1 = parseInt(num1Str);

        for (let j = i + 1; j < s.length; j++) {
            const num2Str = s.substring(i, j);
            if (num2Str.length > 1 && num2Str[0] === '0') {
                continue;  // Salta ceros iniciales
            }

            const num2 = parseInt(num2Str);

            if (isAdditive(j, num1, num2)) {
                return true;
            }
        }
    }

    return false;
}


console.log(isAdditiveNumber("112358"));
console.log(isAdditiveNumber("199100199"));
console.log(isAdditiveNumber("123"));
console.log(isAdditiveNumber("1023"));
