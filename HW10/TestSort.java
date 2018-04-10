public class TestSort {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 10, d = 1, e = 23, f = 13;
        int g = 11, h = 4, i = 2;
        Comparable[] abc = {a, b, c, d, e, f, g, h, i };
        for (Comparable comparable3 : abc) {
            System.out.print(comparable3 + " ");
        }

        System.out.println("");

        Comparable[] abc1 = {a, b, c, d, e, f, g, h, i };
        BubbleSorter testing = new BubbleSorter(abc1);
        testing.sortArray();
        abc1 = testing.getArray();
        for (Comparable comparable : abc1) {
            System.out.print(comparable + " ");
        }

        System.out.println("");

        Comparable[] abc2 = {a, b, c, d, e, f, g, h, i };
        InsertionSorter testing2 = new InsertionSorter(abc2);
        testing2.sortArray();
        abc2 = testing2.getArray();
        for (Comparable comparable2 : abc2) {
            System.out.print(comparable2 + " ");
        }

        System.out.println("");

        Comparable[] abc3 = {a, b, c, d, e, f, g, h, i };
        SelectionSorter testing5 = new SelectionSorter(abc3);
        testing5.sortArray();
        abc3 = testing5.getArray();
        for (Comparable comparable5 : abc3) {
            System.out.print(comparable5 + " ");
        }

//        Comparable[] abc7 = { a, b, c, d, e, f, g, h, i };
//        MergeSorter testing51 = new MergeSorter(abc7);
//        testing51.sortArray(abc7);
//        abc7 = testing51.getArray();
//        for (Comparable comparable5 : abc7) {
//            System.out.print(comparable5 + " ");
//        }

    }

}
