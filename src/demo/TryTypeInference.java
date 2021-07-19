package demo;

import java.util.ArrayList;
import java.util.List;

public class TryTypeInference {

	public static void main(String[] args) {
		List<Runnable> list = new ArrayList<Runnable>();
		list.add(TryTypeInference::tryLocalVariable);
		
		for (var r : list) {
			r.run();
		}
	}
	
	private static void tryLocalVariable() {
		System.out.println("******* TryLocalVariable *******");
		var str = "string";
		System.out.println(str);
	}

}
