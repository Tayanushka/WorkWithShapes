package org.itstep;

public class MatrixManager {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();
		matrix.setMatrix(4);
		
		int[][] filledMatrix = matrix.getMatrix();
		
		long result = 1;
		for (int i = 0; i <filledMatrix.length; i++) {
			for (int j = 0; j <filledMatrix[i].length; j++) {
				System.out.print(filledMatrix[i][j] + ", ");
				result = result*filledMatrix[i][j];
				//result *= filledMatrix[i][j]; можно и так записать
			}
			System.out.println();
		}
System.out.println(result);
	}
	

}
