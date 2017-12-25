package dominator;

public class Number implements Comparable {

    private int number;
    private int quantity;
    private int index;

    Number(int number, int numberQuantity, int index) {
        this.number = number;
        this.quantity = numberQuantity;
        this.index = index;
    }

    public Number(int number){
    }

    int getNumber() {
        return number;
    }

    int getQuantity() {
        return quantity;
    }

    int getIndex() {
        return index;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getQuantity(), ((Number) o).getQuantity());

    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Number && this.getNumber() == ((Number) obj).getNumber();
    }

    @Override
    public int hashCode() {
        int result = 17;
        return 31 * result + number;
    }


}
