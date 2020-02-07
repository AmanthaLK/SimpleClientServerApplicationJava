import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class SimpleServer {
    
    
    final static int PORT = 2;

    public static void main(String[] args) {
        
        try {
            ServerSocket server = new ServerSocket(PORT);
			System.out.println("Server Started");
            Socket client = server.accept();
            DataOutputStream os = new DataOutputStream(client.getOutputStream());
            os.writeBytes("Simple Server is Working");
            client.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
