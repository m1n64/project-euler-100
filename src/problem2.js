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