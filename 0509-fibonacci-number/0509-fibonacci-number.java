class Solution {
    public int fib(int n) {
        // using for loop
        
        if(n == 0|| n == 1){
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;
        int fibonacii = 0;  
        for(int i = 2; i <= n; i++){
            
            fibonacii = prev2 + prev1;
            prev2 = prev1;
            prev1 = fibonacii;
        }
        return fibonacii;
    }
}