# Eksplorasi GUI Java

## Deskripsi
Program ini merupakan latihan eksplorasi GUI menggunakan Java Swing.
Aplikasi ini digunakan untuk memasukkan nama dan NIM mahasiswa,
kemudian menampilkan data ketika tombol Simpan diklik.

## Komponen GUI yang Digunakan

### 1. Top-level Container Class (JFrame)
JFrame digunakan sebagai jendela utama aplikasi.
JFrame menjadi tempat untuk menampilkan seluruh komponen GUI,
seperti label, kotak input, dan tombol.

### 2. Intermediate Container Class (JPanel)
JPanel digunakan sebagai wadah untuk mengelompokkan
komponen GUI, seperti label, kotak input, dan tombol.
JPanel membantu mengatur komponen agar tampilan aplikasi
lebih terstruktur dan rapi.

### 3. Atomic Component Class
Atomic Component merupakan komponen GUI yang digunakan
untuk menampilkan informasi dan menerima input dari pengguna.
Komponen yang digunakan dalam aplikasi ini yaitu:
- JLabel: Menampilkan tulisan Nama, NIM, dan informasi hasil.
- JTextField: Digunakan untuk memasukkan Nama dan NIM.
- JButton: Digunakan sebagai tombol Simpan untuk memproses data.

### 4. Layout Classes

Layout digunakan untuk mengatur posisi komponen GUI
agar tampilan aplikasi lebih terstruktur.
Layout yang digunakan dalam aplikasi ini:
- BorderLayout: Mengatur posisi panel input, tombol,
  dan hasil pada bagian NORTH, CENTER, dan SOUTH.
- GridLayout: Mengatur label dan kotak input Nama
  serta NIM dalam bentuk baris dan kolom.
- FlowLayout: Mengatur posisi tombol Simpan agar
  berada di tengah panel.

  ### 5. Event Listener

Event Listener digunakan untuk menangani aksi yang
dilakukan pengguna pada komponen GUI.
Program ini menggunakan ActionListener untuk mendeteksi
ketika tombol Simpan diklik.
Method actionPerformed() di-override untuk mengambil
data Nama dan NIM dari kotak input, kemudian
menampilkan data tersebut pada aplikasi.

