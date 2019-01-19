# collatz-conjecture
Java program written in order to demonstrate the Collatz Conjecture. 

The Collatz Conjecture is a mathematical concept that determines any number will lead to one, no matter what, through 
any number of calculations. Here's how it works, for those who are unfamiliar: 

If n is even, then you do n / 2 (n divided by 2).

If n is odd, then you do 3n + 1. 

These calculations will continue to happen until the number eventually reaches one. 

The Conjecture remains to be uncracked, as supercomputers have used numbers far beyond the billions range, and have yet to have the 
Conjecture be disproven. 

I decided to write this very simple program in order to illustrate the concept to other people, without having to constantly do the 
math by hand. Unfortunately, the number cap for the program is 2,147,483,647, as that's the highest possible integer value that you can
reach in the Java language. 
