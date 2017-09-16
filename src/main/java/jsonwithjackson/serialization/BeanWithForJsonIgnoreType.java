package jsonwithjackson.serialization;

public class BeanWithForJsonIgnoreType {
    private String name;
    private BeanWithJsonIgnoreType beanWithJsonIgnoreType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanWithJsonIgnoreType getBeanWithJsonIgnoreType() {
        return beanWithJsonIgnoreType;
    }

    public void setBeanWithJsonIgnoreType(BeanWithJsonIgnoreType beanWithJsonIgnoreType) {
        this.beanWithJsonIgnoreType = beanWithJsonIgnoreType;
    }
}
