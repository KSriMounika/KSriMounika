class Solution {
    public boolean isAnagram(String s, String t) {

        int m = s.length();
        int n = t.length();
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        // HashSet<Character> s1 = new HashSet<>();
        // HashSet<Character> s2 = new HashSet<>();
        // for(char c: arr)
        // {
        //     s1.add(c);
        // }
        // for(char c1: arr2)
        // {
        //     s2.add(c1);
        // }
        if( m==n && Arrays.equals(arr, arr2))
        {
            return true;
        }
        return false;

        
    }
}