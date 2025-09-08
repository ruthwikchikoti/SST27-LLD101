package com.example.video;

import com.example.video.LegacySharpen;
import com.example.video.Frame;
import java.util.Objects;


public class SharpenAdapter {
    private final LegacySharpen legacySharpen;

    public SharpenAdapter(LegacySharpen legacySharpen) {
        this.legacySharpen = Objects.requireNonNull(legacySharpen, "legacySharpen");
    }
    public Frame[] sharpen(Frame[] frames, Integer strength) {
        Objects.requireNonNull(frames, "frames");
        Objects.requireNonNull(strength, "strength");
        String handle = "HANDLE:" + frames.length;
        legacySharpen.applySharpen(handle, strength);
        return frames;
    }
}
