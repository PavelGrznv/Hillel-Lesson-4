package main.java.com.classes.hillel;
import java.util.*;
public class Main {
    static int counter = 0;
    public static void main(String[] args) {
//      ___________Sorting array using standard methods_________________
        int[] myArray = new int[]{8,1,3,5,2,6,4,0,7};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void simpleSort(int[] arrayToSort) {
        boolean needToBeSorted = true;
        counter = 0;
        while (needToBeSorted) {
            needToBeSorted = false;
            for (int i = 1; i < arrayToSort.length; ++i) {
                if (arrayToSort[i - 1] > arrayToSort[i]) {
                    swap(arrayToSort, i - 1, i);
                    needToBeSorted = true;
                }
            }
        }
        System.out.println("Counts: " + counter);
        System.out.println(Arrays.toString(arrayToSort));
    }
    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        counter++;
    }
}