import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MRFF
 * @create 2021-12-01 15:58
 */
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);//得到代理类的对象
        System.out.println(proxyInstance.getBelief());
        proxyInstance.eat("土豆");

    }
}

class ProxyFactory
{
    public static Object getProxyInstance(Object obj)//obj是被代理类的对象
    {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvocationHandler);
    }

}

class MyInvocationHandler implements InvocationHandler
{
    private Object obj = null;//被代理类对象

    public void bind(Object obj)//给被代理类对象赋值
    {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object return_value = method.invoke(obj, args);
        return return_value;
    }
}

interface Human
{
    public abstract void eat(String food);
    public abstract String getBelief();
}

class SuperMan implements Human
{

    @Override
    public void eat(String food) {
        System.out.println("超人在吃"+food);
    }

    @Override
    public String getBelief() {
        return "超人的信仰返回值";
    }
}
