"""
Project Euler #7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
"""

def nth_prime(n)
  limit = (n * Math.log(n) + n * Math.log(Math.log(n))).to_i
  limit = [limit, 15].max

  sieve = Array.new(limit + 1, true)
  sieve[0] = sieve[1] = false
  
  (2..Math.sqrt(limit)).each do |i|
    if sieve[i]
      (i**2..limit).step(i) { |j| sieve[j] = false }
    end
  end
  
  primes = sieve.each_index.select { |i| sieve[i] }
  
  primes[n - 1]
end

puts "10001st prime number is #{nth_prime(10001)}"