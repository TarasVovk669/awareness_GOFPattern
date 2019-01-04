package behavioral.strategy.engine;

import java.math.BigDecimal;

public interface OperatorStrategy {

    BigDecimal execute(BigDecimal a, BigDecimal b);
}
