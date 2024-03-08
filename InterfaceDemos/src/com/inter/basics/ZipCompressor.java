package com.inter.basics;

public class ZipCompressor implements Icompressor {
    @Override
    public String[] compresFiles(String file, String file1) {
        String[] zippedFiles = new String[3];
                zippedFiles[0] = file;
                zippedFiles[1] = file1;
        return new String[0];
    }

}
