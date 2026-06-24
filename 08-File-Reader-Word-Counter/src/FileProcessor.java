import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    public String readFile(String filePath){
        StringBuilder content =
                new StringBuilder();

        try{
            BufferedReader reader =
                    new BufferedReader(new FileReader(filePath));
            String line;
            while((line=reader.readLine())!=null){
                content.append(line);
                content.append(" ");
            }
            reader.close();
        }catch(IOException e){
            System.out.println("" +
                    "Error Reading File : "+e.getMessage());
        }
        return content.toString();
    }
}
