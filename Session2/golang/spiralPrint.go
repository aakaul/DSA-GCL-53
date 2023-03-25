package golang

import "fmt"

func spiralPrint(arr [][]int) {
	rowsLen := len(arr)
	colsLen := len(arr[0])
	sc, sr, ec, er := 0, 0, colsLen-1, rowsLen-1
	for sc <= ec && sr < er {
		for i := sc; i < ec; i++ {
			fmt.Printf("%d ", arr[sr][i])
		}
		sr++

		for i := sr; i < er; i++ {
			fmt.Printf("%d ", arr[i][ec])
		}
		ec--

		if sr <= er {
			for i := ec; i >= sc; i-- {
				fmt.Printf("%d ", arr[er][i])
			}
		}
		er--

		if sc <= ec {
			for i := er; i >= sr; i-- {
				fmt.Printf("%d ", arr[i][sc])
			}
		}
		sc++

	}
}
