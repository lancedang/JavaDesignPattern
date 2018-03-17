package designPattern.agent.dynamic;

import java.lang.reflect.Proxy;

public class DynamicAgentDemo {
	public static void main(String[] args) {

		BusinessHandler handler = new BusinessHandler(new Vendor());
		Class<?>[] iClasses = { ISell.class };



		//动态代理的本质就是：你不用在自定义代理类(就像自己办工厂生产东西一样), 不需要亲力亲为
		//但达到这种结果是需要代价的：
		ISell dyAgent = (ISell) Proxy.newProxyInstance(ISell.class.getClassLoader(), iClasses, handler);

		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		dyAgent.sell();
		dyAgent.advertise();

	}
}
