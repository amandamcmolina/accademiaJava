package com.javaIo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "C";
        System.out.println(s.codePointAt(0));//unicode

        Charset ex = Charset.defaultCharset();
        System.out.println(ex); //UTF-8

        byte[] bytes = s.getBytes("UTF-8");
        String newS = new String(bytes);//Encoding
        System.out.println(newS);
    }
}
