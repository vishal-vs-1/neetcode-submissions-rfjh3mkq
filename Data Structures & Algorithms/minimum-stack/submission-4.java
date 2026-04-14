class MinStack {
    int count;
    int countm;
    int [] arr;
    int [] min;
    public MinStack() {
        count = 0;
        countm = 0;
        arr = new int[900];
        min = new int[900];
    }
    
    public void push(int val) {
        if(countm == 0)  min[countm++] = val;
        else if (val <= getMin())  min[countm++] = val;
        arr[count++] = val;
    }
    
    public void pop() {
        if(count == 0)  return;

        int temp = arr[count-1];
        arr[count-1] = 0;
        if(temp == min[countm-1]) {
            min[countm-1] = 0;
            countm--;
        } 
        count--;
    }
    
    public int top() {
        if(count==0)   return 0;
        return arr[count-1];
    }
    
    public int getMin() {
        if(countm==0)   return 0;
        return min[countm-1];
    }
}
