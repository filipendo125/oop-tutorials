public class AddOneB {
    public static int addOne(int num) {
        num++;
        return num;
    }
    public static void main(String[] args) {
        int x = 0;
        x = addOne(x);
        System.out.println(x);
    }
}