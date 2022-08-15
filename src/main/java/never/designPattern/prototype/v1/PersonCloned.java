package never.designPattern.prototype.v1;

/**
 * @Description: 深浅复制
 * @author: Bo Li
 * @date: 2022年08月15日 11:07
 */
public class PersonCloned implements Cloneable{
    private  int age;
    private String name;
    private Area area;

    public static void main(String[] args) throws CloneNotSupportedException {
        PersonCloned personCloned1 = new PersonCloned(17,"小红",new Area("学校","河北"));
        PersonCloned personCloned2 = (PersonCloned) personCloned1.clone();
        System.out.println(personCloned1);
        System.out.println(personCloned2);
        System.out.println("--------------");
        personCloned2.name = "小敏";
        personCloned2.area.setName("家");
        System.out.println(personCloned1);
        System.out.println(personCloned2);

    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public PersonCloned(int age, String name, Area area) {
        this.age = age;
        this.name = name;
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "PersonCloned{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

class Area implements Cloneable{
    private String name;
    private String provience;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public Area(String name, String provience) {
        this.name = name;
        this.provience = provience;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", provience='" + provience + '\'' +
                '}';
    }
}

