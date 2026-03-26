package creditCard;
import java.util.Scanner;
import java.io.File;


public class CC_Driver {

	public static void main(String[] args) throws Exception{
		Ar_UListCC testList = new Ar_UListCC();
		Scanner rowScanner = new Scanner(new File("src/creditcard_balanced.csv"));
		Scanner columnScanner;
		rowScanner.nextLine();
		while (rowScanner.hasNextLine()) {
			String rowString = rowScanner.nextLine();
			columnScanner = new Scanner(rowString);
			columnScanner.useDelimiter(",");
			
			int newTime = Integer.parseInt(columnScanner.next());
			double newAmount = Double.parseDouble(columnScanner.next());
			int newClass = Integer.parseInt(columnScanner.next());
			
			CCFraudRecord newRecord = new CCFraudRecord(newTime, newAmount, newClass);
			testList.putItem(newRecord);
		}
		rowScanner.close(); //closes the file, which is best practice since they stay open otherwise
		testList.printList();
	}

}
