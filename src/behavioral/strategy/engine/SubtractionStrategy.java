package behavioral.strategy.engine;

import java.math.BigDecimal;

public class SubtractionStrategy implements OperatorStrategy {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
}
