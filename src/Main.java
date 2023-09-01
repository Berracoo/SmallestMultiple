public class Main {
    static long smallestMultipleInRange(long start, long end){
        // this can also be called lcd = the least common multiple
        long multiple = 1;
        for(long i = start; i<= end; i++){
            multiple = (multiple * i) / gcd(multiple , i);
            // this is basically the formula of lcd(a,b) = (a * b) / gcd(a, b)

        }
        return multiple;
    }
    static long gcd(long a, long b){
        // gcd = greatest common divisor
        return b == 0 ? a : gcd(b, a% b);
        // this ternary condition means that if b = 0 return a if not return gcd(b , a % b)

    }

    public static void main(String[] args) {
        // this values can change,or we can just adjust scanner class ,and take the input from user
        // Scanner input = new Scanner(System.in);
        // int start = input.nextInt(); and the same for the end and then use the values as they were used before.

        long start = 1;
        long end = 20;
        long smallestMultiple = smallestMultipleInRange(start,end);

        System.out.println("Smallest multiple of numbers from " + start + " to " + end + " is: " + smallestMultiple);



    }
}