package designPattern.strategy.discount;

/**
 * Created by Dangdang on 2018/4/17.
 * 具体策略
 */
public class SeniorMemberStrategy implements IBookSaleStrategy {
    @Override
    public Double bookDiscount(double price) {
        return price * 0.6;
    }
}
