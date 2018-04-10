public class SelectionSorter extends AbstractSorter {

    public SelectionSorter(Comparable[] arr) {
        super(arr);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void sortArray() {
        for (int i = 0; i < (array.length - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((array[minIndex].compareTo(array[j])) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Swap.swap(array, minIndex, i);
            }
        }

    }

}
