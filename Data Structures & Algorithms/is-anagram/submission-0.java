class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> firstMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> secondMap = new HashMap<Character, Integer>();

        for(char letter : s.toCharArray()) {
            if(firstMap.containsKey(letter)) {
                int newIteration = firstMap.get(letter) + 1;
                firstMap.put(letter, newIteration);
            } else {
                firstMap.put(letter, 1);
            }
        }

        for(char letter : t.toCharArray()) {
            if(secondMap.containsKey(letter)) {
                int newIteration = secondMap.get(letter) + 1;
                secondMap.put(letter, newIteration);
            } else {
                secondMap.put(letter, 1);
            }
        }

        return firstMap.equals(secondMap);
    }
}
