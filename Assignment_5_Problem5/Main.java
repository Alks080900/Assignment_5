package Assignment_5_Problem5;

public class Main {
    public static void main(String[] args) {
        // Create computer objects
        Computer c1 = new Computer("AXLE", "Core i-3", 18, 2.4);
        Computer c2 = new Computer("AXLE", "Core i-3", 18, 2.4);
        Computer c3 = new Computer("NETTECH", "Core i-3", 18, 2.4);

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));

        System.out.println("c1 hashCode: " + c1.hashCode());
        System.out.println("c2 hashCode: " + c2.hashCode());
        System.out.println("c3 hashCode: " + c3.hashCode());

    }
}
