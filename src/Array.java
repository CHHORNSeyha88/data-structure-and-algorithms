


class Array {

    public static void main(String[] args) {

//         store number in array

        int[] nums = {1, 2, 3, 44, 69, 70, 89, 100};
//        int[] nums = new int[1000];

//         search element
        int target = 100;

//        int result = binarySearch(nums, target);
//        int result1 = linearSearch(nums, target);
//        recursion
        int result2 = binarySearchRecursion(nums, target, 0, nums.length - 1);

        if (result2 != -1) {
            System.out.println("The Element founded in Index :" + result2);
        } else {
            System.out.println("Element not found");
        }

    }


    //     use linearSearch
    public static int linearSearch(int[] nums, int target) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            step++;
            if (nums[i] == target) {
                System.out.println("Iterated of Linear " + step + " step");
                return i;
            }
        }
        System.out.println("Iterated of Linear " + step + " step");
        return -1;
    }


//     use binarySearch

    public static int binarySearch(int[] nums, int target) {
//        find process
        int step = 0;

        int leftElement = 0;
        int rightElement = nums.length - 1;

        while (leftElement <= rightElement) {
            step++;
            int mid = (leftElement + rightElement) / 2;
            if (nums[mid] == target) {
                System.out.println("Iterated of Binary " + step + " step");
                return mid;
            } else if (nums[mid] < target) {
                leftElement = mid + 1;
            } else if (nums[mid] > target) {
                rightElement = mid - 1;
            }
        }
        System.out.println("Iterated of Binary " + step + " step");
        return -1;
    }

    //     use binarySearch recursion

    private static int binarySearchRecursion(int[] nums, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearchRecursion(nums, target, mid + 1, right);
            } else {
                return binarySearchRecursion(nums, target, left, mid - 1);
            }
        }

        return -1;
    }
}
