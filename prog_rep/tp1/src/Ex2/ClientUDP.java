package Ex2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
	private DatagramSocket dgSocket;
	
	ClientUDP() throws IOException {
		dgSocket = new DatagramSocket();
	}

	void go() throws IOException {
		//on cree un data vide car on envoit rien et on connect a l adresse local et au port
		DatagramPacket dgPacket = new DatagramPacket(new byte[0], 0, InetAddress.getLocalHost(), 9876);
		
		//on envoit au serveur 
		dgSocket.send(dgPacket);
	}

	public static void main(String[] args) throws IOException {
		new ClientUDP().go();
	}
}
