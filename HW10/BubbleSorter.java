/**
 * @author Sylvia Chan
 * Sort an array of integer using Bubble Sort
 */
public class BubbleSorter extends AbstractSorter {

    public BubbleSorter(Comparable[] arr) {
        super(arr);
        // TODO Auto-generated constructor stub
    }

    /*
     * Sorting method using bubble sort
     * @see AbstractSorter#sortArray()
     */
    @Override
    public void sortArray() {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    Swap.swap(array, i, i - 1);
                    swapped = true;

                }

            }
        }

    }

}
