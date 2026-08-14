public class Solution {
    public int[] Intersection(int[] nums1, int[] nums2) {
        List<int> list=new List<int>();
        HashSet<int> set=new HashSet<int>();
        foreach(int num in nums1){
            set.Add(num);
        }
        foreach(int num in nums2){
            if(set.Contains(num)){
                list.Add(num);
                set.Remove(num);
            }
        }
        int[] arr=new int[list.Count];
        int i=0;
        foreach(int n in list){
            arr[i++]=n;
        }
        return arr;
    }
}