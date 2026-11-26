class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int left = 0;

        int arr[] = new int[128];

        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);

            arr[ch]++;

            while (arr[ch] > 1) {
                char leftChar = s.charAt(left);
                arr[leftChar]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}