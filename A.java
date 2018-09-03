import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*;


public class A{


 public static void main(String[] args)throws IOException{
 	
	System.out.println("Hello from Today");
	String os = System.getProperty("os.name").toLowerCase();
	System.out.println("The OS Name is " + os);
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
    }

}	


