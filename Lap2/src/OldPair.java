public class OldPair {
    Object frist;
    Object second;

    public OldPair(Object frist, Object second) {
        this.frist = frist;
        this.second = second;
    }

    public Object getFrist() {
        return frist;
    }

    public void setFrist(Object frist) {
        this.frist = frist;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public String

    toString() {
        return "OldPair{" +
                "frist=" + frist +
                ", second=" + second +
                '}';
    }
}
