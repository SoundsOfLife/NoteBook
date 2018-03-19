class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }else{
            if(matrix[0].length == 0){
                return false;
            }
            boolean ans = false;
            int i = 0,j = matrix[0].length - 1;
            while(true){
                if(i == matrix.length - 1 && j == 0){
                    if(matrix[i][j] == target){
                        ans = true;
                    }
                    break;
                }else{
                    if(matrix[i][j] == target){
                        ans = true;
                        break;
                    }else{
                        if(i == matrix.length - 1){
                            if(matrix[i][j] < target){
                                break;
                            }else{
                                j--;
                            }
                        }else if(j == 0){
                            if(matrix[i][j] > target){
                                break;
                            }else{
                                i++;
                            }
                        }else{
                            if(matrix[i][j] > target){
                                j--;
                            }else{
                                i++;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }
}