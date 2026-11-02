import java.util.ArrayList;

class Solution {
    public int findNumbers(int[] nums) {
        int elementCount = 0; 

        for(int arr : nums){    
            int digitCount = 0;

            while(arr > 0 ){
                digitCount++;
                arr = arr / 10;
            }
            if(digitCount % 2 == 0){
                elementCount++;
            } 
        }
        return elementCount;
    }
}