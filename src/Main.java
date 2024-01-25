public class Main {
    public static void main(String[] args) {

//        basically an array with 5 integers, arrays are static
        int[] intArray = new int[5];

        intArray[0] = 45;
        intArray[1] = 98;
        intArray[2] = -12;
        intArray[3] = 5;
        intArray[4] = -98;

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}