package Sorting.Array;

public class BinerySearchWithrecurssion {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int start = 0;
        int end = arr.length - 1;
        int target = 6;
        int x = BinerySearch(arr, start, end, target);
        System.out.println(x);
    }

    public static int BinerySearch(int arr[], int start, int end, int target) {
        if (start <= end) {
            int mid = ((end + start) / 2);
            if (arr[mid] > target) {
                return BinerySearch(arr, start, mid - 1, target);
            }
            if (arr[mid] < target) {
               return BinerySearch(arr, mid + 1, end, target);
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}