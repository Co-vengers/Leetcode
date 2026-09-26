class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> kmap = new HashMap<>(knowledge.size());
        //convert the given 2d array to hashmap
        for(List<String> k : knowledge){
            kmap.put(k.get(0), k.get(1));
        }

        //initialzize a string to store the result
        StringBuilder res = new StringBuilder();

        //interate character by character and find the key enclosed within braces
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                //search index of closing bracket starting from next to current index
                int indexOfClosingBrac = s.indexOf(')', i+1);

                //extract the key in between braces starting from 
                //next to current index till just before index of closing brac
                //2nd arguement is exclusive in range
                String key = s.substring(i+1, indexOfClosingBrac);

                //fetch the value of the key from hashmap if no key found append '?' to result
                res.append(kmap.getOrDefault(key, "?"));

                //update i to index of closing brac
                i = indexOfClosingBrac;
            }
            else{
                //append other character directly which are not enclosed within braces
                res.append(s.charAt(i));
            }
        }
        //convert the stringbuilder to string
        return res.toString();
    }
}