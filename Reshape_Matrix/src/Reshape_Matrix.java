public class Reshape_Matrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int arrSize = 0;
        for (int[] arr : nums) {
            arrSize += arr.length;
        }
        int oriRow = 0;
        int oriCol = 0;
        if (arrSize == r * c) {
            int[][] newArr = new int[r][c];
            for (int matRow = 0; matRow < r; matRow++) {
                for (int matCol = 0; matCol < c; matCol++) {
                    if (nums[oriRow].length > oriCol) {
                        newArr[matRow][matCol] = nums[oriRow][oriCol];
                        oriCol++;
                    } else if (nums.length > oriRow) {
                        oriRow++;
                        oriCol = 0;
                        matCol--;
                    }
                }
            }
            return newArr;
        } else {
            return nums;
        }
    }
}

