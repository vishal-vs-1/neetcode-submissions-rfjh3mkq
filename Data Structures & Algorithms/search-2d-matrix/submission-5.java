class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int res = 0;
        int s = 0; 
        int e = matrix.length-1;
        while(s<=e){
            int mid = (e-s)/2 + s;
            System.out.println(mid);
            int se = matrix[mid][0];
            int ee = matrix[mid][matrix[mid].length-1];
            if(target > ee){
                s = mid + 1;
            } else if(target < ee && target < se){
                e = mid-1;
            } else{
                res = mid;
                break;
            }
        }
        int[] search = matrix[res];
        s = 0; 
        e = search.length - 1;
        while(s<=e){
            int mid = (e-s)/2 + s;
            if(target > search[mid]){
                s = mid + 1;
            } else if(target < search[mid]){
                e = mid-1;
            } else{
                return true;
            }
        }
        return false;
    }
}
