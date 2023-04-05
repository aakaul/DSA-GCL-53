package golang

// 5 6 7 1 2 3 4
func searchInRotatedMatrix(arr []int, el int) int {
	s, e := 0, len(arr)
	for s <= e {
		mid := (s + e) / 2
		if arr[mid] == el {
			return mid
		}
		if el >= arr[s] && el <= arr[mid] {
			e = mid - 1
		} else {
			s = mid + 1
		}

	}
	return -1
}
