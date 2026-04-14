class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String word: strs){
            int length = word.length();
            str.append(length).append("-").append(word);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int start = 0;
        int pointer = 0;
        List<String> result = new ArrayList<>();
        while(pointer<str.length()){
            //stop pointer at -
            while(str.charAt(pointer) != '-'){
                pointer++;
            }
            // get number before -
            int length = Integer.valueOf(str.substring(start, pointer));
            //move the pointer after - at word start
            pointer++;
            //move the the start at word start
            start = pointer;
            //move pointer at word start + length of word means at start of number 
            pointer += length;
            //add word from start to end part
            result.add(str.substring(start, pointer));
            start = pointer;
        }
        return result;
    }
}
