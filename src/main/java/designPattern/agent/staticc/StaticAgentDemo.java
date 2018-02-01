package designPattern.agent.staticc;

public class StaticAgentDemo {
	public static void main(String[] args) {
		BusinessAgent businessAgent = new BusinessAgent(new Vendor());
		businessAgent.sell();
		businessAgent.advertise();
	}
}
