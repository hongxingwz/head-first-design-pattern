package com.jianglei.decorator03.v1_01;

import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jianglei on 2017/7/9.
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c =  super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int blen = b.length;
        if (b == null || off < 0 || off > blen
                || len < 0 || len + off > blen) {
            throw new IndexOutOfBoundsException("bounded");
        }
        int readLen = super.read(b, off, len);
        for (int i = 0; i < readLen; i++) {
            b[i] = (byte)Character.toLowerCase((int)b[i]);
        }

        return readLen;
    }
}
