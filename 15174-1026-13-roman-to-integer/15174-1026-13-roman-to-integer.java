class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanMap = new HashMap<>();        
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        
        String[] str = s.split("");
        int number = 0;
        
        for (int i = 0; i < str.length; i++) {          
                String currentChar = str[i];
            
                String nextChar = "";

                if (i < str.length - 1) {
                    nextChar = str[i + 1];
                }
            
                String prevChar = "";
                
                if (i != 0) {
                    prevChar = str[i - 1];
                }
                
                if (nextChar != "" && (romanMap.get(currentChar) < romanMap.get(nextChar))) {
                    if (prevChar != "" && (romanMap.get(currentChar) > romanMap.get(currentChar))) {
                        continue;
                    }
                    
                    number += romanMap.get(nextChar) - romanMap.get(currentChar);
                } else {
                    if (prevChar != "" && (romanMap.get(currentChar) > romanMap.get(prevChar))) {
                        continue;
                    }
                    
                    number += romanMap.get(currentChar);
                }            
        }
        
        return number;
    }
}