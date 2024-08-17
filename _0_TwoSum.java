import java.util.HashMap;
import java.util.Scanner;

class _0_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element in the array, except the last one
        for (int i = 0; i < nums.length - 1; i++) {
            // For each element, check the elements that come after it
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the current pair equals the target
                if (nums[i] + nums[j] == target) {
                    // If a match is found, return the indices of the two elements
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[] {}; // No solution found
    }


    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the difference and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference needed to reach the target
            int difference = target - nums[i];

            // If the difference is found in the map, return the indices
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }

            // If the difference is not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array (though problem guarantees one solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] nums = new int[size];

        // Take input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Take input for the target
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Create an instance of the class and call the twoSum method
        _0_TwoSum solution = new _0_TwoSum();
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

        // Close the scanner
        scanner.close();
    }
}
