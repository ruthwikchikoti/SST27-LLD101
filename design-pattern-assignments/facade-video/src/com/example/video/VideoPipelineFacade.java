package com.example.video;

import com.example.video.FilterEngine;
import com.example.video.Decoder;
import com.example.video.Encoder;
import com.example.video.Frame;

import java.nio.file.Path;
import java.util.Objects;

public class VideoPipelineFacade {
    private final Decoder decoder;
    private final Encoder encoder;
    private final FilterEngine filterEngine;
    private final SharpenAdapter sharpenAdapter;

    public VideoPipelineFacade(Decoder decoder, Encoder encoder, FilterEngine filterEngine, SharpenAdapter sharpenAdapter) {
        this.decoder = Objects.requireNonNull(decoder, "decoder");
        this.encoder = Objects.requireNonNull(encoder, "encoder");
        this.filterEngine = Objects.requireNonNull(filterEngine, "filterEngine");
        this.sharpenAdapter = Objects.requireNonNull(sharpenAdapter, "sharpenAdapter");
    }
    public Path process(Path src, Path output, boolean gray, Double scale, Integer sharpenStrength) {
        Objects.requireNonNull(src, "src");
        Objects.requireNonNull(output, "output");
        Frame[] frames = decoder.decode(src);
        if (gray) {
            frames = filterEngine.grayscale(frames);
        }
        if (scale != null) {
            frames = filterEngine.scale(frames, scale);
        }
        if (sharpenStrength != null) {
            frames = sharpenAdapter.sharpen(frames, sharpenStrength);
        }
        return encoder.encode(frames, output);
    }
}

