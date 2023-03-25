package golang

import "fmt"

// 1234445678
func firstAndLastOccInSorted(arr []int, t int) {
	size := len(arr)
	s, e, first, last := 0, size-1, -1, -1
	for s <= e {
		mid := (s + e) / 2
		if t == arr[mid] {
			first = mid
			e = mid - 1
		} else if t < arr[mid] {
			e = mid - 1
		} else {
			s = mid + 1
		}
	}

	s, e = 0, size-1

	for s <= e {
		mid := (s + e) / 2
		if t == arr[mid] {
			last = mid
			s = mid + 1
		} else if t < arr[mid] {
			e = mid - 1
		} else {
			s = mid + 1
		}
	}

	fmt.Printf("%d %d", first, last)

}
