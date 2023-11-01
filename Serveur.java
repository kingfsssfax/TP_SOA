package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException{
		int serverPort=1234;
		ServerSocket ss=new ServerSocket(serverPort);
		// TODO Auto-generated method stub
      System.out.println("je suis un serveur en attente la connexion d'un client");
      try {
    	// Accepte la connexion d'un client
      Socket socket=ss.accept();
      System.out.println("un client est connecte");
      InputStream is = socket.getInputStream();
      int nb=is.read();
      int x = nb*2;
      OutputStream os = socket.getOutputStream();
      os.write(x);
      
      // Ferme le socket du serveur après utilisation
      socket.close();
	 } 
	 catch (Exception e) {e.printStackTrace();}
      
}

    

}
