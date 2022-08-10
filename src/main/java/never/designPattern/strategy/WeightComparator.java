package never.designPattern.strategy;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月09日 16:28
 */
public class WeightComparator implements MyComparator<Cat>{
    @Override
    public int compare(Cat t1, Cat t2) {
        if(t1.getWeight()>t2.getWeight()) return 1;
        else if(t1.getWeight()<t2.getWeight()) return -1;
        else return 0;
    }
}
