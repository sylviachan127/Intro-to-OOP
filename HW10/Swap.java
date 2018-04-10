/**
 * @author Sylvia Chan Swap two items in a comparable array
 */
public class Swap {
    public static void swap(Comparable[] compareList, int a, int b) {
        Comparable temp = compareList[a];
        compareList[a] = compareList[b];
        compareList[b] = temp;
    }
}
