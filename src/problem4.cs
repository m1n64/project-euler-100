using System;
using System.Collections.Generic;
using System.Linq;

using System;
using System.Collections.Generic;
using System.Linq;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Project Euler #4");

        int maxPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int value = i*j;

                if (IsPalindrome(value) && value > maxPalindrome) {
                    maxPalindrome = value;
                }
            }
        }

        Console.WriteLine($"Max 3-digit multiplying number: {maxPalindrome}");
    }

    public static bool IsPalindrome(int num)
    {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}