package pl.coderslab.homeworks.arrays;


public class Main01 {

    public static void main(String[] args) {
        System.out.println(returnUnique(new int[]{3,7,3,8,6}));

    }
    public static int[] returnUnique(int[] arr) {
        int count = 0;
        int[] myArray = new int[count];
        for(int i = 0; i< arr.length; i++){
            boolean unique = true;
            for(int k=0; k<i; k++){
                if(arr[i] == arr[k]){
                    unique = false;
                    break;
                }
            }
            if(unique == true){
                count++;
                myArray[count] = arr[i];

            }
            if (unique) {
                myArray[unique++] = arr[i];
                System.out.println(arr[i]);

        }
        return myArray;
    }


}
