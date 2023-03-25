package golang

import "fmt"

func rotateMatrix(arr [][]int) {
	size := len(arr)
	for i := 0; i < size; i++ {
		for j := 0; j < i; j++ {
			temp := arr[i][j]
			arr[i][j] = arr[j][i]
			arr[j][i] = temp
		}
	}
	for i := 0; i < size; i++ {
		s, e := 0, len(arr[i])
		for s < e {
			temp := arr[i][s]
			arr[i][s] = arr[i][e]
			arr[i][e] = temp
			e--
			s++
		}
	}
	for i := 0; i < size; i++ {
		for j := 0; j < size; j++ {
			fmt.Println("%d ", arr[i][j])
		}
	}
}
