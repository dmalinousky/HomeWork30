import java.util.TreeSet;

public class BlackBox {
    private Integer K = 0;
    private TreeSet<Integer> integerHashSet = new TreeSet<>();

    public int getK() {
        return K;
    }

    public void setK(Integer k) {
        this.K = k;
    }

    public TreeSet<Integer> getIntegerHashSet() {
        return integerHashSet;
    }

    public void setIntegerHashSet(TreeSet<Integer> integerHashSet) {
        this.integerHashSet = integerHashSet;
    }

}
