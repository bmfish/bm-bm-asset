package java.wk.yuanma.myspring.spring;

public class BeanDefinition {

    private String scope;

    private Class type;

    public BeanDefinition() {
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }


    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }
}
