package pep_task9.pep_task9;

import java.util.Arrays;
import java.util.List;
public class AverageOfList {
	public static void main1()
	{
		List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double a=avg(ls);
		System.out.println(a);
	}
	static double avg(List<Integer> ls)
	{
		int s=ls.stream().reduce(0,Integer::sum);
		return 1.0*s/ls.size();
	}
}
