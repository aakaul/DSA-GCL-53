// https://leetcode.com/problems/move-zeroes/
package golang

// [0,1,0,3,12]

func MoveZeros(arr []int) []int {
	j := 0
	for i := 0; i < len(arr); i++ {
		if arr[i] != 0 {
			arr = swap(arr, i, j)
			j++
		}
	}
	return arr
}

func swap(arr []int, i int, j int) []int {
	temp := arr[i]
	arr[i] = arr[j]
	arr[j] = temp
	return arr
}
