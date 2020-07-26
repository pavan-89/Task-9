package pep_task9.pep_task9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Palindrome{
	public static void main1()
	{
		List<String> ls=Arrays.asList("ababa","madam","banana","refer","kayak","sir","computer");
		checkPalindrome(ls,PalindromeChecker::isPalindrome).forEach(System.out::println);
	}

	private static List<String> checkPalindrome(List<String> ls, Predicate<String> myPredicate) {
		return ls.stream().filter(st -> myPredicate.test(st)).collect(Collectors.toList());
	}
}

