import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Original extends Remote {  
   String randomFact() throws RemoteException;  
} 