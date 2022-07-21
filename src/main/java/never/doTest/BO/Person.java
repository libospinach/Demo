package never.doTest.BO;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月08日 15:32
 */
public class Person implements Serializable,Comparable {
    private static final long serialVersionUID = 1211925009343242199L;


    public Person(String name,  int age) {
        this.name = name;

        this.age = age;
    }

    public Person() {
        this.setIDCard("IDCard");
        character = "个人特点";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String sex;
    private int age;

    public static String getCharacter() {
        return character;
    }

    public static void setCharacter(String character) {
        Person.character = character;
    }
    private transient String IDCard;

    private static String character;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", character='" + character + '\'' +
                ", age=" + age +
                ", IDCard='" + IDCard + '\'' +
                '}';
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Person)o).getName());
    }
}
