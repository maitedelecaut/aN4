package Ex1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;
import static java.lang.System.out;

public class ListerIP {

	public static void main(String args[]) throws SocketException {
		//retourner toutes interfaces de la machine
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        //parcours liste contenant toute les interfaces et affiche details
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        out.printf("Interface name: %s\n", netint.getDisplayName());
        out.printf("Name: %s\n", netint.getName());
        out.printf("MTU : %s\n", netint.getMTU());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            out.printf("InetAddress: %s\n", inetAddress);
        }
        out.printf("\n");
     }
}  
