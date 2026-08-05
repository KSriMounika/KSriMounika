class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
      HashMap<Integer, Integer> m = new HashMap<>();
      int s=0;
      int[] ans = new int[2];
      for(int i=0; i<numbers.length; i++)
      {
        s = numbers[i];
        int diff = target-numbers[i];
        if(m.containsKey(diff))
        {
           return new int[]{m.get(diff)+1, i+1};
        }
        else
        {
          m.put(numbers[i], i);
        }
      }
      return new int[]{};
        
    }
}