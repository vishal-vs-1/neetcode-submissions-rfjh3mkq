class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        int[][] arr= new int[len][2];
        Deque<Double> d = new ArrayDeque<>();
        for(int i =0; i < len; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a,b )-> Integer.compare(b[0],a[0]));

        for(int i =0; i < len; i++){
            double time = (double)(target - arr[i][0])/arr[i][1];
            if(d.isEmpty()) d.push(time);
            else{
                if(d.peek() < time) d.push(time);
            }
        }
        int result = 0;
        while(!d.isEmpty()){
            d.pop();
            result++;
        }
        return result;
    }
    
}
