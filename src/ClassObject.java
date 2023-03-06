public class ClassObject {
    public static void main(String[] args) {

        Point p1 = new Point(10, 15);
        Point p2 = new Point(10, 20);

        if (p1.equals(p2)) {
            System.out.println("These points are equal");
        } else {
            System.out.println("These points aren't equal");
        }
    }
}

class Point {

    private int x;
    private int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }

        Point sent = (Point) obj;

        return this.x == sent.x && this.y == sent.y;
    }
}
