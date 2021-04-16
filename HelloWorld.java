package code;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileWriter;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this needs to be made into a school class
		String assign1[] = {"work on mortar aiming", "work on horizontal"};
		School s1 = new School(LocalTime.of(10, 30), LocalDate.of(2021, 4, 17), "Ty's house", "Senior Design", 98, 3, assign1);
		
		String assign2[] = {"video game"};
		School s2 = new School(LocalTime.of(23, 59), LocalDate.of(2021, 5, 1), "n/a", "Video Game Design", 99, 3, assign2);
		
		String muscles1[] = {"lower back", "deltoids", "biceps"};
		Workout w1 = new Workout(LocalTime.of(7, 0), LocalDate.of(2021, 4, 17), "gym", muscles1, 578);
		
		String muscles2[] = {"pectorals", "triceps", "abs"};
		Workout w2 = new Workout(LocalTime.of(5, 30), LocalDate.of(2021, 4, 19), "gym", muscles2, 495);
		
		String muscles3[] = {"hiking"};
		Workout w3 = new Workout(LocalTime.of(7, 45), LocalDate.of(2021, 4, 18), "Monte Sano", muscles3, 317);
		
		Activity a1 = new Activity(LocalTime.of(15, 30), LocalDate.of(2021, 4, 20), "Moderne", "Move In!");
		Activity a2 = new Activity(LocalTime.of(19, 21), LocalDate.of(2021, 4, 17), "Home", "date night");
		Activity a3 = new Activity(LocalTime.of(20, 30), LocalDate.of(2021, 4, 23), "Moderne", "Familt here");
		
		Activity acts[] = {a1, a2, a3, s1, s2, w1, w2, w3};
		String filepath = "C:\\Users\\bjones.ext\\Desktop\\javaTest.txt";
		
		try {
			FileWriter fo = new FileWriter(filepath);
			FileOutputStream fileOut = new FileOutputStream(filepath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			
			//byte[] bytesArr;
			for (int i = 0; i < acts.length; i++)
			{
				//bytesArr = acts[i].getExtraInfo().getBytes();
				fo.write(acts[i].getExtraInfo());
				objectOut.writeObject(acts[i]);
			}
			
			//objectOut.writeObject(s1);
			objectOut.close();
			fo.close();
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		String testIn;
		try {
			Scanner scan = new Scanner(filepath);
			FileInputStream fileIn = new FileInputStream(filepath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			testIn = scan.nextLine();
			switch(testIn) {
			case "school":
				School sTest = new School();
				sTest = (School) objectIn.readObject();
				System.out.println(sTest.getTime());
				System.out.println(sTest.getDate());
				System.out.println(sTest.getLocation());
				System.out.println(sTest.getExtraInfo());
				System.out.println(sTest.getCourse());
				System.out.println(sTest.getGrade());
				System.out.println(sTest.getHours());
				
				String asgn[] = sTest.getAssignments();
				for (int i = 0; i < asgn.length; i++)
				{
					System.out.println(asgn[i]);
				}
				break;
			case "workout":
				Workout wTest = new Workout();
				wTest = (Workout) objectIn.readObject();
				System.out.println(wTest.getTime());
				System.out.println(wTest.getDate());
				System.out.println(wTest.getLocation());
				System.out.println(wTest.getExtraInfo());
				String wAsgn[] = wTest.getMuscles();
				for (int i = 0; i < wAsgn.length; i++)
				{
					System.out.println(wAsgn[i]);
				}
				System.out.println(wTest.getCalories());
				break;
			default:
				Activity aTest = new Activity();
				aTest = (Activity) objectIn.readObject();
				System.out.println(aTest.getTime());
				System.out.println(aTest.getDate());
				System.out.println(aTest.getLocation());
				System.out.println(aTest.getExtraInfo());
				break;
			}		
			scan.close();
			objectIn.close();
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		

	}
}
