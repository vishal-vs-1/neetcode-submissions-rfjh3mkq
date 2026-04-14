class Solution {

    public String encode(List<String> strs) {
        StringBuilder resultSb = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            resultSb.append(len + "-"+ str);
        }
        return resultSb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int l = 0, r = 0;
        while(l < str.length()){
            while(str.charAt(r) != '-'){
                r++;
            }
            // System.out.println("ss ="+ str.substring(l, r));
            int range = Integer.valueOf(str.substring(l, r));
            l = r+1;
            r = l+range;
            result.add(str.substring(l,r));
            // System.out.println(str.substring(l, r));
            l = r;
        }
        return result;
    }
}
