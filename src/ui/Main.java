/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID : A00358891
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: ALEJANDRO GARCIA QUIÑONEZ <alejo.gar.122@gmail.com>
 * 
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */
package ui;

import model.*;	
import java.util.*;

/**
 * This class print all the program.
 * @see  java.lang.Object
 * @author Alejandro Garcia.<br>
 */
public class Main{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//-------------------------------------------------------------------------------------------------- 
	private Scanner reader;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private Veterinary shop;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
		public Main() {
			initial();
			reader = new Scanner(System.in);
		}

	public void initial() {
		shop = new Veterinary();	

		MiniRoom room1 = new MiniRoom(true, 1, "", "", null);
		MiniRoom room2 = new MiniRoom(true, 2, "", "", null);
		MiniRoom room3 = new MiniRoom(true, 3, "", "", null);
		MiniRoom room4 = new MiniRoom(true, 4, "", "", null);
		MiniRoom room5 = new MiniRoom(true, 5, "", "", null);
		MiniRoom room6 = new MiniRoom(true, 6, "", "", null);
		MiniRoom room7 = new MiniRoom(true, 7, "", "", null);
		MiniRoom room8 = new MiniRoom(true, 8, "", "", null);
		
		shop.createRooms(room1, room2, room3 ,room4, room5, room6, room7, room8);

		Person sebas = new Person("Sebastian Barrera", "1144105003", "Cra 68 # 16 - 07", "3214650140");
		Pet luna = new Pet("Luna", "Dog", 1.0, 15.0, 0.37, sebas);
		ArrayList<Pet> sebasPets = new ArrayList<Pet>();
		sebasPets.add(luna);
		
		shop.createPerson(sebas, sebasPets);

		Person valen = new Person("Valentina Caicedo", "100527565", "Cra 96 # 34 - 78", "3137985448");
		Pet rocco = new Pet("Rocco", "Dog", 1.0, 23.0, 0.47, valen);
		ArrayList<Pet> valenPets = new ArrayList<Pet>();
		valenPets.add(rocco);
		
		shop.createPerson(valen, valenPets);
		
		Person lina = new Person("Lina Maria Insuasty", "1006078287", "Roosevelt Ave", "5142841922");
		Pet paul = new Pet("Paul", "Other", 7.0, 70.0, 1.80, lina);
		Pet daisy = new Pet("Daisy", "Dog", 3.0, 39.0, 1.0, lina);
		ArrayList<Pet> gretelPets = new ArrayList<Pet>();
		gretelPets.add(paul); 
		gretelPets.add(daisy);
		
		shop.createPerson(lina, gretelPets);

		DateIn daisyDate = new DateIn (12, 3, 2019);
		MedRecord daisyMedRec = new MedRecord("", "", "Persistent sneeze ", "Pacient seems to have a flu", "Open", daisyDate , daisy);
		ArrayList<ReqMed> petsMedsDaisy = new ArrayList<ReqMed>();
		ReqMed noxpirin = new ReqMed("Noxpirin", 24, 2000, "every 7 hours");
		petsMedsDaisy.add(noxpirin);
		
		shop.startHospitalizeVet("Lina Maria Insuasty", "1006078287", "Daisy", daisyMedRec, petsMedsDaisy, daisy);

		DateIn paulDate = new DateIn (21, 1, 2019);
		MedRecord paulMedRec = new MedRecord("", "", "Low blood pressure ", "Pacient seems to have a diabetes", "Open", paulDate , paul);
		ArrayList<ReqMed> petsMedsPaul = new ArrayList<ReqMed>();
		ReqMed metformin = new ReqMed("Metformin", 21, 4600, "every 12 hours");
		ReqMed chocolate = new ReqMed("Chocolate", 1, 22600, "once a month");
		petsMedsPaul.add(metformin);
		petsMedsPaul.add(chocolate);

		shop.startHospitalizeVet("Lina Maria Insuasty", "1006078287", "Paul", paulMedRec, petsMedsPaul, paul);

		Person pablolondra = new Person("Pablo Londra", "1001237483", "Little Puerto Rico", "3128934055");
		Pet arnold = new Pet("Arnold", "Cat", 2.0, 20.0, 0.48, pablolondra);
		Pet francis = new Pet("Francis", "Bird", 4.0, 3.2, 0.15, pablolondra);
		ArrayList<Pet> pablolondraPets = new ArrayList<Pet>();
		pablolondraPets.add(arnold); 
		pablolondraPets.add(francis);
		
		shop.createPerson(pablolondra, pablolondraPets);

		DateIn arnoldDate = new DateIn (2, 1, 2019);
		MedRecord arnoldMedRec = new MedRecord("", "", "Chills, persistent diarrhea, vomiting ", 
											   "Pacient seems to have cancer", "Open", arnoldDate , francis);
		ArrayList<ReqMed> petsMedsArnold = new ArrayList<ReqMed>();
		ReqMed acetaminophen = new ReqMed("Acetaminophen", 24, 2000, "every 7 hours");
		petsMedsArnold.add(acetaminophen);
		
		shop.startHospitalizeVet("Pablo Londra", "1001237483", "Arnold", arnoldMedRec, petsMedsArnold, arnold);

		DateIn francisDate = new DateIn (12, 2, 2019);
		MedRecord aMedRec = new MedRecord("", "", "Weakness, fatigue, persistent diarrhea, vomiting ",
										  "Pacient seems to have aids", "Open", francisDate , francis);
		ArrayList<ReqMed> petsMeds = new ArrayList<ReqMed>();
		ReqMed dolex = new ReqMed("Dolex", 12, 3000, "every 3 hours");
		petsMeds.add(dolex);

		shop.startHospitalizeVet("Pablo Londra", "1001237483", "Francis", aMedRec, petsMeds, francis);		
	}

	public static void main(String[] args) {
		Main execute = new Main();
		execute.showHeader();
		execute.menu();	
	}

	public void showHeader() {
		System.out.println("*****************************************************************************************************************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("***************************                                                                       ***************************");
		System.out.println("***************************            HI! WELCOME TO THE VETERINARY MONITORING PROGRAM           ***************************");
		System.out.println("***************************                                                                       ***************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("");
		String contin = reader.nextLine();
	}

	public void showMenuOptions() {
		System.out.println("");
		System.out.println("");
		Calendar c1 = GregorianCalendar.getInstance();
		System.out.println("															" + c1.getTime().toLocaleString() + "			           									 ");
		System.out.println("_________________________________________________________________________________________________________________________________________________________");
		System.out.println("|                                                                                                                                                       |");
		System.out.println("|                                                                        OPTIONS MENU                                                                   |");
		System.out.println("|                                                               CHOOSE AN OPTION WITH THE NUMBER                                                        |");
		System.out.println("|_______________________________________________________________________________________________________________________________________________________|");
		System.out.println("|                  |                  |                  |                  |                  |                  |                  |                  |");
		System.out.println("|     Register     |   show clients   |   contact info   |  Register a done |    Hospitalize   |   show medical   |  edit a medical  |      Remove      |");
		System.out.println("|      client      |      & pets      |       info       |      service     |      a pet       |     records      |    pet record    |      a pet       |");
		System.out.println("|                  |    information   |                  |                  |   			   |                  |                  |                  |");
		System.out.println("|         1        |        2         |        3         |        4         |        5         |        6         |        7         |        8         |");
		System.out.println("|__________________|__________________|__________________|__________________|__________________|__________________|__________________|__________________|");
		System.out.println("|                  |                  |                  |                  |                  |                                                        |");
		System.out.println("|       Total      |   Show average   |    Show rooms    |     records      |   edit client    |                                                        |");
		System.out.println("|      income      |income per service|     occupied     |    of a pet      |   information    |                                                        |");
		System.out.println("|                  |                  |                  |                  |                  |                                                        |");
		System.out.println("|         9        |        10        |         11       |        12        |        13        |                                                        |");
		System.out.println("|__________________|__________________|__________________|__________________|__________________|________________________________________________________|");	
	}

	public void typeSelectionMssg() {	
		System.out.println("--------------------------------------");
		System.out.print("| Type the number of your selection: ");	
	} 

	public void plainLine() {
		System.out.println("--------------------------------------");
	}

	public void menu() {
		boolean back = false;
		System.out.println("");
		System.out.println("");                                                  
		while (!back) {
			showMenuOptions();
			System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			int option = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");
			switch (option) {
				case 1: 
					registerAClient();
				break;
				case 2: 
					clientsInformation();
				break; 				
				case 3: 
					contactInformation(); 
				break;				
				case 4: 
					registerAService();
				break;				
				case 5:
					hospitalizeAPet();
				break; 				
				case 6: 
					showMedRecsFromHPet();
				break; 				
				case 7: 
					editMedRec();
				break;				
				case 8: 
					dischargeAPet();
				break;				
				case 9: 
					showIncome();
				break;				
				case 10: 
					showAverageIncome();
				break;				
				case 11: 
					showMiniRoomNumberByPetsName();
				break;				
				case 12: 
					showAllMedRecs4Pet();
				break;				
				case 13: 
					changeClientsInfo();
					break;				
				case 0: 
					getOut();
					back = false;
				break;
			}
		}
	}

	public void registerAClient() {
		System.out.println("");
		System.out.print("Please type the client's full name: "); 
		String name = reader.nextLine();
		System.out.print("Please type the client's ID: "); 
		String id = reader.nextLine();
		System.out.print("Please type the client's address: "); 
		String address = reader.nextLine();
		System.out.print("Please type the client's phone number: "); 
		String phone = reader.nextLine();
		System.out.println("");
		if (!(name.equals("")) && !(id.equals("")) && !(address.equals("")) && !(phone.equals(""))) {
			Person theNew = new Person(name, id, address, phone);
			System.out.print("How many pets of the client are customers here?\n"); 
			int timess = reader.nextInt();
			reader.nextLine();
			ArrayList<Pet> clientsPets = new ArrayList<Pet>();
			for(int i = 0; i < timess; ++i) {
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("Please type the pet's full name: "); 
				String petsName = reader.nextLine();
				System.out.println("");
				System.out.println("Please choose the pet's species: "); 
				System.out.println("1. Dog.");
				System.out.println("2. Cat.");
				System.out.println("3. Bird.");
				System.out.println("4. Other.");
				System.out.println("");
				typeSelectionMssg();
				int choise = reader.nextInt(); 
				reader.nextLine();
				plainLine();
				System.out.println("");
				String species = shop.convertChoise2Type(choise);
				System.out.print("Please type the pet's age (years): "); 
				double age = reader.nextDouble(); 
				reader.nextLine();
				System.out.println("");
				System.out.print("How much does the pet weight (Kg)? "); 
				double weight = reader.nextDouble(); 
				reader.nextLine();
				System.out.println("");
				System.out.print("How tall is the pet (metres)? "); 
				double height = reader.nextDouble(); 
				reader.nextLine();
				System.out.println("");
				System.out.println("");
				if (species.equals("ERROR: Invalid species selection.")) {
					System.out.println(species);
					--i;
				} else { 
					Pet theNewPet = new Pet(petsName, species, age, weight, height, theNew);
					clientsPets.add(theNewPet);
				}	
			}
			shop.createPerson(theNew, clientsPets);
			System.out.println("*******************************************\n");
			System.out.println("* New client has been successfully added! *\n");
		 	System.out.println("*******************************************\n");
		} else {System.out.println("ERROR: Missing information.");}		
	}

	public void clientsInformation() {
		System.out.println("");
		System.out.print("Please type the client's full name to get his/her information: "); 
		String clients = reader.nextLine();
		System.out.print("Please type the client's ID to get his/her information: "); 
		String clientsId = reader.nextLine();
		System.out.println("");
		System.out.println(shop.showClientsInfo(clients, clientsId));
		System.out.println("");
	}

	public void getOut() {
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("");
		System.out.println("THANK YOU FOR USING MY LIL PET SOFTWARE");
		System.out.println("");
	}
						
	public void contactInformation() {
		System.out.println("");
		System.out.println("Please choose which kind of customer you will type his/her/its full name: "); 
		System.out.println("1. Person.");
		System.out.println("2. Animal."); 
		System.out.println("");
		typeSelectionMssg();
		int kind = reader.nextInt(); 
		reader.nextLine();
		plainLine();
		if (kind == 1 || kind == 2) {
			System.out.print("Please type the full name: "); 
			String theName = reader.nextLine();
			System.out.println("");
			System.out.print("Please type the person's ID if you picked Person on the first question, otherwise just press ENTER : "); 
			String personId = reader.nextLine();
			System.out.println("");
			System.out.println(shop.showContactInfo(kind, theName, personId));
		} else {
			System.out.println("ERROR: Invalid selection.");
			System.out.println("");
		}
	}

	public void hospitalizeAPet() {
		if (shop.miniRoomAvailable()) {
			System.out.println("");
			System.out.print("Please type the pet's full name: "); 
			String petsName = reader.nextLine();
			System.out.print("Please type the owner's full name: "); 
			String name = reader.nextLine();
			System.out.print("Please type the owner's ID: "); 
			String id = reader.nextLine();
			System.out.println("");
			System.out.println("");
			if (shop.checkOwner(name, id, petsName)) {
				System.out.println("*************************************************");
				System.out.println("*** NEEDED INFORMATION FOR THE MEDICAL RECORD ***");
				System.out.println("*************************************************");
				System.out.println("");
				System.out.print("Please type the day that the pet got hospitalized: "); 
				int day = reader.nextInt(); 
				reader.nextLine();
				System.out.print("Please type the month that the pet got hospitalized: "); 
				int month = reader.nextInt(); 
				reader.nextLine();
				System.out.print("Please type the year that the pet got hospitalized: "); 
				int year = reader.nextInt(); 
				reader.nextLine();
				Calendar today = new GregorianCalendar();
					int yearT = today.get(Calendar.YEAR);
				if (year <= yearT ) {
					DateIn newDateIn = new DateIn(day, month, year);
					System.out.print("Please type the pet's symptoms, if you do not know them just press ENTER and add them later: "); 
					String symptoms = reader.nextLine();
					System.out.print("Please type the pet's diagnosys, if you do not know it just press ENTER and add it later: "); 
					String diagnosys = reader.nextLine();
					System.out.println("");
					Pet sick = shop.retrievePet(name, id, petsName);
					MedRecord newMedRec = new MedRecord("", "", symptoms, diagnosys, "Open", newDateIn, sick);
					System.out.println("******************");
					System.out.println("*** MEDICATION ***");
					System.out.println("******************");
					System.out.println("");
					System.out.print("How many prescribed medicines does the pet have?\n");
					int quantity = reader.nextInt();
					reader.nextLine();
					ArrayList<ReqMed> petsMeds = new ArrayList<ReqMed>();
					for(int i = 0; i < quantity; ++i) {
						System.out.println("");
						System.out.println("___________________________________________________________________");
						System.out.print("Please type the medicine's name: "); 
						String medsName = reader.nextLine();
						System.out.print("Please type the medicine's dose: "); 
						double medsDose = reader.nextDouble(); 
						reader.nextLine();
						System.out.print("Please type the medicine's price per dose: "); 
						double medsPrice = reader.nextDouble(); 
						reader.nextLine();
						System.out.print("Please type the medicine's frecuency: "); 
						String medsFrecuency = reader.nextLine();
						ReqMed newMed = new ReqMed(medsName, medsDose, medsPrice, medsFrecuency);
						if (!(medsName.equals("")) && medsDose != 0 && !(medsFrecuency.equals(""))) {
							petsMeds.add(newMed);
						}
					}
					shop.startHospitalizeVet(name, id, petsName, newMedRec, petsMeds, sick);
					System.out.println("");
					System.out.println(petsName+" was successfully hospitalized!");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("ERROR: Invalid date.");
					System.out.println("");
				}

			} else {
				System.out.println("");
				System.out.println("ERROR: No match found.");
				System.out.println("");
			}
		} else {
			System.out.println("");
			System.out.println("ERROR: All rooms are occupied.");
			System.out.println("");
		}
	}

	public void showIncome() {
		System.out.println("");
		System.out.println("TOTAL INCOME: "+shop.totalIncome()+" COP");
		System.out.println("");
		System.out.println("INCOME BY SERVICE ");
		System.out.println("Income for hospitalizations: "+shop.gatherAllHospitalizationFees()+" COP");
		System.out.println("Income for baths: "+shop.feeServicesVeterinary(1)+" COP");
		System.out.println("Income for baths to go: "+shop.feeServicesVeterinary(2)+" COP");
		System.out.println("Income for dental prophylaxis: "+shop.feeServicesVeterinary(3)+" COP");
		System.out.println("Income for cutting nails: "+shop.feeServicesVeterinary(4)+" COP");
		System.out.println("Income for vaccinations: "+shop.feeServicesVeterinary(5)+" COP");
		System.out.println("");
	}


	public void showAverageIncome() {
		System.out.println("");
		System.out.println("AVERAGE INCOME BY SERVICE");
		System.out.println("");
		System.out.println("Hospitalizations: "+shop.hospitalizationAverage()+" COP");
	}

	public void showMedRecsFromHPet() {
		System.out.println(shop.medRecsFromHPet());
	}


	public void showMiniRoomNumberByPetsName() {
		System.out.println("");
		System.out.print("Please type the pet's full name: ");
		String petsName = reader.nextLine();
		int theNumber = shop.retrieveNumberMiniRoom(petsName);
		if (theNumber != 0) {
			System.out.println("The number of the mini room occupied by " +petsName+ " is " +theNumber);
		} else {
			System.out.println("ERROR: No match found");
		}
	}

	public void showAllMedRecs4Pet() {
		System.out.println("");
		System.out.print("Please type the pet's full name: ");
		String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: ");
		String name = reader.nextLine();
		System.out.print("Please type the owner's ID: ");
		String id = reader.nextLine();
		System.out.println("");
		if (shop.checkOwner(name, id, petsName)) {
			String records = shop.showAPetMedRecs(name, id, petsName);
			if (records.equals("")) {
				System.out.println("This pet does not have any medical record.");
			} else {
				System.out.println("");
				System.out.println(records);
			}
		} else {
			System.out.println("ERROR: No match found");
		}
	}

	public void dischargeAPet() {
		System.out.println("");
		System.out.print("Please type the pet's full name: ");
		String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: ");
		String name = reader.nextLine();
		System.out.print("Please type the owner's ID: ");
		String id = reader.nextLine();
		System.out.println("");
		if (shop.checkOwner(name, id, petsName)) {
			if (shop.retrieveNumberMiniRoom(petsName) != 0 ) {
			System.out.println(shop.showAPetMedRecs(name, id, petsName));
			shop.removePet(name, id, petsName);
			System.out.println("");
			System.out.println(petsName+" has been successfully discharged!");
			} else { 
				System.out.println("This pet does not have any medical record.");
			}

		} else {
			System.out.println("ERROR: No match found"); 
		}

	}

	public void editMedRec() {
		System.out.println("");
		System.out.print("Please type the pet's full name: ");
		String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: ");
		String name = reader.nextLine();
		System.out.print("Please type the owner's ID: ");
		String id = reader.nextLine();
		System.out.println("");
		if (shop.checkOwner(name, id, petsName)) {
			if (shop.retrieveNumberMiniRoom(petsName) != 0 ) {
			System.out.println("");
			System.out.println("Please select what you would like to add:");
			System.out.println("1. Symptoms.");
			System.out.println("2. Diagnosys.");
			System.out.println("3. Prescribed medication.");
			typeSelectionMssg();
			int edition = reader.nextInt();
			reader.nextLine();
			plainLine();
			String symptomsEdit = "";
			String diagnosysEdit = "";
			String medsName = "";
			double medsDose = 0.0;
			double medsPrice = 0.0;
			String medsFrecuency = "";			
			switch (edition) {
				case 1: 	
					System.out.print("Please type the pet's symptoms: ");
					symptomsEdit = reader.nextLine();
					shop.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit,
														 medsName, medsDose, medsPrice, medsFrecuency);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
				break;
				case 2: 
					System.out.print("Please type the pet's diagnosys: ");
					diagnosysEdit = reader.nextLine();
					shop.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit,
														 medsName, medsDose, medsPrice, medsFrecuency);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
				break;
				case 3:
					System.out.println("");
					System.out.print("Please type the medicine's name: "); 
					medsName = reader.nextLine();
					System.out.print("Please type the medicine's dose: "); 
					medsDose = reader.nextDouble();
					reader.nextLine();
					System.out.print("Please type the medicine's price per dose: "); 
					medsPrice = reader.nextDouble();
					reader.nextLine();
					System.out.print("Please type the medicine's frecuency: "); 
					medsFrecuency = reader.nextLine();
					if (!(medsName.equals("")) && medsPrice > 0 && medsDose > 0 ) {
						System.out.println("");
						System.out.println(shop.locatePersonWithPet2AddStuff(name, id, petsName, edition,
																				symptomsEdit, diagnosysEdit, 
																				medsName, medsDose, medsPrice, 
																				medsFrecuency));
						System.out.println("");						
					} else {
						System.out.println("ERROR: Prescribed medication could not be added, fields are incomplete");
					}			
				break;
				
				default: 
					System.out.println("");
					System.out.println("ERROR: Invalid selection.");
					System.out.println("");
					break;
				}
			} else {
				System.out.println("ERROR: Pet does not have an open medical record");
			}

		} else {
			System.out.println("ERROR: No match found");
		}

	}


	public void changeClientsInfo() {
		System.out.println("");
		System.out.print("Please type the owner's full name: ");
		String name = reader.nextLine();
		System.out.print("Please type the owner's ID: ");
		String id = reader.nextLine();
		System.out.println("");
		System.out.println("Please select what you would like to edit:");
		System.out.println("1. Address.");
		System.out.println("2. Phone.");
		typeSelectionMssg();
		int edition = reader.nextInt();
		reader.nextLine();
		plainLine();
		String newAddress = "";
		String newPhone = "";
		switch (edition) {
			case 1: 
				System.out.print("Please type the new address: ");  
				newAddress = reader.nextLine();
				System.out.println("");
				System.out.println(shop.changeClientInfo(name, id, newAddress, newPhone));
				break;
			case 2:	
				System.out.print("Please type the new phone number: ");  
				newPhone = reader.nextLine();
				System.out.println("");
				System.out.println(shop.changeClientInfo(name, id, newAddress, newPhone));
				break;
			default:
				System.out.println("");
				System.out.println("ERROR: Invalid selection.");
				System.out.println("");
				break;	
		}
	}

	public void registerAService() {
		System.out.println("");
		System.out.print("Please type the pet's full name: "); 
		String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: "); 
		String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); 
		String id = reader.nextLine();
		System.out.println("");
		if (shop.checkOwner(name, id, petsName)) {
			System.out.println("Please select the service to register:");
			System.out.println("1. Bath.");
			System.out.println("2. Bath to go.");
			System.out.println("3. Dental prophylaxis.");
			System.out.println("4. Cutting nails.");
			System.out.println("5. Vaccination.");
			typeSelectionMssg();
			int serviceSelection = reader.nextInt(); 
			reader.nextLine();
			plainLine();
			char serviceChar = shop.convertChoise2Char(serviceSelection);
			if (serviceChar != 'a') {
				System.out.println("");
				System.out.print("Please type the day that the service is taking/took place: "); 
				int day = reader.nextInt();
				reader.nextLine();
				System.out.print("Please type the month that the service is taking/took place: "); 
				int month = reader.nextInt();
				reader.nextLine();
				System.out.print("Please type the year that the service is taking/took place: "); 
				int year = reader.nextInt();
				reader.nextLine();
				Calendar today = new GregorianCalendar();
				int yearT = today.get(Calendar.YEAR);
				if (year <= yearT ) {
					DateIn newDateJob = new DateIn(day, month, year);
					Pet clientPet = shop.retrievePet(name, id, petsName);
					Service newService = new Service(serviceChar, id, petsName, clientPet, newDateJob);
					shop.startServiceVet(name, id, clientPet, newService);
					System.out.println("");
					System.out.println("The service has been successfully registered!");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("ERROR: Invalid date.");
					System.out.println("");
				}
			} else {
				System.out.println("");
				System.out.println("ERROR: Invalid selection.");
				System.out.println("");
			}
		} else {
			System.out.println("");
			System.out.println("ERROR: No match found.");
			System.out.println("");
		}
	}

}