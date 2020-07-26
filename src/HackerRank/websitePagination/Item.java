package HackerRank.websitePagination;

public class Item {
    String a;
    int b;

    public Item(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Item{" + "a='" + a + '\'' + ", b=" + b + '}';
    }
}
