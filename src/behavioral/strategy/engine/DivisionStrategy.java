package behavioral.strategy.engine;

import java.math.BigDecimal;

public class DivisionStrategy implements OperatorStrategy {


    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        if(b.equals(BigDecimal.ZERO)){
            throw new RuntimeException("b must be not ZERO");
        }
        return a.divide(b,BigDecimal.ROUND_HALF_DOWN);
    }
}
