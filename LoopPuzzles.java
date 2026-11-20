public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int count = 0;
        if (start <= 0){
            return -1;
        }
        while (start != 1) {//why is it that wen I put start != 0 it's wrong or infinite
            
        if (start % 2 == 0){
            start = start / 2;
            count++;
        }
        else if (start % 2 != 0){ //why must be else if
            start = 3 * start + 1;
            count ++;
        }
        }
        return count;
    }

    public int sumDigits(int n) {
        int sumOfDigits = 0;
        if (n < 0){
            n = -n;
        } 

        if (n == 0){
            return 0;
        }
        while (n > 0){ 
            sumOfDigits = sumOfDigits + n % 10;
            n = n /10;
        }
        return sumOfDigits;
    }

    public int reverseDigits(int n) {
        if (n==0){
            return 0;
        }
        int w = n;

        int numberOfDigits = 0;
        while (n != 0){
            n = n/10;
            numberOfDigits++;
        }

        int reverseDigit = 0;
        while (w != 0){
            reverseDigit = reverseDigit + ((w % 10) * (int)Math.pow(10, numberOfDigits-1));
            w = w / 10;
            numberOfDigits--;
            System.out.println(((w % 10) * (int)Math.pow(10, numberOfDigits-1)));
        }            
            return reverseDigit;
        }
        

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        double t = n;

        if (n <= 0){
            return false;
        }
        
        while (t > 0) {
            t = t % 3;
            if (n%3 ==0){
                return true;
            }
            if (n==1){
                return true;
            }
            if (n%3 != 0){
                return false;
            }
        }
        return false;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        if (limit < 0){
            return 0;
        }
        
        int runningTotal = 0;
        int number1 = 0;
        while (runningTotal <= limit){
            runningTotal = runningTotal + number1;
            number1++;
        }
        return runningTotal;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        int commaIndex = csv.indexOf(",");
        if (csv.indexOf(sentinel) != -1){
            csv = csv.substring(0, csv.indexOf(sentinel));
        }
        
        while (commaIndex != csv.indexOf(sentinel)){
            csv = csv.substring(0, commaIndex) + " " + csv.substring(commaIndex, csv.indexOf(sentinel));
        }
               

        return csv;
    }
}

