package golang

import "math"

func maxSubArray(arr []int) int {
	curSum, maxSum := 0, -math.MaxInt16
	for i := 0; i < len(arr); i++ {
		cur := arr[i]
		curSum += cur
		maxSum = max(curSum, maxSum)
		if curSum < 0 {
			curSum = 0
		}
	}
	return maxSum
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
