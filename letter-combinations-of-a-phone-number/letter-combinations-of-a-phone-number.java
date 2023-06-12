class Solution {

    List<String> result;
    Map<Character, String> map;

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if (digits.length() == 0) return result;

        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper("", 0, digits, digits.length());
        return result;
    }

    public void helper(String s, int i, String digit, int n) {
        if(s.length() == n) {
            result.add(s);
            return;
        }

        char ch = digit.charAt(i);
        String str = map.get(ch);

        for (int j = 0; j < str.length(); j++) {
            helper(s + str.charAt(j), i+1, digit, n);
        }
    }
}