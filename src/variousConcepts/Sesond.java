package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sesond {
public static void main (String[]args) {
		
		Scanner scn = new Scanner(System.in);
		WebDriver driver = new ChromeDriver(); // pollymorphism
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://codefios.com/ebilling/ ");
		driver.close();
}
}