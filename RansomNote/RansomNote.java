//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//Each letter in the magazine string can only be used once in your ransom note.

class Solution {
    
    HashMap<Character, Integer> createMap(HashMap<Character, Integer> map, String s) {
        for(int i = 0 ; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int tempCount = map.get(s.charAt(i));
                map.put(s.charAt(i), ++tempCount);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        return map;
    }
    
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> magMap = new HashMap<Character, Integer>();
        
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        
        
        ransomMap = createMap(ransomMap, ransomNote);
        magMap = createMap(magMap, magazine);
        
        for(Map.Entry<Character, Integer> entry: ransomMap.entrySet()) {
            if(!magMap.containsKey(entry.getKey())) {
                return false;
            }
            else {
                if(!(magMap.get(entry.getKey()) >= entry.getValue())){
                    return false;
                }
            }
        }
        
        return true;
    }
}