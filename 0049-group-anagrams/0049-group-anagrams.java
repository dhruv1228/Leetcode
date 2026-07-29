class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String word : strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String newword=new String(chars);
            if(!map.containsKey(newword)){
                map.put(newword,new ArrayList<>());
            }
            map.get(newword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}