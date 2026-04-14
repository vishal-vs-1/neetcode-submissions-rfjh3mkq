class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] pair= new int[speed.length][2];
        for(int i = 0; i<speed.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));

        for(int[] i: pair){
            double time = (double) (target - i[0]) /i[1];
            if(stack.isEmpty())
                stack.push(time);
            else if(time<= stack.peek())
                continue;
            else
                stack.push(time);
        }
        return stack.size();
    }
}