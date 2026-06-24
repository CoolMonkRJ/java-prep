import java.util.HashMap;
import java.util.Map;
public class WordCounterService {
    public void countWords(String text){
        HashMap<String,Integer> wordMap = new HashMap<>();

        String[] words =text.toLowerCase().split("\\s+");

        int totalWords=0;

        for(String word : words){
            if(word.isEmpty()){
                continue;
            }
            totalWords++;
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println("\n Total Words : "+ totalWords);
        System.out.println("\n -------- WORD FREQUENCY_______");

        String mostFrequentWord="";
        int highestCount=0;

        for(Map.Entry<String,Integer>entry : wordMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
            if(entry.getValue()>highestCount){
                highestCount= entry.getValue();
                mostFrequentWord=entry.getKey();
            }
        }
        System.out.println(
                "\nMost Frequent Word: "
                        + mostFrequentWord);

        System.out.println(
                "Frequency: "
                        + highestCount);
    }
}
