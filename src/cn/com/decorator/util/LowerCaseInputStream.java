package cn.com.decorator.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * JAVA IO装饰者
 * @author huawangxin
 * 2017年5月16日 上午12:59:46
 */
public class LowerCaseInputStream extends FilterInputStream{

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c: Character.toLowerCase((char) c));
	}

	public int read(byte[] b,int offset,int len) throws IOException{
		int result = super.read(b, offset, len);
		for(int i=offset;i<offset+result;i++){
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}