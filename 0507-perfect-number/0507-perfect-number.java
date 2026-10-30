class Solution {
    public boolean checkPerfectNumber(int num) {

        int sumOfDivisor = 1;

        // base case 1 is not a perfect number 
        if (num <= 1) {
            return false;
        }

        // Loop up to sqrt(num) inclusively
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisor = sumOfDivisor + i;

                // Add the paired divisor if it's distinct
                if(i*i != num){
                    sumOfDivisor += num/i;
                }
            } 
        }
        return sumOfDivisor == num;
    }
}