/*
 * Given an array of integers nums and an integer k, write a program to return the number of unique k-diff pairs in the array.
A k-diff pair is defined as an integer pair (nums[i], nums[j]), where the following conditions are true:
 */

 class Solution {
    public int findPairs(ArrayList<Integer> nums, int k)  {

      // for k = 0
      
      if(k == 0)
      {
        int count = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(Integer copied : nums)
        {
          Integer number = hashMap.get(copied);
          if(number == null)
          {
            hashMap.put(copied,1);
          }
          else
          {
            hashMap.put(copied,number+1);
            count++;
          }
          
        }
        return count;
      }

      // for k != 0

      int count = 0;
      Set<Integer> hashSet = new HashSet<>(nums);
      for(Integer copied : hashSet)
        {
          if(hashSet.contains(copied+k))
          {
            count++;
          }
        }
      return count;
    }
}
