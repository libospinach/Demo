package never.designPattern.strategy;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月09日 14:06
 */
public class Cat {
    private double weight;
    private double height;

    public Cat(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
