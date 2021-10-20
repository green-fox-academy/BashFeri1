package com.greenfoxacademy.arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Készíts (dinamikusan*) egy kétdimenziós tömböt
//   a következő mátrix-szal**. Ciklust (loop-ot) használj!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Írasd ki a konzolra ezt a kétdimenziós tömböt
// * A tömb hossza egy változótól kell függjön
// ** Nyugalom, egy mátrix pont olyan, mint egy tömb
        int matrixSize = 4;
        int[][] matrix= new int[matrixSize][matrixSize];

        for (int i = 0; i<matrixSize; i++){
            for (int j = 0; j<matrixSize; j++) {
                if(j==i){
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
