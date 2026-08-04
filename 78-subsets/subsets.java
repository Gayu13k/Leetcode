class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
    
          backtrack(0,nums,new ArrayList<>(),outer);
          return outer;
    }
        /*for(int num:nums){
            int n =outer.size();
            for(int i =0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;*/
       public static void backtrack(int index, int[] nums,
                   List<Integer> current,
                   List<List<Integer>> res) {
            res.add(new ArrayList<>(current));
            for(int i =index;i<nums.length;i++){
            current.add(nums[i]);
               backtrack(i+1,nums,current,res);
               current.remove(current.size()-1);
            }
        }
         
    }
