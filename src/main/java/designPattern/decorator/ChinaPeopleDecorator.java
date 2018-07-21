package designPattern.decorator;

/**
 * Created by Dangdang on 2018/7/21.
 * 装饰器类用于增强被修饰对象的行为
 */
public class ChinaPeopleDecorator implements ISayable {

    private ISayable chinaPeople;

    public ChinaPeopleDecorator(ISayable chinaPeople) {
        this.chinaPeople = chinaPeople;
    }

    @Override
    public void say() {
        chinaPeople.say();
        //对原有行为进行装饰，可以装饰若干层
        decorateInfo1(chinaPeople);
        decorateInfo2(chinaPeople);
    }

    public void decorateInfo1(ISayable iSayable) {
        System.out.println("decorate 1");
    }

    public void decorateInfo2(ISayable iSayable) {
        System.out.println("decorate 2");
    }
}
