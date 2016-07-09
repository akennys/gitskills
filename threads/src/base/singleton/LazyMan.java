package base.singleton;

public class LazyMan {
	private LazyMan(){};
	private static LazyMan lm = null;
	public static LazyMan getLazyMan(){
		if(lm == null){
			lm = new LazyMan();
		}
		return lm;
	}
	
}
