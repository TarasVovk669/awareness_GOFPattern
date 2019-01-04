package behavioral.strategy.engine;

import java.math.BigDecimal;

public class AdditionStrategy implements OperatorStrategy  {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
