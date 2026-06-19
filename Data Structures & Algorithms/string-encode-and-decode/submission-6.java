class Solution {

    private char delimiter = '~';
    public String encode(List<String> strs) {
        String encoded = "";
        for(String str: strs) {
            //encoded.append(str.length()).append(delimiter).append(str);
            encoded += str.length()+"~"+str;
        }

        return encoded;
    }
    ///[cat, dog, mouse, rabbit] -> 3~cat3~dog5~mouse6~rabbit
    public List<String> decode(String str) {
        
        List<String> decoded = new ArrayList<>();
        String strLength = "";
        
        for(int i = 0; i < str.length(); i++) {
            char cursor = str.charAt(i);
            if (isNumeric(cursor)) {
                strLength += cursor;
            } else if (delimiter == cursor) {
                int wordLength = Integer.valueOf(strLength);
                int wordStartIndex = i+1;
                
                decoded.add(str.substring(wordStartIndex, wordStartIndex + wordLength));
                i = i+wordLength;
                strLength = "";
            }
        }

        return decoded;
    }

    private boolean isNumeric(char character) {
        return "0123456789".contains(character+"");
    }

}
