package main

func validAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	mapArr := [26]int{}
	for i := 0; i < len(s); i++ {
		mapArr[s[i]-97]++
		mapArr[t[i]-97]--
	}

	for i := 0; i < len(mapArr); i++ {
		if mapArr[i] != 0 {
			return false
		}
	}
	return true
}
