public class Counter {
    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.value = startingValue;

    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1);
    }

    public void decrease () {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.value - decreaseAmount >=0) {
                this.value -= decreaseAmount;
            } else if (this.check == true) {
                this.value = 0;
            } else if (this.check == false) {
                this.value -= decreaseAmount;
            }

        }
    }

}
