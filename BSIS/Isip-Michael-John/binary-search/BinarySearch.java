/**
* BINARY SEARCH is a Divide and Conquer algorithm that compares the item with the middle element of a sorted (ascending) array. 
* Each step, the size of array is reduced to half until one single element remain and a match is found.
*
* @author  [Michael John Isip]
* @link    [https://github.com/mj-isip23]
* @version [version number]
* @since   [09-28-2016]
*/


import java.util.*; // note: imports all classes inside java.util

public class BinarySearch {

	static int array[], index, size, search;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];

		System.out.println(size + " random numbers generated.");
		
		for (int i = 0; i < array.length; i++) {
			// TODO: use nextInt() to assign random numbers (range of 1000) to array index
                    array[i] = rand.nextInt(1000);
		}
		
		// TODO: call bubbleSort method to sort the generated random numbers
                bubbleSort(array);
		System.out.println();
		
		System.out.print("Enter number to find: ");
		// TODO: use nextInt() to assign keyboard input as search item	
                search = input.nextInt();
		index = binarySearch(array, search); // note: assign the search result to array index where it was found	
		
		if (index != -1) {
			System.out.println("FOUND: " + search + " is at " + "array["+index+"]");
		}
		else {
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

	static int binarySearch(int[] numbers, int find) { // note: @param array[], search

		int left=0, right=0, middle;
		// TODO: initialize value for left and right
		
		while (left <= right) {
			middle = left + (right - left) / 2;
			if (numbers[middle] == find) {
				return middle;
			} else if (find < numbers[middle]) {
				right = middle - 1;
			} else { // if numbers[middle] < find
				left = middle + 1;
			}
		}
		return -1; // note: exit loop if not found

	}
	
	static int bubbleSort(int[] arr) {

		// TODO: sort the random array first before searching
            int swap;
            for (int x = 0; x < size-1; x++) { // note: loop until before the end of array
                    for (int y = 0; y < size-x-1; y++) { // note: will not loop to numbers already sorted
                            if (array[y] > array[y+1]) { // note: compare adjacent numbers which is greater
                                    swap = array[y]; // note: swap positions...
                                    array[y] = array[y+1]; // note: smaller will be move to the left
                                    array[y+1] = swap; // note: larger will move to the right
                            }
                    }
            }
            return 0;
        }

}
