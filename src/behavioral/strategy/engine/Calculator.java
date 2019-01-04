package behavioral.strategy.engine;

import java.math.BigDecimal;

public class Calculator {
    private OperatorStrategy operatorStrategy;

    public void setOperatorStrategy(OperatorStrategy operatorStrategy) {
        this.operatorStrategy = operatorStrategy;
    }

    public BigDecimal doBusiness(BigDecimal a, BigDecimal b){
        return operatorStrategy.execute(a,b);
    }
}
