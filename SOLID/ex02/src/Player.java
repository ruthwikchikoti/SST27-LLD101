public class Player {
    IUi ui;
    ICache cache;
    IDecoder decoder;
    
    public Player(IUi ui, ICache cache, IDecoder decoder){
        this.ui = ui;
        this.cache = cache;
        this.decoder = decoder;
    }
    void cache(byte[] fileBytes){
        cache.cache(fileBytes);
    }
    void draw(byte[] fileBytes){
        ui.draw(fileBytes);
    }
    Frame decodeFrame(byte[] fileBytes){
        return decoder.decode(fileBytes);
    }

    void play(byte[] fileBytes){
        // decode
        Frame f = decodeFrame(fileBytes);
        cache.cache(f.data);
        ui.draw(f.data);
    }
}