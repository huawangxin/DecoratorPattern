package cn.com.decorator;
/**
 * 抽象根父类
 * @author huawangxin
 * 2017年5月16日 上午12:27:07
 */
public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
