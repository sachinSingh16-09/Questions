import java.util.Arrays;

public class Plus1 {
    public static void main(String[] args) {
        int[]digits= new int[]{1,3,4,5};
        plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }

    public static int[] plusOne(int[] digits) {

        for(int i=0; i<= digits.length-1; i++){
            if(i==digits.length-1){
               // digits[i]= digits[i]+1;
                if(digits[i]!=9){
                    digits[i]= digits[i]+1;
                }
                else{
                    digits[i-1]= digits[i-1]+1;
                    digits[i]=0;
                }

            }

        }
       return digits;

    }
