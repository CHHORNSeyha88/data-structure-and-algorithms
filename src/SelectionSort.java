
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1, 7, 33, 2, 99, 60, 90};
        int size = nums.length;
        int temp = 0;
        int minIndex;

        System.out.println("Before Sort array");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size-1; i++){
            // Find the index of the minimum element in the unsorted part
             minIndex = i;

          for(int j = i+1; j < size; j++){
              // If we find a new minimum, update our record of its index
              if(nums[j] < nums[minIndex]){
                  minIndex = j; // We just remember the index
              }
          }
            // After finding the minimum, we do ONE swap for this pass
            temp = nums[i];
           nums[i] = nums[minIndex];
           nums[minIndex] = temp;

        }

        System.out.println();
        System.out.println("After Sort array");
        for(int num : nums){
            System.out.print(num + " ");
        }

    }

}

/**
 We will use your array: nums = {1, 7, 33, 2, 99, 60, 90}. The length (size) is 7.

 The algorithm has two parts for each main step:

 Find Phase: Find the index of the smallest number in the unsorted part.
 Swap Phase: Swap that smallest number with the element at the beginning of the unsorted part.
 Pass 1: i = 0
 Condition: i < size - 1 (which is 0 < 6) is true.

 Goal: Find the smallest element in the entire array {1, 7, 33, 2, 99, 60, 90} and put it at nums[0].

 Find Phase (Inner Loop):

 We start by assuming the first element is the smallest: minIndex = i so minIndex = 0. (nums[minIndex] is 1).
 The inner loop (j) starts from i + 1 (so j starts at 1).
 j = 1: Is nums[1] (7) < nums[minIndex] (1)? No. minIndex is still 0.
 j = 2: Is nums[2] (33) < nums[minIndex] (1)? No. minIndex is still 0.
 j = 3: Is nums[3] (2) < nums[minIndex] (1)? No. minIndex is still 0.
 j = 4: Is nums[4] (99) < nums[minIndex] (1)? No. minIndex is still 0.
 j = 5: Is nums[5] (60) < nums[minIndex] (1)? No. minIndex is still 0.
 j = 6: Is nums[6] (90) < nums[minIndex] (1)? No. minIndex is still 0.
 The inner loop finishes. The final value for the minimum index is minIndex = 0.
 Swap Phase:

 Swap nums[i] with nums[minIndex].
 Swap nums[0] with nums[0]. Nothing changes.
 End of Pass 1 Array: {1, 7, 33, 2, 99, 60, 90}

 Sorted part: {1}

 Pass 2: i = 1
 Condition: i < 6 (which is 1 < 6) is true.

 Goal: Find the smallest element in the unsorted part {7, 33, 2, 99, 60, 90} and put it at nums[1].

 Find Phase (Inner Loop):

 We assume the first element of the unsorted part is the smallest: minIndex = i so minIndex = 1. (nums[minIndex] is 7).
 The inner loop (j) starts from i + 1 (so j starts at 2).
 j = 2: Is nums[2] (33) < nums[minIndex] (7)? No. minIndex is still 1.
 j = 3: Is nums[3] (2) < nums[minIndex] (7)? Yes! We found a new smallest value. Update minIndex to 3.
 j = 4: Is nums[4] (99) < nums[minIndex] (2)? No. minIndex is still 3.
 j = 5: Is nums[5] (60) < nums[minIndex] (2)? No. minIndex is still 3.
 j = 6: Is nums[6] (90) < nums[minIndex] (2)? No. minIndex is still 3.
 The inner loop finishes. The final index of the smallest element is minIndex = 3.
 Swap Phase:

 Swap nums[i] with nums[minIndex].
 Swap nums[1] (value 7) with nums[3] (value 2).
 End of Pass 2 Array: {1, 2, 33, 7, 99, 60, 90}

 Sorted part: {1, 2}

 Pass 3: i = 2
 Condition: i < 6 (which is 2 < 6) is true.

 Goal: Find the smallest element in the unsorted part {33, 7, 99, 60, 90} and put it at nums[2].

 Find Phase (Inner Loop):

 Assume minIndex = i, so minIndex = 2. (nums[minIndex] is 33).
 The inner loop (j) starts from 3.
 j = 3: Is nums[3] (7) < nums[minIndex] (33)? Yes! Update minIndex = 3.
 j = 4: Is nums[4] (99) < nums[minIndex] (7)? No. minIndex is still 3.
 j = 5: Is nums[5] (60) < nums[minIndex] (7)? No. minIndex is still 3.
 j = 6: Is nums[6] (90) < nums[minIndex] (7)? No. minIndex is still 3.
 Inner loop finishes. Final minIndex is 3.
 Swap Phase:

 Swap nums[i] with nums[minIndex].
 Swap nums[2] (value 33) with nums[3] (value 7).
 End of Pass 3 Array: {1, 2, 7, 33, 99, 60, 90}

 Sorted part: {1, 2, 7}

 The Rest of the Passes
 Pass 4 (i = 3): Smallest in {33, 99, 60, 90} is 33. It's already at the start. No change.
 Array: {1, 2, 7, 33, 99, 60, 90}
 Pass 5 (i = 4): Smallest in {99, 60, 90} is 60. Swap nums[4] (99) with nums[5] (60).
 Array: {1, 2, 7, 33, 60, 99, 90}
 Pass 6 (i = 5): Smallest in {99, 90} is 90. Swap nums[5] (99) with nums[6] (90).
 Array: {1, 2, 7, 33, 60, 90, 99}
 The outer loop stops because now i would be 6, and the condition 6 < 6 is false.

 The final, sorted array is: {1, 2, 7, 33, 60, 90, 99}.
 */

