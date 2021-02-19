import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPattern
{
	public void Email(String emailId)
	{
		//------------Regex------------------
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?@[a-z]+[.][a-z]{2,4}$";

		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(emailId);

		//-------------Check valid or Not-----
		if(matchChecker.matches())
			System.out.println("Valid Email");
		else
			System.out.println("InValid Email");
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		RegexPattern code = new RegexPattern();

		System.out.println("Enter Email:-");
		String email = scanReader.nextLine();
		code.Email(email);

		scanReader.close();
	}
}
