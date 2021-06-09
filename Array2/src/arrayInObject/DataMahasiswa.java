package arrayInObject;

public class DataMahasiswa {
	
	public static void main(String[] args) {
		
		int maxSize = 100;
		ManageMahasiswa obj = new ManageMahasiswa(maxSize);
		obj.insert("1197050071", "Fadhlan", 20);
		obj.insert("1197050006", "Andreas", 22);
		obj.insert("1197050011", "Ummam", 20);
		obj.insert("1197050032", "Intan", 19);
		obj.insert("1197050079", "Aziz", 21);
		System.out.println("Data Mahasiswa : ");
		obj.display();
	}
}
