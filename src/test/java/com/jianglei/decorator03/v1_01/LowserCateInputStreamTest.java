package com.jianglei.decorator03.v1_01;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by jianglei on 2017/7/9.
 */
public class LowserCateInputStreamTest {

    @Test
    public void testRead() {
        try (LowerCaseInputStream lis = new LowerCaseInputStream(new FileInputStream("pom.xml"))) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = lis.read(bytes, 0, bytes.length)) != -1) {
                String s = new String(bytes, 0, len);
                System.out.print(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
