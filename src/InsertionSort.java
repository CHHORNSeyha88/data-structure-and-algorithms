public class InsertionSort {
    public static void main(String[] args) {


// Insertion Sort: Simple, in-place sorting algorithm.
// Builds the final sorted array one element at a time.
// Best for small or nearly-sorted datasets.
// Complexity: O(n^2) average/worst, O(n) best. Stable.


        int[] nums = {10, 8, 5, 2, 4, 100, 600, 234, 89};

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < nums.length; i++) {
            /*
             start with [1] = 8 and 1 < 9 ; 1++
             */
            int temp = nums[i];
//            int temp = [1] = 8
            int j = i - 1;
//            int j = 0
            while (j >= 0 && nums[j] > temp) {
//                j = 0 >=0 && 10 > 8
                nums[j + 1] = nums[j];

//                number[2] = 8
                j--;
//               what the number j--?
//                o reduce more so is -1
            }
            nums[j + 1] = temp;
//            mums[-1+1] = [0]=8
        }
        System.out.println();
        System.out.println("After Insertion Sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
