class Solution {
    public String removeDuplicates(String s) {
    StringBuilder stack = new StringBuilder(s.length());
    for (char c : s.toCharArray()) {
        int len = stack.length();
        if (len > 0 && stack.charAt(len - 1) == c) {
            stack.setLength(len - 1);
        } else {
            stack.append(c);
        }
    }
    return stack.toString();
}
}