package home;

public class Box {
    public static class Box2<T> {
        private T item;

        public Box2 (T item) {
            this.item = item;
        }

        public T getItem() {return this.item;}
        public void putItem(T item) {this.item = item;}

        public String toSting () { return "Box =" + item;}

    }

    public static void main (String... args) {
        Box2<Integer> tetst = new Box2(1);
        tetst.putItem(2);
        System.out.println(tetst.toSting());



    }
}
