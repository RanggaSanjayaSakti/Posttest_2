# Posttest_2

Nama : Rangga Sanjaya Sakti
Nim : 2209116080

 ![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/6e900b8e-ce41-42d6-8d38-c9bee2c1350c)
Package Students adalah pernyataan yang mendefinisikan bahwa kelas student berada didalam Package students. Lalu final private integer student number adalah variable anggota yang bersifat final yang artinya setelah nilainya diatur di konstruktor, nilai nya tidak dapat diubah, private String studentClass;: Variabel anggota ini menyimpan informasi tentang kelas tempat siswa berada. Ini tidak bersifat final, sehingga nilainya dapat diubah. final private String studentName;: Seperti studentNumber, variabel ini bersifat final dan nilainya tidak dapat diubah setelah diatur di konstruktor. final private String studentGender;: Variabel ini juga bersifat final dan menyimpan informasi tentang jenis kelamin siswa. private Integer studentAge;: Variabel ini menyimpan informasi tentang usia siswa. Berbeda dengan studentNumber dan studentName, variabel ini tidak bersifat final, jadi nilainya dapat diubah setelah objek dibuat.
Lalu public Student(Integer studentNumber, String studentClass, String studentName, String studentGender, Integer studentAge): Ini adalah konstruktor kelas Student. Konstruktor ini menerima lima parameter: studentNumber, studentClass, studentName, studentGender, dan studentAge. Saat objek Student dibuat, konstruktor ini menginisialisasi nilai variabel anggota kelas dengan nilai-nilai yang diberikan melalui parameter.
  ![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/d1166086-8b9b-48a2-85bd-a20e8664a800)
public void setAge(Integer studentAge) { this.studentAge = studentAge; } Ini adalah sebuah metode setAge yang memungkinkan Anda mengatur nilai studentAge (usia siswa) dengan nilai yang baru.
public void setClass(String studentClass) { this.studentClass = studentClass; } Ini adalah metode setClass yang memungkinkan Anda mengatur nilai studentClass (kelas siswa) dengan nilai yang baru.
public Integer getStudentNumber() { return studentNumber; } Ini adalah metode getStudentNumber yang mengembalikan nilai dari studentNumber (nomor identifikasi siswa).
public String getStudentClass() { return studentClass; } Metode getStudentClass mengembalikan nilai dari studentClass (kelas siswa).
public String getName() { return studentName; } Ini adalah metode getName yang mengembalikan nilai dari studentName (nama siswa).
public String getGender() { return studentGender; } Metode getGender mengembalikan nilai dari studentGender (jenis kelamin siswa).
public Integer getAge() { return studentAge; } Metode getAge mengembalikan nilai dari studentAge (usia siswa).
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/ba0224a7-ae09-4e84-87dc-21f671cec146)
Import Students.Student; yaitu mendeklarasikan import kelas Student dari package Students. Dengan melakukan ini, kelas Student dapat digunakan di dalam kelas School. 
final class School Ini adalah deklarasi kelas Java dengan nama School. Kata kunci final pada kelas berarti bahwa kelas ini tidak dapat diwarisi oleh kelas lain.
private static final List<Student> studentList = new ArrayList<>();: Ini adalah variabel statis dan final yang merupakan sebuah ArrayList dari objek Student. Variabel ini menyimpan daftar siswa. Karena bersifat static dan final, studentList adalah variabel kelas yang tidak dapat diubah setelah diinisialisasi.
public final static void main(String[] args) {}: Ini adalah metode utama  yang akan dijalankan ketika program dimulai. Di dalam metode ini, program menampilkan menu pilihan kepada pengguna dan menerima input dari pengguna menggunakan objek Scanner
while (true) { }: Program menggunakan loop while (true) untuk terus menampilkan menu kepada pengguna dan menerima input dari pengguna tanpa berhenti.
String pilihan = scanner.nextLine();: Program menggunakan objek Scanner untuk menerima input dari pengguna.
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/c26184ca-7fc5-4d90-984d-d622b6fcc6f5)
switch (pilihan) {}: Ini adalah struktur switch yang digunakan untuk mengevaluasi nilai dari variabel pilihan  dan akan menjalankan kode yang sesuai dengan nilai pilihan.
case "1": berguna Jika pilihan sama dengan "1", maka kode di bawahnya akan dijalankan yang berfungsi untuk add student.
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/d5611b76-7138-4fd3-8737-923ab8815b5b)
case "2": berguna Jika pilihan sama dengan "2", maka kode di bawahnya akan dijalankan yang berfungsi untuk melihat list student.
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/3d37cb02-ef8d-4e7c-84fc-8d6cc1de83bd)
case "3": berguna Jika pilihan sama dengan "3", maka kode di bawahnya akan dijalankan yang berfungsi untuk melakukan update pada student.
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/310c7985-f01f-45e1-80d8-077769304874)
case "4": berguna Jika pilihan sama dengan "4", maka kode di bawahnya akan dijalankan yang berfungsi untuk melakukan hapus pada student.
![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/7e079b33-cfa2-4e97-9e15-8729ecb648b3)
case "5": berguna Jika pilihan sama dengan "5", maka kode di bawahnya akan dijalankan yang berfungsi untuk keluar dari program.


#output
pada saat kita menjalankan program maka akan langsung terlihat beberapa fitur yang bisa digunakan oleh user seperti menambahkan data, melihat data, mengubah data, dan menghapus data lalu pada fitur yang terakhir yaitu keluar dari program contoh nya sebagai berikut ini
# Fitur menambahkan Data

![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/42156719-b387-4a9b-8b4b-e03f54fe8618)

# Fitur melihat data

![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/beacfd6d-6258-496c-94df-6a4121e4864b)

# Fitur Mengubah data

![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/1ce89ae6-ae0c-4fa6-b64b-254b4927c46e)

# Fitur Menghapus data

![image](https://github.com/RanggaSanjayaSakti/Posttest_2/assets/122283752/0462b9d0-c56d-4bec-a9b1-3c3e03b72696)


