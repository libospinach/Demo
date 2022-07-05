package never.doTest.enumTest;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年07月04日 15:49
 */
public class Student {
    private String name;
    private int age;
    private Gentle sex;
    private Girl clothes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gentle getSex() {
        return sex;
    }

    public void setSex(Gentle sex) {
        this.sex = sex;
    }

    public Girl getClothes() {
        return clothes;
    }

    public void setClothes(Girl clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Student{" +
                 name + '\'' +
                ", 年龄" + age +
                ", 性别" + sex +
                ", 穿着" + clothes.show() +
                '}';
    }
}
