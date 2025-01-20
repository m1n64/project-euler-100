<?php

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