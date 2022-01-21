public class TestRecSearch {

    public static void main(String[] args){

        int[] test = {-4, 1, 5, 9, 11};
        int index = RecSearch.binarySearch(test,9);
        System.out.println("Target " + (index >= 0 ? "found at index: " + index : "not found"));

    }

    
}
