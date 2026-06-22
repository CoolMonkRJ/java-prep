import java.util.HashMap;
import java.util.Map;


public class FrequencyCounter {
    public static void main( String[] args){
        String word = "Rama Loves Rama In Case Of Rama";

        HashMap<Character,Integer> frequencyMap =
                new HashMap<>();

        for(int i=0;i< word.length();i++){
            char currentChar = word.charAt(i);

            int currentFrequency = frequencyMap.getOrDefault(currentChar,0);

            frequencyMap.put(currentChar,currentFrequency+1);
        }
        System.out.println("" +
                "-------CHARACTER FREQUENCY-------");
        System.out.println(word);
        for(Map.Entry<Character,Integer>entry :frequencyMap.entrySet()){
            System.out.println(
                    entry.getKey()+
                            "->"
                    + entry.getValue()
            );
        }
    }

}
