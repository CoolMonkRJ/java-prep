public class FRWC {
    public static void main(String[] args){
        FileProcessor fileProcessor = new FileProcessor();
        String fileContent= fileProcessor.readFile("08-File-Reader-Word-Counter/src/sample.txt");

        WordCounterService service =new WordCounterService();
        service.countWords(fileContent);
    }
}
