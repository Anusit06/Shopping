package Lib;

import java.util.ArrayList;

import Lib.Discount.DefaulyPricingStrategy;
import Lib.Discount.DiscountStrategy;

public class PricingService {
    public record StrategyRule(String sku, DiscountStrategy strategy) {}

    private final ArrayList<StrategyRule> strategies = new ArrayList<>();

    private final DiscountStrategy defaultStrategy = new DefaulyPricingStrategy();

    /**
     * ลงทะเบียนกลยุทธ์
     */
}
