
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        System.out.println(BinarySearch(arr, 0, arr.length - 1, x));
    }

    static int BinarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return BinarySearch(arr, left, mid - 1, x);
            else
                return BinarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }
}