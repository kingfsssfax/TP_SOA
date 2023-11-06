package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name="CalculWS")
public class CalculatriceWS {
	 @WebMethod(operationName = "Somme")
	    public double Somme(@WebParam(name = "val1") double a,@WebParam(name = "val2") double b){
	        return a+b;
}
}
