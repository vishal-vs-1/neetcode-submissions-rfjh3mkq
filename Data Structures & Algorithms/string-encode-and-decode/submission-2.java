class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        int i =0; 
        while(i<str.length()){
            int s = i;
            //get numbers value
            while(str.charAt(i) != '#'){
                i++;
            }
            //get number length from substring s to #
            int e = Integer.valueOf(str.substring(s,i));
            //move pointer after hash
            i++;
            //add substring from i to length of string
            res.add(str.substring(i,i+e));
            //move pointer after end  
            i += e;

        }
        
        return res;
    }
}
