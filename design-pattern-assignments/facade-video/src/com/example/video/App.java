package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Decoder dec = new Decoder();
        Encoder enc = new Encoder();
        FilterEngine fe = new FilterEngine();
        SharpenAdapter sharpen = new SharpenAdapter(new LegacySharpen());
        VideoPipelineFacade facade = new VideoPipelineFacade(dec, enc, fe, sharpen);
        Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, 0.5, 3);
        System.out.println("Wrote " + out);
    }
}
