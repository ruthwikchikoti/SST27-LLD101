public class Decoder implements IDecoder{
    public Frame decode(byte[] fileBytes){
        return new Frame(fileBytes); // pretend decoding
    }
}
