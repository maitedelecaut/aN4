package Ex3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
	private DatagramSocket dgSocket;
	
	ClientUDP() throws IOException {
		dgSocket = new DatagramSocket();
	}

	void go(String args) throws IOException {
		byte[] bufDate = args.getBytes();
		
		//on cree un data vide car on envoit rien et on connect a l adresse local et au port
		DatagramPacket dgPacket = new DatagramPacket(new byte[1500], 0, InetAddress.getLocalHost(), 9876);
		
		dgPacket.setData(bufDate, 0, bufDate.length);
		
		//on envoit au serveur 
		dgSocket.send(dgPacket);
	}

	public static void main(String[] args) throws IOException {
		new ClientUDP().go("Bonjour");
	}

}
