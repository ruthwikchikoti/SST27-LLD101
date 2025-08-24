public class Demo06 {
    public static void main(String[] args) {
        new Aviary().release(new FlyingBird());
        
        Penguin penguin = new Penguin();
        penguin.sound();
        System.out.println("Penguin stays in enclosure");
    }
}
