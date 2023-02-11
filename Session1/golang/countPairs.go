// https://www.geeksforgeeks.org/count-pairs-with-given-sum/
package golang

// assuming array is sorted
// if not sorted use hashmap

/*
if in any qs array is sorted think of binary search or 2 pointer;
*/
func countPairs(arr []int, sum int) int {
	start, end, counter := 0, len(arr)-1, 0
	for start < end {
		idxSum := arr[start] + arr[end]
		if idxSum == sum {
			counter++
			start++
			end--
		} else if idxSum < sum {
			start++
		} else {
			end--
		}
	}
	return counter
}
