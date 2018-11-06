import java.net.*;
import java.io.*;

public class Zawodnik {

    private String nazwisko() throws Exception{
        URL lastNames = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");
        String result = null;
        Random rand = new Random();
        int n = 0;

        BufferedReader in = new BufferedReader(
                new InputStreamReader(Nazwiska.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            ++n;
            if(rand.nextInt(n) == 0)
                result = inputLine;
        }
        in.close();
        return result;


       }
   }
}





