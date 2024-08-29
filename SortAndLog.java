public class SortAndLog {

    public static void sortAndLog(int x, int y, int z) {
        if (x > y && x > z) {
            if (y > z) {
                System.out.println(x + ", " + y + ", " + z);
            } else {
                System.out.println(x + ", " + z + ", " + y);
            }
        } else if (y > x && y > z) {
            if (x > z) {
                System.out.println(y + ", " + x + ", " + z);
            } else {
                System.out.println(y + ", " + z + ", " + x);
            }
        } else if (z > x && z > y) {
            if (x > y) {
                System.out.println(z + ", " + x + ", " + y);
            } else {
                System.out.println(z + ", " + y + ", " + x);
            }
        }
    }

    public static void main(String[] args) {
        sortAndLog(8, 1, 3);
    }
}
