package golang

import "fmt"

func wavePoint(arr [][]int) {
	rowSize, colSize := len(arr), len(arr[0])

	for i := 0; i < colSize; i++ {
		if i%2 == 0 {
			for k := 0; k < rowSize; k++ {
				fmt.Printf("%d ", arr[k][i])
			}
		} else {
			for k := rowSize - 1; k >= 0; k-- {
				fmt.Printf("%d ", arr[k][i])
			}
		}
	}
}

/*

[2][2]int{
	{1, 3} ,
	{6,5} ,
}
*/
