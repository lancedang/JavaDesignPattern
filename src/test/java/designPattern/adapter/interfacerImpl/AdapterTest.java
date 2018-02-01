package designPattern.adapter.interfacerImpl;

import designPattern.adapter.SocketAdapter;
import designPattern.adapter.interfacer.DBSocketInterface;
import designPattern.adapter.interfacer.GBSocketInterface;
import designPattern.adapter.util.Hotel;

public class AdapterTest {
	public static void main(String[] args) {
		GBSocketInterface gbSocket = new GBSocket();
		DBSocketInterface socketAdapter = new SocketAdapter(gbSocket);
		
		Hotel hotel = new Hotel();
		hotel.setDbSocket(socketAdapter);
		
		hotel.charge();
	}
}
