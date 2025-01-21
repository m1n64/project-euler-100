/**
 * Project Euler #10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

object HelloWorld {
	def main(args: Array[String]): Unit = {
	  println("Project Euler #10")

      var sum: Long = 0
      for (i <- 2 until 2000000) {
        if (isPrime(i)) {
          sum += i
        }
      }
      println("The sum of all the primes below two million is: " + sum)
	}

    def isPrime(n: Int): Boolean = {
        if (n <= 1) return false
        if (n <= 3) return true
        if (n % 2 == 0 || n % 3 == 0) return false
        var i = 5
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false
            i += 6
        }
        true
    }
}