package com.doublesymmetry.kotlinaudio.encrypt;

import androidx.annotation.Nullable;

public class TrackPlayerEncryptInfo {

    private byte[] key;

    private byte[] iv;

    private TrackPlayerEncryptInfo() {
    }

    public static TrackPlayerEncryptInfo getInstance() {
        return StaticSingletonHolder.instance;
    }

    private static class StaticSingletonHolder {
        private static final TrackPlayerEncryptInfo instance = new TrackPlayerEncryptInfo();
    }

    public void setEncryptInfo(@Nullable String key, @Nullable String iv) {
        if (key != null) {
            this.key = key.getBytes();
        }
        if (iv != null) {
            this.iv = iv.getBytes();
        }
    }

    @Nullable
    public byte[] getKey() {
        return key;
    }

    @Nullable
    public byte[] getIv() {
        return iv;
    }
}
