
public class EN_Co extends Booking {
    private int enq;
    private int x;
    private int j;

    public EN_Co() {
        this.enq = enq;
        this.x = x;
        this.j = j;
    }

    public int getEnq() {
        return enq;
    }

    public void setEnq(int enq) {
        this.enq = enq;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public void enquiry () {
    }

    @Override
    public String toString() {
        return "EN_Co{" +
                "enq=" + enq +
                ", x=" + x +
                ", j=" + j +
                '}';
    }
}