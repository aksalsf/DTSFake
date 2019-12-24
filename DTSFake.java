import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DTSFake {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Array
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> educations = new ArrayList<>();
		ArrayList<Character> genders = new ArrayList<>();
		ArrayList<String> emails = new ArrayList<>();
		ArrayList<String> trainings = new ArrayList<>();
		ArrayList<String> trainingNames = new ArrayList<>();
		ArrayList<String> trainingDates = new ArrayList<>();
		ArrayList<String> trainingPlaces = new ArrayList<>();
		ArrayList<Integer> trainingPrices = new ArrayList<>();
		// Data Awal
		names.add("Aksal Syah Falah");names.add("Aldan Maulana Fajri");names.add("Amri Khoirul Hakim");names.add("Ardellia Putri Pertiwi");
		educations.add("SMK");educations.add("SMA");educations.add("SMA");educations.add("SMA");
		genders.add('L');genders.add('L');genders.add('L');genders.add('P');
		emails.add("aksal.sf@gmail.com");emails.add("aldan@gmail.com");emails.add("amri@gmail.com");emails.add("ardellia@gmail.com");
		trainings.add("Web Design");trainings.add("Game Developer");trainings.add("Web Design");trainings.add("Web Design");
		// data awal pelatihan
		trainingNames.add("Game Developer");
		trainingDates.add("10 Januari 2020");
		trainingPlaces.add("Nganjuk");
		trainingPrices.add(200000);
		trainingNames.add("Web Design");
		trainingDates.add("7 Januari 2020");
		trainingPlaces.add("Yogyakarta");
		trainingPrices.add(75000);
		// Start
		homeMenu(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
	}
	// Method untuk menu awal program
	public static void homeMenu(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		clearScreen();
		garis();
		System.out.println("\t\t\t\t\t\tPelatihan IT DTSFake");
		garis();
		System.out.println("Selamat datang, Admin!");
		System.out.println("1. Menu Peserta");
		System.out.println("2. Menu Pelatihan");
		System.out.println("3. Keluar");
		garis();
		System.out.print("pilih: ");
		// Membuat variabel input untuk aksi
		int does = data.nextInt();data.nextLine();
		// Aksi diteruskan ke method action
		homeMenuAction(does,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
	}
	public static void homeMenuAction(int does,ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		switch (does) {
			case 1: //Menu Peserta
				clearScreen();
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2: //Menu Pelatihan
				clearScreen();
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			default: //Keluar dari program
				break;
		}
	}
	public static void homeMenuPeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		garis();
		System.out.println("\t\t\t\t\t\t\tDashboard Peserta");
		garis();
		System.out.println("Selamat datang di Dashboard Peserta, Admin!");
		System.out.println("1. Pendaftaran Peserta Baru");
		System.out.println("2. Daftar Peserta");
		System.out.println("3. Cari Peserta");
		System.out.println("4. Ubah Data Peserta");
		System.out.println("5. Cetak Invoice");
		System.out.println("6. Hapus Data Peserta");
		System.out.println("7. Kembali ke Beranda");
		garis();
		System.out.print("pilih: ");
		int does = data.nextInt();data.nextLine();
		homeMenuPesertaAction(does,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
	}
	public static void homeMenuPesertaAction(int does, ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		switch (does) {
			case 1:
				inputPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				clearScreen();
				printPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				clearScreen();
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 4:
				clearScreen();
				updatePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 5:
				clearScreen();
				printInvoice(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 6:
				clearScreen();
				deletePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			default:
				homeMenu(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void inputPeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		clearScreen();
		garis();
		System.out.println("\t\t\t\t\t\tPendaftaran Peserta Baru");
		garis();
		System.out.print("Nama: ");
		names.add(data.nextLine());
		garisSLine();
		inputEducation(educations);
		garisSLine();
		inputGender(genders);
		garisSLine();
		inputEmail(emails);
		garisSLine();
		inputTraining(trainings, trainingNames);

	}
	public static void inputEducation(ArrayList<String> array) {
		System.out.println("Pendidikan Terakhir");
		System.out.println("1. SD");
		System.out.println("2. SMP");
		System.out.println("3. SMA");
		System.out.println("4. SMK");
		System.out.println("5. Kuliah");
		System.out.println("6. Umum");
		System.out.print("pilih: ");
		int tempData = data.nextInt();data.nextLine();
		switch (tempData) {
			case 1: array.add("SD"); break;
			case 2: array.add("SMP"); break;
			case 3: array.add("SMA"); break;
			case 4: array.add("SMK"); break;
			case 5: array.add("Kuliah"); break;
			case 6: array.add("Umum"); break;
			default: System.out.println("Data tidak valid!"); inputEducation(array); break;
		}
	}
	public static void inputGender(ArrayList<Character> array) {
		System.out.print("Jenis kelamin (L/P): ");
		char tempData = data.next().charAt(0);data.nextLine();
		switch (tempData) {
			case 'L': array.add('L'); break;
			case 'l': array.add('L'); break;
			case 'P': array.add('P'); break;
			case 'p': array.add('P'); break;
			default: System.out.println("Data tidak valid!"); inputGender(array); break;
		}
	}
	public static void inputEmail(ArrayList<String> array) {
		System.out.print("Email: ");
		String tempData = data.nextLine();
		if (!tempData.contains("@") || !tempData.contains(".com") || tempData.contains("@.com")) {
			System.out.println("Email tidak valid!"); inputEmail(array);
		} else {
			array.add(tempData);
		}
	}
	public static void inputTraining(ArrayList<String> array, ArrayList<String> trainingNames) {
		System.out.println("Pilih Pelatihan");
		int i=1;
		for (String list : trainingNames) {
			System.out.println(i+". "+list);
			i++;
		}
		System.out.print("pilih: ");
		int choices = data.nextInt();data.nextLine();
		if (choices>trainingNames.size()) {
			System.out.println("Data tidak valid");
			inputTraining(array, trainingNames);
		} else {
			array.add(trainingNames.get(choices-1));
		}
	}
	public static void printPeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		garis();
		System.out.println("\t\t\t\t\t\t\tDaftar Peserta");
		garisSLine();
		System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
		garisSLine();
		for (int i=0; i<names.size();i++) {
			System.out.println(String.format("%-30.30s", names.get(i))+String.format("%-12.10s", educations.get(i))+String.format("%-15.15s", genders.get(i))+String.format("%-30.30s", emails.get(i))+String.format("%-30.30s", trainings.get(i)));
		}
		garis();
	}
	public static void findPeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {		// Input
		garis();
		System.out.println("\t\t\t\t\t\t\tCari Peserta");
		garis();
		System.out.println("Cari berdasarkan:");
		System.out.println("1. Nama");
		System.out.println("2. Pendidikan");
		System.out.println("3. Jenis Kelamin");
		System.out.println("4. Pelatihan");
		System.out.println("5. Kembali");
		garis();
		System.out.print("pilih: ");
		int does = data.nextInt();data.nextLine();
		// Decision
		switch (does) {
			case 1:
				System.out.print("Kata kunci: ");
				String choiceName = data.nextLine();
				garis();
				System.out.println("\t\t\t\t\t\t\tHasil Pencarian");
				garisSLine();
				System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
				garisSLine();
				for (int index=0;index<names.size();index++) {
					if (names.get(index).contains(choiceName)) {
						System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
					}
				}
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				System.out.println("Pendidikan:");
				System.out.println("1. SD");
				System.out.println("2. SMP");
				System.out.println("3. SMA");
				System.out.println("4. SMK");
				System.out.println("5. Kuliah");
				System.out.println("6. Umum");
				System.out.print("pilih: ");
				int choiceEducation = data.nextInt();data.nextLine();
				garis();
				System.out.println("\t\t\t\t\t\t\tHasil Pencarian");
				garisSLine();
				System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
				garisSLine();
				switch (choiceEducation) {
					case 1: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="SD") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 2: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="SMP") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 3: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="SMA") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 4: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="SMK") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 5: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="Kuliah") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 6: 
						for (int index=0;index<educations.size();index++) {
							if (educations.get(index)=="Umum") {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					default:
						System.out.println("Opsi yang Anda pilih salah!"); 
						sleep();
						findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
						break;
				}
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				System.out.print("Pilih jenis kelamin (L/P) => ");
				char choiceGender = data.next().charAt(0);data.nextLine();
				garis();
				System.out.println("\t\t\t\t\t\t\tHasil Pencarian");
				garisSLine();
				System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
				garisSLine();
				switch (choiceGender) {
					case 'l':
						for (int index=0;index<genders.size();index++) {
							if (genders.get(index)=='L') {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 'L':
						for (int index=0;index<genders.size();index++) {
							if (genders.get(index)=='L') {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 'p':
						for (int index=0;index<genders.size();index++) {
							if (genders.get(index)=='P') {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					case 'P':
						for (int index=0;index<genders.size();index++) {
							if (genders.get(index)=='P') {
								System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
							}
						}
						break;
					default:
						System.out.println("Opsi yang Anda pilih salah!"); 
						sleep();
						findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
						break;
				}
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 4:
				System.out.println("Daftar Pelatihan");
				int i=1;
				for (String list : trainingNames) {
					System.out.println(i+". "+list);
					i++;
				}
				System.out.print("pilih: ");
				int choiceTrainingNames = data.nextInt();data.nextLine();
				garis();
				System.out.println("\t\t\t\t\t\t\tHasil Pencarian");
				garisSLine();
				System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
				garisSLine();
					for (int index=0;index<trainings.size();index++) {
						if (trainings.get(index)==trainingNames.get(choiceTrainingNames-1)) {
							System.out.println(String.format("%-30.30s", names.get(index))+String.format("%-12.10s", educations.get(index))+String.format("%-15.15s", genders.get(index))+String.format("%-30.30s", emails.get(index))+String.format("%-30.30s", trainings.get(index)));
						}
					}
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 5: clearScreen(); break;
			default:
				System.out.println("Opsi yang Anda pilih salah!"); 
				sleep();
				findPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;

		}
	}
	public static void updatePeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		printPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		System.out.println("1. Ubah");
		System.out.println("2. Kembali");
		System.out.print("pilih: ");
		int choice = data.nextInt();data.nextLine();
		garisSLine();
		switch (choice) {
			case 1:
				System.out.print("Ketikkan email dari data yang ingin Anda ubah => ");
				String primaryKey = data.nextLine();
				garisSLine();
				if (emails.contains(primaryKey)) {
					updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				} else {
					System.out.println("Email yang Anda ketik salah!");
					sleep();
					updatePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				}
				break;
			case 2:
				clearScreen();
				break;
			default:
				System.out.println("Opsi yang Anda ketik salah!");
				updatePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		}
	}
	public static void updatePesertaAction(String primaryKey,ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		System.out.println("Pilih data yang ingin Anda ubah:");
		System.out.println("1. Nama");
		System.out.println("2. Pendidikan Terakhir");
		System.out.println("3. Jenis Kelamin");
		System.out.println("4. Email");
		System.out.println("5. Pelatihan yang Diikuti");
		System.out.println("6. Kembali");
		garisSLine();
		System.out.print("pilih: ");
		int does = data.nextInt(); data.nextLine();
		int index = emails.indexOf(primaryKey);
		garisSLine();
		switch (does) {
			case 1:
				System.out.print(names.get(index)+" => ");
				names.set(index, data.nextLine());
				garisSLine();
				updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				System.out.println("Pendidikan Terakhir");
				System.out.println("1. SD");
				System.out.println("2. SMP");
				System.out.println("3. SMA");
				System.out.println("4. SMK");
				System.out.println("5. Kuliah");
				System.out.println("6. Umum");
				garisSLine();
				System.out.print(educations.get(index)+" => ");
				int education = data.nextInt();data.nextLine();
				garisSLine();
				switch (education) {
					case 1: educations.set(index, "SD"); break;
					case 2: educations.set(index, "SMP"); break;
					case 3: educations.set(index, "SMA"); break;
					case 4: educations.set(index, "SMK"); break;
					case 5: educations.set(index, "Kuliah"); break;
					case 6: educations.set(index, "Umum"); break;
					default: System.out.println("Data tidak valid!"); updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices); break;
				}
				updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				System.out.print(genders.get(index)+" (L/P) => ");
				char gender = data.next().charAt(0);data.nextLine();
				garisSLine();
				switch (gender) {
					case 'L': genders.set(index, 'L'); break;
					case 'l': genders.set(index, 'L'); break;
					case 'P': genders.set(index, 'P'); break;
					case 'p': genders.set(index, 'P'); break;
					default: System.out.println("Data tidak valid!"); updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices); break;
				}
				updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 4:
				System.out.print(emails.get(index)+" => ");
				String email = data.nextLine();
				garisSLine();
				if (!email.contains("@") || !email.contains(".com") || email.contains("@.com")) {
					System.out.println("Email tidak valid!"); updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				} else {
					emails.set(index, email);
				}
				updatePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 5:
				System.out.println("Ubah Pelatihan yang Diikuti:");
				int i=1;
				for (String list : trainingNames) {
					System.out.println(i+". "+list);
					i++;
				}
				System.out.print(trainings.get(index)+" => ");
				int choices = data.nextInt();data.nextLine();
				garisSLine();
				if (choices>trainingNames.size()) {
					System.out.println("Data tidak valid");
					updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				} else {
					trainings.set(index, trainingNames.get(choices-1));
				}
				updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 6:
				clearScreen();
				updatePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			default:
				clearScreen();
				updatePesertaAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void printInvoice(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		char does;
		garis();
		System.out.println("\t\t\t\t\t\t\tCetak Invoice");
		garis();
		System.out.print("Email: ");
		String email = data.nextLine();
		garisSLine();
		System.out.println(String.format("%-30.30s", "Nama")+String.format("%-12.10s", "Pendidikan")+String.format("%-15.15s", "Jenis Kelamin")+String.format("%-30.30s", "Email")+String.format("%-30.30s", "Pelatihan"));
		garisSLine();
		if (emails.contains(email)) {
			for (int i=0;i<emails.size();i++) {
				if (emails.get(i).equals(email)) {
				System.out.println(String.format("%-30.30s", names.get(i))+String.format("%-12.10s", educations.get(i))+String.format("%-15.15s", genders.get(i))+String.format("%-30.30s", emails.get(i))+String.format("%-30.30s", trainings.get(i)));
				garisSLine();
				System.out.print("Cetak Invoice? (y/n) : ");
				does = data.next().charAt(0);data.nextLine();
				if (does=='y' || does=='Y') {
					garis();
					System.out.println("\t\t\t\t\t\t\t\tInvoice");
					garis();
					System.out.println("Nama\t\t : "+names.get(i));
					System.out.println("Email\t\t : "+emails.get(i));
					System.out.println("Pelatihan\t : "+trainings.get(i)+" ("+trainingDates.get(trainingNames.indexOf(trainings.get(i)))+")");
					System.out.println("Lokasi Pelatihan : "+trainingPlaces.get(trainingNames.indexOf(trainings.get(i))));
					System.out.println("Price\t\t : Rp."+trainingPrices.get(trainingNames.indexOf(trainings.get(i))));
					garis();
				}
				}
			}
		}
		System.out.print("Kembali (y): ");
		does = data.next().charAt(0);data.nextLine();
		if (does=='y' || does=='Y') {
			homeMenuPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		} else {
			sleep();clearScreen();
			printInvoice(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		}
	}
	public static void deletePeserta(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		if (names.size()>0) {
		printPeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		System.out.println("Hapus Peserta");
		System.out.println("1. Hapus");
		System.out.println("2. Hapus Semua Data");
		System.out.println("3. Kembali");
		System.out.print("pilih: ");
		int does = data.nextInt();data.nextLine();
		switch (does) {
			case 1: 
				deletePesertaOnce(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				deletePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				deletePesertaAll(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				deletePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				clearScreen();
				break;
			default:
				System.out.println("Opsi yang Anda masukkan salah!");
				sleep();
				deletePeserta(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		}
	}
	}
	public static void deletePesertaOnce(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		System.out.print("Ketikkan email peserta yang ingin Anda hapus => ");
		String primaryKey = data.nextLine();
		if (emails.contains(primaryKey)) {
			for (int i=0;i<emails.size();i++) {
				if (emails.get(i).equals(primaryKey)) {
				garisSLine();
				System.out.println(String.format("%-30.30s", names.get(i))+String.format("%-12.10s", educations.get(i))+String.format("%-15.15s", genders.get(i))+String.format("%-30.30s", emails.get(i))+String.format("%-30.30s", trainings.get(i)));
				garisSLine();
				System.out.print("Hapus (y/n)? : ");
				char does = data.next().charAt(0);data.nextLine();
				if (does=='y' || does=='Y') {
					names.remove(i);
					educations.remove(i);
					genders.remove(i);
					emails.remove(i);
					trainings.remove(i);
				}
				}
			}
		} else {
			System.out.println("Email yang Anda ketik salah!");
			deletePesertaOnce(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		}
	}
	public static void deletePesertaAll(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		System.out.println("Apakah Anda yakin ingin menghapus semua data (y/n)?");
		System.out.print("jawab: ");
		char does = data.next().charAt(0);data.nextLine();
		if (does=='y' || does=='Y') {
			System.out.println("Kode Administrator");
			System.out.print("=> ");
			String adminCode = data.nextLine();
			if (adminCode.equals("PAISALAMRIDELLIA")) {
				names.clear();
				educations.clear();
				genders.clear();
				emails.clear();
				trainings.clear();
			} else {
				System.out.println("Kode salah!");
			}
		}
	}
	public static void homeMenuPelatihan(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		garis();
		System.out.println("\t\t\t\t\t\t\tDashboard Pelatihan");
		garis();
		System.out.println("Selamat datang di dashboard Pelatihan, Admin!");
		System.out.println("1. Tambah Pelatihan");
		System.out.println("2. Lihat Daftar Pelatihan");
		System.out.println("3. Ubah Pelatihan");
		System.out.println("4. Hapus Pelatihan");
		System.out.println("5. Kembali");
		garis();
		System.out.print("pilih: ");
		int does = data.nextInt();data.nextLine();
		switch (does) {
			case 1:
				clearScreen();
				inputPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				clearScreen();
				printPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				clearScreen();
				updatePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 4:
				clearScreen();
				deletePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 5:
				homeMenu(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			default:
				System.out.println("Opsi yang Anda ketik salah!");
				sleep();
				homeMenuPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void inputPelatihan(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		garis();
		System.out.println("\t\t\t\t\t\tTambah Pelatihan Baru");
		garis();
		// Nama Pelatihan
		System.out.print("Nama Pelatihan: ");
		String training = data.nextLine();
		if (trainingNames.contains(training)) {
			System.out.println("Pelatihan tersebut telah ada!");
		} else {
			trainingNames.add(training);
		}
		garisSLine();
		// Waktu Pelatihan
		System.out.println("Waktu Pelatihan");
		System.out.println("Contoh: 23 Desember 2019");
		System.out.print(": ");
		trainingDates.add(data.nextLine());
		garisSLine();
		// Tempat Pelatihan
		System.out.println("Tempat Pelatihan");
		System.out.println("Contoh: Surakarta");
		System.out.print(": ");
		trainingPlaces.add(data.nextLine());
		garisSLine();
		// Harga Pelatihan
		System.out.println("Harga Pelatihan");
		System.out.println("Contoh: 150000");
		System.out.print(": ");
		trainingPrices.add(data.nextInt());
		garisSLine();
	}
	public static void printPelatihan(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		clearScreen();
		garis();
		System.out.println("\t\t\t\t\t\t\tDaftar Pelatihan");
		garis();
		System.out.println(String.format("%-30.30s", "Nama Pelatihan")+String.format("%-20.20s", "Waktu")+String.format("%-25.25s", "Tempat")+String.format("%-8.7s", "Harga")+String.format("\t%10s", "Jumlah Peserta"));
		garisSLine();
		for (int i=0;i<trainingNames.size();i++ ) {
			System.out.println(String.format("%-30.30s", trainingNames.get(i))+String.format("%-20.20s", trainingDates.get(i))+String.format("%-25.25s", trainingPlaces.get(i))+String.format("Rp.%-8d", trainingPrices.get(i))+String.format("\t%5d", Collections.frequency(trainings,trainingNames.get(i))));
		}
		garis();
	}
	public static void updatePelatihan(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		clearScreen();
		printPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		String primaryKey;
		System.out.println("1. Ubah");
		System.out.println("2. Kembali");
		System.out.print("pilih: ");
		int does = data.nextInt();data.nextLine();
		garisSLine();
		switch (does) {
			case 1:
				System.out.print("Ketikkan nama pelatihan yang ingin Anda ubah => "); 
				primaryKey = data.nextLine();
				garisSLine();
				if (trainingNames.contains(primaryKey)) {
					updatePelatihanAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);	
					updatePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				} else {
					System.out.println("Pelatihan tersebut tidak ada!");
					sleep();
					updatePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				}
				break;
			case 2: break;
			default:
				System.out.println("Opsi yang Anda ketik salah!");
				sleep();
				updatePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void updatePelatihanAction(String primaryKey,ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		System.out.println("Pilih data yang ingin Anda ubah:");
		System.out.println("1. Nama Pelatihan");
		System.out.println("2. Waktu Pelatihan");
		System.out.println("3. Tempat Pelatihan");
		System.out.println("4. Harga Pelatihan");
		System.out.println("5. Kembali");
		garisSLine();
		System.out.print("pilih: ");
		int does = data.nextInt(); data.nextLine();
		int index = trainingNames.indexOf(primaryKey);
		garisSLine();
		switch (does) {
			case 1:
				System.out.print(trainingNames.get(index)+" => ");
				String tempData = data.nextLine();
				garisSLine();
				if (trainingNames.contains(tempData)) {
					System.out.println("Maaf, pelatihan tersebut telah ada!");
				} else {
					trainingNames.set(index, tempData);
					if (Collections.frequency(trainings,primaryKey)>0) {
						for (int i=0;i<trainings.size();i++) {
							if (trainings.get(i).equals(primaryKey)) {
								trainings.set(i, tempData);
							}
						}
					}
				}
				break;
			case 2:
				System.out.print(trainingDates.get(index)+" => ");
				trainingDates.set(index, data.nextLine());
				garisSLine();
				updatePelatihanAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3:
				System.out.print(trainingPlaces.get(index)+" => ");
				trainingPlaces.set(index, data.nextLine());
				garisSLine();
				updatePelatihanAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 4:
				System.out.print(trainingPrices.get(index)+" => ");
				trainingPrices.set(index, data.nextInt());
				garisSLine();
				updatePelatihanAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 5: break;
			default:
				System.out.println("Opsi yang Anda ketik salah!");
				updatePelatihanAction(primaryKey,names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void deletePelatihan(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		printPelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
		System.out.println("Hapus Pelatihan");
		System.out.println("1. Hapus");
		System.out.println("2. Hapus Semua Data");
		System.out.println("3. Kembali");
		System.out.print("pilih: ");
		int does = data.nextInt(); data.nextLine();
		switch (does) {
			case 1:
				deletePelatihanOnce(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				deletePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 2:
				deletePelatihanAll(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				deletePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
			case 3: clearScreen(); break;
			default:
				System.out.println("Opsi yang Anda ketik salah!");
				deletePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				break;
		}
	}
	public static void deletePelatihanOnce(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		System.out.print("Ketikkan nama pelatihan yang ingin Anda hapus => ");
		String primaryKey = data.nextLine();
		if (trainingNames.contains(primaryKey)) {
			if (Collections.frequency(trainings,primaryKey)==0) {
				int index = trainingNames.indexOf(primaryKey);
				System.out.println("Apakah Anda yakin ingin menghapus data tersebut (y/n)?");
				System.out.print("jawab: ");
				char choice = data.next().charAt(0);data.nextLine();
				if (choice=='y' || choice=='Y') {
					trainingNames.remove(index);
					trainingDates.remove(index);
					trainingPlaces.remove(index);
					trainingPrices.remove(index);
				} else {
					deletePelatihan(names,educations,genders,emails,trainings,trainingNames,trainingDates,trainingPlaces,trainingPrices);
				}
			} else {
				System.out.println("Maaf, masih terdapat peserta di pelatihan tersebut!");
				System.out.println("Silakan ubah data peserta untuk melanjutkan.");
				sleep(); clearScreen();
			}
		} else {
			System.out.println("Maaf, pelatihan tersebut tidak ada!");
			sleep(); clearScreen();
		}
	}
	public static void deletePelatihanAll(ArrayList<String> names, ArrayList<String> educations, ArrayList<Character> genders, ArrayList<String> emails, ArrayList<String> trainings, ArrayList<String> trainingNames, ArrayList<String> trainingDates, ArrayList<String> trainingPlaces, ArrayList<Integer> trainingPrices) {
		int frequency=0;
		for (int i=0;i<trainingNames.size();i++) {
			if (Collections.frequency(trainings, trainingNames.get(i))>0) {
				System.out.println("Maaf, masih ada peserta di pelatihan "+trainingNames.get(i));
				System.out.println("Silakan ubah data peserta untuk melanjutkan");
				frequency++;
			}
		}
		if (frequency>0) {
			sleep();
		} else {
			System.out.println("Apakah Anda yakin ingin menghapus semua data (y/n)?");
			System.out.print("jawab: ");
			char choice = data.next().charAt(0);data.nextLine();
			if (choice=='y' || choice=='Y') {
				System.out.println("Kode Administrator");
				System.out.print("=> ");
				String adminCode = data.nextLine();
				if (adminCode.equals("PAISALAMRIDELLIA")) {
					trainingNames.clear();
					trainingDates.clear();
					trainingPlaces.clear();
					trainingPrices.clear();
				} else {
					System.out.println("Kode salah!");
					sleep();
				}
			}
		}
	}
	public static void garis() {
		System.out.println("==============================================================================================================================");
	}
	public static void garisSLine() {
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	}
	public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Jika sistem operasi yang kita gunakan adalah windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143"); // Jika sistem operasi yang kita gunakan adalah Linux/Unix
            }
        } catch (Exception ex) {
            System.err.println("Error 404 // Not Found"); // Selain Windows dan Linux/Unix
        }
    }
	public static void sleep(){
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Jika sistem operasi yang kita gunakan adalah windows
                new ProcessBuilder("cmd", "/c", "TIMEOUT /T 3 /NOBREAK").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143"); // Jika sistem operasi yang kita gunakan adalah Linux/Unix
            }
        } catch (Exception ex) {
            System.err.println("Error 404 // Not Found"); // Selain Windows dan Linux/Unix
        }
    }
}