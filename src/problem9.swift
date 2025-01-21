/**
 * Project Euler #9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product of the Pythagorean triplet.
 */

print("Project Euler #9")

func pythagorean_triplet(a: Int, b: Int, c: Int) -> Bool {
    return a * a + b * b == c * c
}

var multy = 0;

for a in 1...1000 {
  for b in a...1000 {
        let c = 1000 - a - b
        
        if pythagorean_triplet(a: a, b: b, c: c) {
          multy = a * b * c
          break
        }
    }
}

print("The product of the Pythagorean triplet is: \(multy)")