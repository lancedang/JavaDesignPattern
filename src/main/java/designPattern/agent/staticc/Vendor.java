package designPattern.agent.staticc;

/**
 * 小贩
 */
public class Vendor implements ISell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Vendor Sell. ");
	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Vendor Advertise. ");
	}

}
