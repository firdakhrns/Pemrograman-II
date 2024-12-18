package praktikum2.soal3;

//nama class seharusnya Pegawai bukan Employee
//public class Employee{
public class Pegawai {
	public String nama;
	//diubah ke string karena char hanya bisa menyimpan satu karakter saja
	//public char asal;
	public String asal;
	public String jabatan;
	public int umur;
	
	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}
	
	//error karena kurangnya parameter pada method ini
	//public void setJabatan(){
	public void setJabatan(String jabatan) {
		//variabel j tidak terdefinisi karena parameter menggunakan 'jabatan' bukan 'j'
		//this.jabatan = j;
		this.jabatan = jabatan;
	}
}