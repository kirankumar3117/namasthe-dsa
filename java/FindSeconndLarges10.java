
public class FindSeconndLarges10 {

     public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargets = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > secondLargets && num != firstLargest) {
                secondLargets = num;
                if (firstLargest < secondLargets) {
                    secondLargets = firstLargest;
                    firstLargest = num;
                }
            }
        }
        return secondLargets;
    }

    // public static int secondLargest(int[] arr) {
    //     if (arr.length < 2) {
    //         return -1;
    //     }
    //     int firstLargest = arr[0] > arr[1] ? arr[0] : arr[1];
    //     int secondLargets = arr[0] < arr[1] ? arr[0] : arr[1];
    //     for (int i = 2; i < arr.length; i++) {
    //         if (arr[i] > secondLargets && arr[i] != firstLargest) {
    //             secondLargets = arr[i];
    //             if (firstLargest < secondLargets) {
    //                 secondLargets = firstLargest;
    //                 firstLargest = arr[i];
    //             }
    //         }
    //     }
    //     return secondLargets;
    // }

    public static void main(String[] args) {
        int[] arr = {1, 7, 14, 2, 0, 9, 4, 14};
        int result = secondLargest(arr);
        System.out.println("Second Largest is: " + result);
    }
}
