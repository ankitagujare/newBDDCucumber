package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{
    //this method is use to get test data from property file
    //need to provide input as a key
    //sAuthor Name :@Ankita
    public static String getPFData(String key) throws IOException {


        // 1.here to jump property file-we provide the path of our file (project location path+ property file path)
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\Property.properties");


        //2.to open property file -to read data we use class properties object create below mention
        Properties ProObj = new Properties();
        
        //open property files
        ProObj.load(file);

        //3. now we have key to get the value for that key we call method and pass key
        String value = ProObj.getProperty(key);
        return value;

    }
}
