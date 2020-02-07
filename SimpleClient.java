import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class SimpleClient {
    
    final static int PORT = 2;
    final static String IP = "localhost";

    public static void main(String[] args) {
        
        try {
            Socket client = new Socket(IP,PORT);
            InputStream is = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String recievedData = br.readLine();
            System.out.println("Server Sent => " + recievedData);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
