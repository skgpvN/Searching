package Searching;

public class BinarySewrchUsingFunction {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int start = 0;
        int end = arr.length - 1;
        int target = 4;
//        System.out.println(-1);
        BinerySearch(arr, start, end, target);
    }

    public static void BinerySearch(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = ((end + start) / 2);
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
        }

    }

}