package golang

func trap(arr []int) int {
	leftMaxArr := leftMax(arr)
	rightMaxArr := rightMax(arr)
	water := 0
	for i := 1; i < len(arr)-1; i++ {
		wat := min(leftMaxArr[i], rightMaxArr[i]) - arr[i]
		if wat > 0 {
			water += wat
		}
	}
	return water
}

func leftMax(arr []int) []int {
	leftMax := make([]int, len(arr))
	leftMax[0] = arr[0]
	for i := 1; i < len(arr); i++ {
		leftMax = append(leftMax, max(arr[i], arr[i-1]))
	}
	return leftMax
}

func rightMax(arr []int) []int {
	rightMax := make([]int, len(arr))
	rightMax[len(arr)-1] = arr[len(arr)-1]
	for i := len(arr) - 2; i >= 0; i-- {
		rightMax = append(rightMax, max(arr[i], arr[i+1]))
	}
	return rightMax
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
