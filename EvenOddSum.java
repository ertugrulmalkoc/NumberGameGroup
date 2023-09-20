public class EvenOddSum {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int evenSum = 0, oddSum = 0;
        for(int i = 0; i<intArray.length; i++){
            if(i%2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
    }
}
