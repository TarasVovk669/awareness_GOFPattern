package behavioral.strategy.engine;

import java.math.BigDecimal;

public class MultiplicationStrategy implements OperatorStrategy {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
