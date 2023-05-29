class Solution {
    public String addBinary(String a, String b) {
        int x = a.length() - 1, y = b.length() - 1;
        int carry  = 0;
        StringBuilder ans = new StringBuilder();

        while (x >= 0 || y >= 0 || carry != 0) {
            if (x >= 0) {
                carry += a.charAt(x) - '0';
                x--;
            }

            if (y >= 0) {
                carry += b.charAt(y) - '0';
                y--;
            }

            ans.append(carry % 2);
            carry = carry / 2;
        }

        return ans.reverse().toString();

    }
}