public class RecSearch {
    
    public static int binarySearch(int[] array, int target){
        return binarySearchRec(array, target, 0, array.length -1);
    }

    private static int binarySearchRec(int[] array, int target, int min, int max){

        if(min > max)
            return -1;

        int mid = (min+max)/2;
        
        if(array[mid] == target)
            return mid;

        if(array[mid] > target)
            return binarySearchRec(array, target, min, mid -1);
        else
            return binarySearchRec(array, target,mid+1, max);
        

    }

}
