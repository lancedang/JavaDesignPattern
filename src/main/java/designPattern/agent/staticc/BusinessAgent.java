package designPattern.agent.staticc;

public class BusinessAgent implements ISell {
	private Vendor vendor;

	public BusinessAgent(Vendor vendor) {
		// TODO Auto-generated constructor stub
		this.vendor = vendor;
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Before sell");
		vendor.sell();
		System.out.println("After sell");

	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Before advertise");
		vendor.advertise();
		System.out.println("After advertise");
	}

	// the following two method-before and after is reconstructed which can be
	// utilized in implemented method
	void before() {
		//
	}

	void after() {
		//
	}

}
