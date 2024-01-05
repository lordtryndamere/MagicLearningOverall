function isValidParentheses(input) {
    const stack = [];

    for (const char of input) {
        if (char === '(') {
            stack.push(char);
        } else if (char === ')') {
            if (stack.length === 0 || stack.pop() !== '(') {
                return 'invalid';
            }
        }
    }
    return stack.length === 0 ? 'valid' : 'invalid';
}

console.log(isValidParentheses("()"));
console.log(isValidParentheses("(hello, world)"));
console.log(isValidParentheses("Random text (as this) is ok()."));
console.log(isValidParentheses(")("));
console.log(isValidParentheses("(Hello (,) world (!))"));
