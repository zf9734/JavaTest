/**
 * @author MRFF
 * @create 2021-11-29 20:39
 */
@MyAnnotation
public class Person {
    private int age;
    public String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String show()
    {
        return this.toString().concat("SHOW");
    }

    private String display()
    {
        return this.toString().concat("DISPLAY");
    }

}
