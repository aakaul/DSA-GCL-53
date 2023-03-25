package golang

// if qs has sorted binary search
// else can we use 2 pointer
func binarySearch(arr []int, find int) int {
	s, e := 0, len(arr)
	for s < e {
		midIdx := (s + e) / 2
		if find == arr[midIdx] {
			return midIdx
		}
		if arr[midIdx] > find {
			e = midIdx - 1
		} else {
			s = midIdx + 1
		}
	}

	return -1
}
