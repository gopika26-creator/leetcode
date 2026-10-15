class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> Map = new HashMap<>();
       int res=0;
       int majority=0;
       for(int num : nums){
         Map.put(num, Map.getOrDefault(num,0)+1);
         if(Map.get(num) > majority){
            res = num;
            majority = Map.get(num);
           }
        }   
        return res;
    }
}