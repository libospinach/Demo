package never.designPattern.strategy;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月09日 16:34
 */
public class testStrategy {
    public static void main(String[] args) {
        Cat[] arr = {new Cat(12.4,11.1),new Cat(10.2,10),new Cat(20.1,16)};
        for(Cat c:arr){
            System.out.println(c);
        }
        MySorter<Cat> catMySorter = new MySorter<>();
        catMySorter.sort(arr,new WeightComparator());
        for(Cat c:arr){
            System.out.println(c);
        }

    }
}
