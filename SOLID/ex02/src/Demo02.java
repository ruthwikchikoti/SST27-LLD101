public class Demo02 {
    public static void main(String[] args) {
        Player player = new Player(new UI(), new Cache(), new Decoder());
        player.play(new byte[]{1,2,3,4});
        player.play(new byte[]{5,6,7,8});
        player.play(new byte[]{9,10,11,12,13,14,15,16});

    }
}
