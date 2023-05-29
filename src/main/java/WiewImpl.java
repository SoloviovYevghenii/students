public class WiewImpl implements Wiew{

    @Override
    public String getName() {
        return "vasy";
    }

    @Override
    public int getSum(int one, int second) {
        return one+ second;
    }
}
