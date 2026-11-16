class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder wow = new StringBuilder();
            for (int i = 0; i < s.length(); i += k)
                wow.append(s.substring(i, Math.min(i + k, s.length())).chars().map(d -> d - '0').sum());
            s = wow.toString();
        }
        return s;
    }
}