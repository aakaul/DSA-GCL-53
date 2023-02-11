// https://leetcode.com/problems/move-zeroes/
package golang

// [0,1,0,3,12]
func moveZeroes(arr []int) []int {
	j := 0
	for i := 0; i < len(arr); i++ {
		if arr[i] != 0 {
			temp := arr[i]
			arr[i] = arr[j]
			arr[j] = temp
			j++
		}
	}
	return arr
}
