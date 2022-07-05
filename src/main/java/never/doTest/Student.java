package never.doTest;

public class Student {
    private String name;
    private Homework homework;

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){

    }
    public Student(String name,Homework homework){
        this.name=name;
        this.homework=homework;
    }
    public void doHomework(){
        System.out.println(homework.getContent());
    }

}
