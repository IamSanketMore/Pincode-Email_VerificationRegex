import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPattern
{

	public void checkPinCode(String pincode)
	{
		String regex = "[0-9]{6}";

		Pattern patternChecker = Pattern.compile(regex);
		Matcher matchChecker = patternChecker.matcher(pincode);

		if(matchChecker.matches())
		{
			System.out.println("Valid PinCode");
		}
		else
		{
			System.out.println("InValid PinCode");
		}
		
	}
	public static void main(String args [])
	{
		Scanner scanReader = new Scanner(System.in);

		RegexPattern code = new RegexPattern();

		System.out.println("Enter PinCode:-");
		String pinCode = scanReader.nextLine();
		code.checkPinCode(pinCode);
		
		scanReader.close();
	}
}