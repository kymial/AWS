package test02;

public class T_test01 {

	public static void main(String[] args) {
		int n = 3; // 마방진의 차수 (홀수여야 합니다)
        int[][] magicSquare = generateMagicSquare(n);

        // 생성된 마방진 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = num++;
            }

            j++;
            i--;
        }

        return magicSquare;

	}

}
