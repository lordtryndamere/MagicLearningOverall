// You are given an integer `num`. You can swap two digits at most once to get the maximum valued number.
// Return _the maximum valued number you can get_.
//**Example 1:**
// **Input:** num = 2736
// **Output:** 7236
// **Explanation:** Swap the number 2 and the number 7.
// **Example 2:**
// **Input:** num = 9973
// **Output:** 9973
// **Explanation:** No swap.
// 9917 -> 9971

function maximumSwap(num) {
    const digits = num.toString().split('').map(Number); // Convierte el número en una matriz de dígitos
    const n = digits.length;
    let maxDigit = -1; // Valor del dígito más grande a la derecha
    let maxDigitIndex = -1; // Índice del dígito más grande a la derecha
    let currentDigitIndex = -1; // Índice del dígito actual
    let swapIndex = -1; // Índice del dígito con el que se va a intercambiar

    // Recorre los dígitos de derecha a izquierda
    for (let i = n - 1; i >= 0; i--) {
        const currentDigit = digits[i];

        // Encuentra el dígito más grande a la derecha
        if (currentDigit > maxDigit) {
            maxDigit = currentDigit;
            maxDigitIndex = i;
        }

        // Si encontramos un dígito más pequeño a la derecha, registramos los índices para el intercambio
        if (currentDigit < maxDigit) {
            currentDigitIndex = i;
            swapIndex = maxDigitIndex;
        }
    }

    // Si encontramos un dígito más pequeño a la derecha, realizamos el intercambio
    if (currentDigitIndex !== -1) {
        [digits[currentDigitIndex], digits[swapIndex]] = [digits[swapIndex], digits[currentDigitIndex]];
    }

    // Convierte la matriz de dígitos en un número
    const result = parseInt(digits.join(''));

    return result;
}

// Ejemplo de uso
const num = 9917;
const result = maximumSwap(num);
console.log(result); // Debería imprimir 7236






