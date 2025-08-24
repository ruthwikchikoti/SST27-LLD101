public class UI implements IUi {
    public void draw(byte[] fileBytes){
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
    }
}
