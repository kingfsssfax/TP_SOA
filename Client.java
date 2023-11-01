package ServerPackage;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Adresse IP du serveur (dans ce cas, c'est l'adresse locale "localhost")
		InetAddress host = InetAddress.getByName("localhost");
		System.out.println("je suis un client pas encore connecté.");
		// Port auquel le client se connectera
		int clientPort = 1234;
		try {
			
			// Établir la connexion avec le serveur
            Socket socket = new Socket(host, clientPort);
            System.out.println("Je suis un client connecté.");
            OutputStream os = socket.getOutputStream();
            os.write(10);
            socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
