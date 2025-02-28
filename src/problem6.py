"""
Project Euler #6

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
"""

print("Project Euler #6")

def square_of_sum(n):
    return sum(range(1, n + 1)) ** 2


def sum_of_squares(n):
    return sum(i ** 2 for i in range(1, n + 1))


def difference(n):
    return square_of_sum(n) - sum_of_squares(n)

num = 100
print(f"Difference between square of sum and sum of squares for {num}:", difference(num))
