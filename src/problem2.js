/*
Project Euler #2

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 */
console.log('Project Euler #2');

function* fibonacciGenerator() {
    let a = 0, b = 1;
    while (true) {
        yield a;
        [a, b] = [b, a + b];
    }
}

function fibonacciWithCondition(limit) {
    const generator = fibonacciGenerator();
    let sumEven = 0;

    for (const value of generator) {
        if (value % 2 === 0) {
            sumEven += value;
        }
        if (sumEven > limit) {
            break;
        }
    }

    return sumEven;
}

console.log("Sum:", fibonacciWithCondition(4_000_000));