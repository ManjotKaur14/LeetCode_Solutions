class Solution {
    public String reorganizeString(String s) {
        int[] f = new int[26];

        for (char c : s.toCharArray())
            f[c - 'a']++;

        int max = 0, ch = 0;

        for (int i = 0; i < 26; i++) {
            if (f[i] > max) {
                max = f[i];
                ch = i;
            }
        }

        if (max > (s.length() + 1) / 2)
            return "";

        char[] ans = new char[s.length()];
        int idx = 0;

        while (f[ch] > 0) {
            ans[idx] = (char)('a' + ch);
            idx += 2;
            f[ch]--;
        }

        for (int i = 0; i < 26; i++) {
            while (f[i] > 0) {
                if (idx >= s.length())
                    idx = 1;

                ans[idx] = (char)('a' + i);
                idx += 2;
                f[i]--;
            }
        }

        return new String(ans);
    }
}