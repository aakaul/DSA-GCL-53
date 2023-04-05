package main

func bubbleSort(arr []int) []int {
	for i := 0; i < len(arr); i++ {
		for j := 0; j < len(arr)-i-1; j++ {
			if arr[j] > arr[j+1] {
				temp := arr[i]
				arr[i] = arr[j+1]
				arr[j+1] = temp
			}
		}
	}
	return arr
}
