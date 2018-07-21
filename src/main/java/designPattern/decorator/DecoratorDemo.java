package designPattern.decorator;

/**
 * Created by Dangdang on 2018/7/21.
 * 装饰器模式和代理模式有很大相似的地方<br>
 * 1. 装饰器只是在被装饰对象的行为增强（被装饰对象已经存在后的行为），
 * 代理是可以控制被代理对象的生命周期（如延迟初始化），同样也可增强某些功能，它们的初衷是不一样
 * 2. 装饰器模式可以多层装饰，代理模式只能代理一层
 * 3. 如果你的被代理对象是不方便出面的，那就用代理，如果你不介意让别人知道他是谁，那就用装饰者。
 * 4. 装饰器对被装饰对象没有控制权，只能为其增加一层装饰，以增强被装饰对象的功能而已
 * ；代理类对被代理对象有控制权，决定其执行或不执行
 * 5. 装饰器模式表现java.io, OutputStream out = new OutputStream(new FileOutputStream("text.txt"))
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        ISayable china = new ChinaPeople();
        ChinaPeopleDecorator chinaPeopleDecorator = new ChinaPeopleDecorator(china);
        chinaPeopleDecorator.say();
    }
}
