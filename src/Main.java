import java.util.Scanner;


public class Main {

	private static Scanner reader;
	private static Scanner reader2;

	
	static void commandConsole(SodaMachine machine){
		System.out.println("##############################\n"
				+ "CONSOLE COMMAND:\n"
				+ "Machine Manufacturer: " + machine.getMachineManufacturer()
				+ "\nMachine ID Number: " + machine.getMachineNo()
				+ "\nMachine Inventory: \n" + machine.printInventory()
				+ "\nMachine History: \n" + machine.getHistory());
	}
	public static void main(String[] args) {
		reader = new Scanner(System.in);
		reader2 = new Scanner(System.in);
		SodaMachine machine = new SodaMachine();
		
		Boolean gameLoop = true;
		while(gameLoop){
		//System.out.println("[1]\tVend an Item\n[2]\tRestock All Items\n[3]\tView Inventory");
		//int menuChoice = reader.nextInt();
		//String input;
		
		//Welcome
		System.out.println("Vending Machine:");
		System.out.println("Please insert money");
		
		//Add Money
		int inputMoney = reader.nextInt();
		
		//Print Current money
		System.out.println("Current Money: " + inputMoney);
		
		//Choose item
		System.out.println("Please Choose an item to Vend: [COKE][PEPSI][MILK][MONSTER][SOCKS]");
		String input = reader2.nextLine();
		input.toLowerCase();
		//System.out.println(input);
		switch(input){
		case "coke":
			machine.vend(0,0);
			System.out.println("Vended Coke");
			break;
		case "pepsi":
			machine.vend(0,1);
			System.out.println("Vended Pepsi");
			break;
			
		case "milk":
			machine.vend(0,2);
			System.out.println("Vended Milk");
			break;
		case "monster":
			machine.vend(0,3);
			System.out.println("Vended Monster");
			break;
		case "socks":
			machine.vend(0,4);
			System.out.println("Vended Socks");
			break;
		case "666":
			commandConsole(machine);System.out.println("\n");break;
		default:
			System.out.println("That is not an option");
		}
		
		//vend item
		
		//Give Change
		double change = inputMoney-machine.getMoneySpent();
		System.out.println("Your change is: " + change);
		
		//repeat
		
			
			
			//switch(menuChoice){
			/*case 1:
				System.out.println("Type in an item name to vend:");
				input = reader2.nextLine();
				input.toLowerCase();
				//System.out.println(input);
				switch(input){
				case "coke":
					machine.vend(0,0);
					System.out.println("Vended Coke");
					break;
				case "pepsi":
					machine.vend(0,1);
					System.out.println("Vended Pepsi");
					break;
					
				case "milk":
					machine.vend(0,2);
					System.out.println("Vended Milk");
					break;
				case "monster":
					machine.vend(0,3);
					System.out.println("Vended Monster");
					break;
				case "socks":
					machine.vend(0,4);
					System.out.println("Vended Socks");
					break;
				default:
					System.out.println("That is not an option");
				}
				break;*/
			/*case 2:
				machine.refillInventory();
				break;
			case 3:
				System.out.println(machine.printInventory());
				break;
			case 666:
				System.out.println("##############################\n"
						+ "CONSOLE COMMAND:\n"
						+ "Machine Manufacturer: " + machine.getMachineManufacturer()
						+ "\nMachine ID Number: " + machine.getMachineNo()
						+ "\nMachine Inventory: \n" + machine.printInventory()
						+ "\nMachine History: \n" + machine.getHistory());
				break;
			default:
				System.out.println("That is not an option");
		}*/
		//System.out.println(machine.toString());
		
		//Input
		
		}
	}

}
