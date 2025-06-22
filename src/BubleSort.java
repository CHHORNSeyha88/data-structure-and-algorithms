


public class BubleSort {

    public static void main(String[] args) {

        int[] nums = {1, 7, 33, 2, 99, 60, 90};
        int size = nums.length;

        System.out.println("Before Sort array");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            int temp;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sort array");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
