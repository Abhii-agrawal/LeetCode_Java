class Solution {

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Expand window
            if (map.containsKey(ch)) {

                if (map.get(ch) > 0)
                    count--;

                map.put(ch, map.get(ch) - 1);
            }

            // Shrink window while valid
            while (count == 0) {

                if (right - left + 1 < minLen) {

                    minLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0)
                        count++;
                }

                left++;
            }
        }

        return ans;
    }
}