package food;

import java.math.BigDecimal;

public interface Matter {


    /**
     * 类型
     * @return String
     */
    String scene();


    /**
     * 品牌
     * @return String
     */
    String brand();


    /**
     * 价格
     * @return BigDecimal
     */
    BigDecimal price();

    /**
     * 描述
     * @return String
     */
    String desc();

}
