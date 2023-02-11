package golang

import "fmt"

func generateSubArrays(arr []int) {
	for i := 0; i < len(arr); i++ {
		for j := i; j < len(arr); j++ {
			for k := i; k <= j; k++ {
				fmt.Printf("%d,", arr[k])
			}
			fmt.Println("")
		}
	}
}
