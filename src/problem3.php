<?php
/*
 * Project Euler #3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
echo "Project Euler #3\n";

function primeFactors(int $n): array {
    $factors = [];
    $divisor = 2;

    while ($n > 1) {
        while ($n % $divisor == 0) {
            $factors[] = $divisor;
            $n /= $divisor;
        }
        $divisor++;

        if (sqrt($divisor) > $n) {
            if ($n > 1) {
                $factors[] = $n;
            }
            break;
        }
    }

    return $factors;
}

$number = 600851475143;
$factors = primeFactors($number);

echo "The prime factors of $number: " . implode(', ', $factors) . PHP_EOL;