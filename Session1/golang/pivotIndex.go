// https://leetcode.com/problems/find-pivot-index/
package golang

import "fmt"

func pivotIndex(arr []int) int {
	rightSum, leftSum := 0, 0
	for _, ele := range arr {
		rightSum += ele
	}
	for i := 0; i < len(arr)-1; i++ {
		rightSum -= arr[i]
		if leftSum == rightSum {
			return i
		}
		leftSum += arr[i]
	}
	fmt.Println(rightSum)
	return -1

}
