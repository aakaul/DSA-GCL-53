// https://leetcode.com/problems/maximum-product-of-three-numbers/

package golang

import (
	"log"
	"math"
)

func maxProductOf3Numbers(nums []int) int {
	if len(nums) < 3 {
		return 0
	}
	if len(nums) == 3 {
		return nums[0] * nums[1] * nums[2]
	}
	max1, max2, max3, min1, min2 := math.MinInt, math.MinInt, math.MinInt, math.MaxInt, math.MaxInt
	for _, num := range nums {
		if num < min1 {
			min2 = min1
			min1 = num
		} else if num < min2 {
			min2 = num
		} else if num > max1 {
			max3 = max2
			max2 = max1
			max1 = num
		} else if num > max2 {
			max3 = max2
			max2 = num
		} else if num > max3 {
			max3 = num
		}
	}
	log.Printf("%d %d %d", min1, min2, max1)
	return max(max3*max2*max1, min1*min2*max1)
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}

// working check y
func maximumProduct(nums []int) int {
	high1, high2, high3 := math.MinInt32+2, math.MinInt32+1, math.MinInt32
	low1, low2 := math.MaxInt32, math.MaxInt32+1

	for _, n := range nums {
		if n > high1 {
			if n > high3 {
				high1, high2, high3 = high2, high3, n
			} else if n > high2 {
				high1, high2 = high2, n
			} else {
				high1 = n
			}
		}

		if n < low1 {
			low1, low2 = n, low1
		} else if n < low2 {
			low2 = n
		}
	}

	left := low1 * low2 * high3
	right := high1 * high2 * high3
	if left > right {
		return left
	}
	return right
}
