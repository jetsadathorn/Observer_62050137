public class TestObserver {
    public static void main(String[] args) {
        Show obj1 = new Show();
        Show obj2 = new Show();
        HeadQuater obj = new HeadQuater();
        obj.register(obj1);
        obj.register(obj2);
        System.out.println("Enter Score Thai 1-0 UAE");
        obj.setSomeData(1, 0);
        System.out.println("Enter Score Thai 2-0 UAE");
        obj.setSomeData(2, 0);
        System.out.println("Enter Score Thai 2-1 UAE");
        obj.setSomeData(2, 1);
    }
}
