package designPattern.agent.dynamic;

import java.lang.reflect.Proxy;

public class DynamicAgentDemo {
	public static void main(String[] args) {
		BusinessHandler handler = new BusinessHandler(new Vendor());
		Class<?>[] iClasses = { ISell.class };
		ISell dyAgent = (ISell) Proxy.newProxyInstance(ISell.class.getClassLoader(), iClasses, handler);
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		dyAgent.sell();
		dyAgent.advertise();
	}
}
