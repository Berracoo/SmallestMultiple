# SmallestMultiple
Finding lcd using gcd.
In the code, it might be hard to understand the logic of the gcd, so to be able to explain how it works, we will use an example.
GCD mainly works by reducing the process 
GCD(a,b) is for example explained in a way that we replace a with b first and then use a modulo operator to find the remainder = a % b, and this operation's result becomes the new value of the b
so we can say GCD(a,b) = GCD(b, a % b)
e.g. let's calculate GCD(48,18)
1) GCD(48,18) = GCD(18,48%18) = GCD(18,12)
2) GCD(18,12) = GCD(12,18%12) = GCD(12,6)
3) GCD(12,6) = GCD(6,12%6) = GCD(6,0) = 6
4) To conclude the last non-zero remainder left by dividing is the gcd. You can confirm this result by just calculating in a common way :
5) 48 = (2.2.2.2) * (3) and 18 = (3.3) * (2) (dot can also be used for multiplying) You see the greatest common divisors are one 2 and one 3, so 6.
6) You might wanna know how the method calculates smaller numbers. It basically does the same steps over and over again. (The important thing is that you understand how % works on small numbers)
7) 2 % 3 seems like it doesn't have any results, but in a mathematical way it equals 2(you can use that formula to avoid confusion(a%b = a - (b * (a // b) (// means integer division)this formula can be applied to for other values as well.)
8)  so the GCD(2,3) becomes GCD(3,2) according to how method works and then it becomes GCD(2,3&2) = GCD(2,1) and then GCD(1,0) the result is 1(the last non-zero number encountered).
