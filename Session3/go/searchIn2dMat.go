package golang

func searchIn2dMar(arr [][]int, el int) bool {
	for i := 0; i < len(arr); i++ {
		innerArr := arr[i]
		innerArrLastEl := innerArr[len(innerArr)-1]
		if innerArrLastEl == el {
			return true
		}
		innerArrFirstEl := innerArr[0]
		if innerArrFirstEl < el && el < innerArrLastEl {
			s, e := 0, len(innerArr)
			for s <= e {
				mid := (s + e) / 2
				if mid == el {
					return true
				} else if mid > el {
					s = mid + 1
				} else {
					e = mid - 1
				}

			}
		}
	}
	return false
}
