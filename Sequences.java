public class Sequences {

    public int sumOfFirst(int n) {
        int total = 0;
        for (int counter = 0; counter <= n; counter ++){
            total = total + counter;
        }
        if (n <= 0){
            return 0;
        }
        return total;
    }

    public String countUp(int start, int limit) {
        String result = "";
        for (int count = start; count <= limit; count++){
            if (count == limit){
                result = result + count;
            }
            else {
                result = result + count + " ";
            }
    }
        if (start > limit){
        return "";
    }
    return result;
    
}

    public String countByThrees(int start, int limit) {
        String result = "";
        for (int count = start; count <= limit; count = count +3){
            if (count == limit){
                result = result + count;
            }
            else {
                result = result + count + " ";
        }
    }
    return result;
    }

    public int productOfFirst(int n) {
        int result = 1;
        for (int count1 = 1; count1 <= n; count1 ++){
            result = result * count1; 
        }
        if (n <= 0) {
            result = 1;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        if (n <= 0){
            return 0;
        }
        if (factor == 0){
            return 0;
        }
        for (int number = 1; number <= n; number++){
            if (number % factor == 0){
            count++; 
            }
            else {
                
            }
        }
        
        return count;
    }

    public String repeat(String s, int times) {
        String result = "";
        if (times <= 0){
            return "";
        }
        for (int num = 0; num < times; num++){
            result = result + s;
        }
        return result;
    }

    public int power(int base, int exponent) {
        int result = 1;
        if (exponent <= 0){
            return 1;
        }
        for (int counter2 = 0; counter2 < exponent; counter2++){
            result = result * base;
        }
        return result;
    }
}
