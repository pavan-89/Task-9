package pep_task9.pep_task9;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterPrefix {
	public static void main1()
	{
		List<String> lst=List.of("ant","apple","basket","ask","aunt","cat","are","aba","abc");
		filterString(lst).forEach(System.out::println);
	}

	private static List<String> filterString(List<String> lst) {
		return lst.stream().filter(st->st.charAt(0)=='a'&&st.length()==3).collect(Collectors.toList());
	}

}

