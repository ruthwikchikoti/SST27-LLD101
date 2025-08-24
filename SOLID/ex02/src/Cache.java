public class Cache implements ICache {

    public Frame cache(byte[] fileBytes){
        System.out.println("Cached last frame? " + (fileBytes.length!=0));
        return new Frame(fileBytes);
    }
}
