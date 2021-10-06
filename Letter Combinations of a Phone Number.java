class Solution {
    private static final Map<Character, String> phone = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0)
            return new ArrayList<>();
        return letterCombinations(digits, "");
    }
    
    private List<String> letterCombinations(String digits, String current){
        //base condition
        if(digits.length() == 0){
            return Collections.singletonList(current);
        }
        List<String> res = new ArrayList<>();
        String letters = phone.get(digits.charAt(0));
        for(int i = 0; i < letters.length(); i++){
            // making a choice
            String newCurrent = current + letters.charAt(i);
            // generating all possible solution
            res.addAll(letterCombinations(digits.substring(1), newCurrent));
        }
        return res;
    }
}
