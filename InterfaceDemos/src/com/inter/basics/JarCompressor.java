package com.inter.basics;

public class JarCompressor implements Icompressor{
    @Override
    public String[] compresFiles(String file, String file1) {
        String[] compressorFiles = new String[3];
       compressorFiles[0]=file;
       compressorFiles[1]=file1;
        return compressorFiles;
    }
}
