
import java.util.*;

public class AnagramGroup{
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        ArrayList<ArrayList<String>> al=new ArrayList<>();
        for (String s : strs) {
            String word = s;
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            word = new String(ch);
            if (map.containsKey(word)) {
                map.get(word).add(s);
            } else {
                map.put(word, new ArrayList<>());
                map.get(word).add(s);
            }
        }
        for(ArrayList<String> s:map.values()){
            al.add(s);
        }
        System.out.println(al);
    }
}