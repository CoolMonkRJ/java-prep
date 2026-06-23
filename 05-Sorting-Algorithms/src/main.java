import java.util.Arrays;

class Sorting {

    public static void main(String[] args){
        int[] numbers ={64,24,57,20,18,56,90,11};

        System.out.println("Original Array : " + Arrays.toString(numbers));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
        System.out.println("Bubble Sort :" + Arrays.toString(numbers));


        int[] numbers2 = {45,12,85,43,59,76,15,23};
        System.out.println("Original Array : " + Arrays.toString(numbers2));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers2);
        System.out.println("Selection Sort :" + Arrays.toString(numbers2));

    }
}
