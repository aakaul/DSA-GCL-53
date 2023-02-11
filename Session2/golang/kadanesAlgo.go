// https://leetcode.com/problems/maximum-subarray/
package main

func KadanesAlgo(arr []int) int {
	curSum, maxSum := arr[0], arr[0]
	for _, cur := range arr {
		curSum = max(cur, cur+curSum)
		maxSum = max(curSum, maxSum)
	}
	return maxSum
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
