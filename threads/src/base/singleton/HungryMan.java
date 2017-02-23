package base.singleton;

public class HungryMan {
	private HungryMan(){}
	private static  HungryMan man = new HungryMan();
	public static HungryMan getHungryMan(){
		return man;
	}
}
