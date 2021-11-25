import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MRFF
 * @create 2021-11-23 14:35
 */
public class GenericTest {

}

class DAO<T>
{
    private Map<String,T> m ;

    public DAO() {
        m = new HashMap<String,T>();

    }

    public DAO(Map<String, T> m) {
        this.m = m;
    }

    public void save(String id , T entity) throws RuntimeException
    {
        if(m.containsKey(id)) m.put(id,entity);
        else throw new RuntimeException("没有Key为ID的Entry");
//        m.replace(id,entity);
    }

    public T get(String id)
    {
        return m.get(id);
    }

    public void udpate(String id, T entity)
    {
        m.put(id,entity);
    }

    public List<T> list()
    {
        return new ArrayList<T>(m.values());
    }

    public void delete(String id)
    {
        m.remove(id);
    }




}
