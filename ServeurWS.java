package serveur;
import jakarta.xml.ws.Endpoint;
import service.CalculWS;
public class ServeurWS {
    public static void main(String[] args) {
        String url= "http://localhost:8084/";
        Endpoint.publish(url, new CalculWS());
        System.out.println("Web service deployé sur "+url);
    }
}
