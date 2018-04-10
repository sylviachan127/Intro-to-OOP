/**
 * @author Sylvia Chan
 * Sort an array of integer using Insertion Sort
 */
public class InsertionSorter extends AbstractSorter {

    public InsertionSorter(Comparable[] arr) {
        super(arr);
    }
        // TODO Auto-generated constructor stub

    /*
     * Sorting method using insertion sort
     * @see AbstractSorter#sortArray()
     */
    @Override
    public void sortArray() {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while ((j > 0) && ((array[j - 1]).compareTo(array[j])) > 0) {
                Swap.swap(array, j, j - 1);
                j = j - 1;
            }
        }

    }

}
