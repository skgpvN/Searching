package Searching;

public class BinarySearchLoop {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int start = 0;
        int end = arr.length - 1;
        int target = 1;
        while (start <= end) {
            int mid = start+((end - start) / 2);
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
        System.out.println(-1);
    }
}

