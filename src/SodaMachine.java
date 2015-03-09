import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class SodaMachine {
	//Fields
	private Soda[][] inventory = new Soda[10][5];
	private final int machineNo = (100000 + (int)(Math.random() * ((999999 - 100000) + 1)));
	private ArrayList<String> history = new ArrayList<String>();
	private final String machineManufacturer = "Seaga Manufacturing";
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date;
	Calendar cal;
	private double moneySpent = 0;
	
	//Constructor
	public SodaMachine(){
		refillInventory();
	}
	
	//AM
	public double getMoneySpent() {return moneySpent;}
	public int getMachineNo() {return machineNo;}
	public String getMachineManufacturer() {return machineManufacturer;}
	
	//Methods
	private void setHistory(String input){
		date = new Date();
		cal = Calendar.getInstance();
		history.add(dateFormat.format(date) + " - " + input);
	}
	public String getHistory(){
		String result = "";
		for(String h : history){
			result += "\n" + h;
		}
		return result;
	}
	public void refillInventory(){
		setHistory("Inventory Refilled");
		for (int rows = 0; rows < inventory.length; rows++) {
		    for (int columns = 0; columns < inventory[rows].length; columns++) {
		        switch(columns){
		        case 0:
		        inventory[rows][columns] = new Soda("Coke",15);break;
		        case 1:
		        inventory[rows][columns] = new Soda("Pepsi",15);break;
		        case 2:
		        inventory[rows][columns] = new Soda("Milk",15);break;
		        case 3:
		        inventory[rows][columns] = new Soda("Monster",15);break;
		        case 4:
		        inventory[rows][columns] = new Soda("Socks",15);break;
		        }
		    }//end of columns loop
		}//end of rows loop
		
	}//End of method
	
	
	public String printInventory(){
		setHistory("Printed Inventory");
		String result = "";
		for(int rows = 0; rows < inventory.length; rows++){
		    for(int columns = 0; columns < inventory[rows].length; columns++){
		        result+=(inventory[rows][columns] + " |");
		        if(columns < inventory[rows].length - 1){ result+=(" ");}
		    }//end of columns
		    result+="\n";
		}//end of rows

		    
		return result;
	}//end of method
	
	public String vend(int r,int c){
		String result = "";
		if(inventory[r][c] == null){
			//System.out.println("new" + c + " " + r);
			try{
			vend(r+1,c);}
			catch(Exception e){
				System.out.println("Sorry, We are out of that soda");
				
			}
		}
		else{
			//System.out.println("new" + c + " " + r);
			String sodaType = "";
			switch(c){
			case 0: sodaType = "Coke"; moneySpent+=2;break;
			case 1: sodaType = "Pepsi"; moneySpent+=2.50;break;
			case 2: sodaType = "Milk"; moneySpent+=1.75;break;
			case 3: sodaType = "Monster"; moneySpent+=5.5;break;
			case 4: sodaType = "Socks"; moneySpent+=8;break;
			}
			setHistory("Vended a " + sodaType);
			inventory[r][c] = null;
		}
		return result;
	}
	//tostring
	@Override
	public String toString(){
		return "Manufacturer: \n\t" + machineManufacturer + "\nMachine Number: \n\t" + machineNo + "\nInventory: \n" + printInventory();
	}
	
}
