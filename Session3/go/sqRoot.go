package golang

// nears perfect no.
func sqRoot(num int) int {
	s, e, res := 0, num, 0

	for s <= e {
		mid := (s + e) / 2
		sq := mid * mid
		if sq == num {
			return mid
		} else if num > sq {
			s = mid + 1
			res = mid
		} else {
			e = mid - 1
		}
	}

	return res
}
