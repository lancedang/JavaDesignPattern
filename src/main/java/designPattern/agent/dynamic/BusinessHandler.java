package designPattern.agent.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BusinessHandler implements InvocationHandler {
	private Object vendor;
	private Object target; // 相比第一行更通用了,
							// 因为此刻不知道委托类具体是谁，故不能明确定义成Vendor,由多态可知，定义成Object

	public BusinessHandler(Vendor vendor) {
		// TODO Auto-generated constructor stub
		this.vendor = vendor;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before");
		Object result = method.invoke(vendor, args); // 直观上理解，method.invoke()就是执行Method方法，
		// 这个方法隶属vendor类(param1)代理模式种的委托类，且这个方法所需参数为param2
		System.out.println("after");

		System.out.println("result " + result);

		return result;
	}

}
