package designPattern.agent.staticc;

/**
 * 代理类, 目的对外界屏蔽真实对象, 或在真实对象出手前做些其他逻辑, 如判断、审核, 比如 宋喆代理宝宝做很多事
 * 但代理最终还得让 target 出面完成一些事
 * 而外界访问时不能直接与 target 通话, 是通过代理类来交流的
 */
public class BusinessAgent implements ISell {

	//target 对象, 王宝强
	private Vendor vendor;

	public BusinessAgent(Vendor vendor) {
		// TODO Auto-generated constructor stub
		this.vendor = vendor;
	}

	//代理替 target 做的事, 在宝宝行事前加了日志输出
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
