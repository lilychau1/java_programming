package p06_01_objects_and_lists;

public class Example601d {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
