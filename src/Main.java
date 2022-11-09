public class Main {
    public static void main(String[] args) {
        LL myList = new LL<>();

        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(4);

        myList.delete(1);

        myList.get(1);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

        myList.add(1,5);
        System.out.println(myList.get(1));
    }
}