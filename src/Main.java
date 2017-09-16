

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] newArr = reverseCopy(firstArr);
        printArr(newArr);
        
    }
    public static int[] copy(int[] array) {
            int[] newArray = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }
    public static void printArr(int[] array) {
        for(int i: array) {
            System.out.println(i + "");
        }
    }
    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0; i--) {
             newArray[j] = array[i];
             j++;
        }
        return newArray;
    }
    
}
