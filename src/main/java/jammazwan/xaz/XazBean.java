package jammazwan.xaz;

import java.util.ArrayList;
import java.util.Collections;

public class XazBean {

	public String answer(String text) {
		
		StringBuffer sb = new StringBuffer();
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, text.split("\n"));
		Collections.sort(list);
		for (String line : list) {
			sb.append(line+ "\n");
		}
		return sb.toString();
	}

}
