package cn.com.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import cn.com.decorator.util.LowerCaseInputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while((c=in.read())>0){
				System.out.println((char)c);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
