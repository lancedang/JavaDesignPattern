package designPattern.decorator;

/**
 * Created by Dangdang on 2018/7/21.
 */
public class ChinaPeople implements ISayable {
    @Override
    public void say() {
        System.out.println("We are chinese");
    }
}
