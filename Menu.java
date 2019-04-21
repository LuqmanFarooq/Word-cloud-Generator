package ie.gmit.sw;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Menu{
	int maxWords;
	String fileName;
	String url;
	String imgFileName;
	int option;
	int fileOrUrl=0;
	
	Scanner console = new Scanner(System.in);
	
	public void printMenu() {
		
		System.out.println("** Word Cloud Generator **");
		System.out.println("Select 1 to enter file name\nSelect 2 to enter url\nSelect 3 to enter number of words to display\nSelect 4 to enter name of the image\nSelect 5 to Quit");
		option=console.nextInt();
		while(option!=5) {
			switch (option) {
			case 1:
				System.out.println("Enter the name of the file: ");
				fileName=console.next();
				fileOrUrl=1;
				break;
			case 2:
				System.out.println("Enter the name of the URL: ");
				url=console.next();
				fileOrUrl=2;
				break;
			case 3:
				System.out.println("Enter the maximum number of words to display: ");
				maxWords=console.nextInt();
				break;
			case 4:
				System.out.println("Enter the file name of the word-cloud image to save: ");
				imgFileName=console.next();
				break;

			default:
				break;
			}
			System.out.println("Select 1 to enter file name or Select 2 to enter url\nSelect 3 to enter number of words to display\nSelect 4 to enter name of the image\nSelect 5 to Quit");
			option=console.nextInt();
		}
	}
}
