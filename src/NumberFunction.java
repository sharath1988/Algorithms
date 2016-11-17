

import java.io.File;

public class NumberFunction {

	private int c;
	private int N;
	private float[] numbers = new float[N];

	public NumberFunction() {
	}

	public NumberFunction(int c, int N, float[] inputNumbers) {
		super();
		this.c = c;
		this.N = N;
		this.numbers = inputNumbers;
	}

	public float[][] getMatrix() {
		float[][] result = new float[c + 1][c + 1];

		for (int k = 0; k <= c; k++) {
			for (int j = 0; j <= c; j++) {
				result[k][j] = (float) 0;
				for (int i = c; i <= N - 1; i++) {
					result[k][j] = result[k][j] + numbers[i - k] * numbers[i - j];
				}
			}
		}

		return result;
	}

	public File getFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public float[] getNumbers() {
		return numbers;
	}

	public void setNumbers(float[] numbers) {
		this.numbers = numbers;
	}

}
