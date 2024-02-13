package test02;

public class T_test02 {

	public static void main(String[] args) {
		int n = 5; // 달팽이의 크기 (홀수로 설정)

        int[][] snail = generateInnerSpiralSnail(n);

        // 생성된 달팽이 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(snail[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateInnerSpiralSnail(int n) {
        int[][] snail = new int[n][n];

        int value = n * n;
        int startRow = 0, endRow = n - 1, startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 위쪽 방향
            for (int i = endCol; i >= startCol; i--) {
                snail[startRow][i] = value--;
            }
            startRow++;

            // 왼쪽 방향
            for (int i = startRow; i <= endRow; i++) {
                snail[i][startCol] = value--;
            }
            startCol++;

            // 아래쪽 방향
            for (int i = startCol; i <= endCol; i++) {
                snail[endRow][i] = value--;
            }
            endRow--;

            // 오른쪽 방향
            for (int i = endRow; i >= startRow; i--) {
                snail[i][endCol] = value--;
            }
            endCol--;
        }

        return snail;
    }
}