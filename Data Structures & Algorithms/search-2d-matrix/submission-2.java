class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int arrNo = 0;
        int s = 0;
        int e = matrix.length-1;
        while(s<=e){
            int mid = (e-s)/2 + s;
            int[] currArr = matrix[mid];
            int endNo = currArr.length - 1; 
            if(currArr[endNo] > target){
                arrNo = mid;
                e = mid - 1; 
            } else if(currArr[endNo] < target){
                s = mid +1;
            } else{
                return true;
            }
        }
        
        int[] arrr = matrix[arrNo];
        s = 0;
        e = arrr.length - 1;
        while(s<=e){
            int mid = (e-s)/2 + s; 
            if(arrr[mid] > target){
                e = mid - 1; 
            } else if(arrr[mid] < target){
                s = mid +1;
            } else {
                return true;
            }
        }
        return false;

    }
}
