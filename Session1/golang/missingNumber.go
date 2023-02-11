// https://leetcode.com/problems/missing-number/

package golang

/*
	logic sum of n numbers = n*(n+1)/2
*/

func missingNumber(arr []int) int {
	total := len(arr) * (len(arr) + 1) / 2
	for _, ele := range arr {
		total -= ele
	}
	return total
}
