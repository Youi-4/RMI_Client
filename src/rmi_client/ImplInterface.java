import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


// Implementing the remote interface 
public class ImplInterface implements Original {

    // Implementing the interface method 
    //File file = new File(getClass().getResourceAsStream("/Gui/FunFacts.txt").toString());
int min =0;
int max = 3800;

    public String randomFact(){
try  
{  
int randIndex = min + (int)(Math.random() * ((max - min) + 1));
String fact =" ";
//Files.copy(facts, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
ClassLoader classLoader = getClass().getClassLoader();
int i = 0;
try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Gui/FunFacts.txt")))) {
          while(fact != null )
{
fact =br.readLine();
if(i == randIndex)
{
return fact;
}
i++;
}
return "Error has occurred"+randIndex;
      }
}  
catch(Exception e)  
{  
return e.getMessage()+"<<............................. >>";  
}

}
}
