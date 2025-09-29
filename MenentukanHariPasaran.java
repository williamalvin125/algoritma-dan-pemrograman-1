import java.util.Scanner;
public class MenentukanHariPasaran {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int ph = 0;
int kd = 0;
System.out.print("Masukan tahun ini dalam angka = ");
int tahun1 = input.nextInt();
System.out.print("Masukan bulan ini dalam angka= ");
int bulan1 = input.nextInt();
if (bulan1<0||bulan1>12)
System.out.println("Masukan salah, silahkan mengulang program");
else{
System.out.print("Masukan tanggal hari ini = ");
int hari1 = input.nextInt();
switch (bulan1){
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
if(hari1<0||hari1>31)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;
case 4:case 6:case 9:case 11:
if(hari1<0||hari1>30)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;
case 2:
if(tahun1%4==0&(hari1<0||hari1>29))
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
else
if (hari1<0||hari1>28)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;
default:
System.out.println("Tidak mungkin");
break;
}
System.out.print("Masukan kode hari ini (1-7)= ");
int kode = input.nextInt();
if (kode<1||kode>7)
System.out.println("Masukan salah, silahkan mengulang program");
else{
System.out.println("1. Kliwon");
System.out.println("2. Legi");
System.out.println("3. Pahing");
System.out.println("4. Pon");
System.out.println("5. Wage");
System.out.print("Masukan kode tanggalan jawa hari ini =");
int pilihan = input.nextInt();
if(pilihan<1||pilihan>5)
System.out.println("Masukan salah, silahkan mengulang program");
else{
System.out.print("Masukan tahun yang dituju dalam angka= ");
int tahun2 = input.nextInt();
System.out.print("Masukan bulan yang dituju dalam angka= ");
int bulan2 = input.nextInt();
if (bulan2<0||bulan2>12)
System.out.println("Masukan salah, silahkan mengulang program");
else{
System.out.print("Masukan tanggal hari yang dituju = ");
int hari2 = input.nextInt();
switch (bulan2){
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
if(hari2<0||hari2>31)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;
case 4:case 6:case 9:case 11:
if(hari2<0||hari2>30)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;

case 2:

if(tahun2%4==0&(hari2<0||hari2>29))
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
else
if (hari2<0||hari2>28)
System.out.println("Masukan salah, system akan tetap dilanjutkan walaupun salah");
break;
default:
System.out.println("Tidak mungkin");
break;
}
if (tahun1>tahun2){
for(int y=tahun2;y<tahun1;){
if (y%4==0)
ph = ph+366;
else
ph = ph+365;
y = y + 1;
}
for(int x=bulan2;x>0;){
x=x-1;
switch (x){
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
kd = kd+31;
break;
case 4:case 6:case 9:case 11:

kd = kd+30;
break;
case 2:
if(tahun2%4==0)
kd = kd+29;
else
kd = kd+28;
break;
default:
System.out.println("Tidak mungkin");
break;
}
}
kd = kd + hari2;
ph = ph - kd;
for(int x=bulan1;x>0;){
x=x-1;
switch (x){

case 1:case 3:case 5:case 7:case 8:case 10:case 12:
ph = ph+31;
break;
case 4:case 6:case 9:case 11:

ph = ph+30;
break;
case 2:
if(tahun1%4==0)
ph = ph+29;
else
ph = ph+28;
break;
default:
break;
}
}
ph = hari1 + ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println( "Pengurangan harinya = " +ph);
pilihan = pilihan -ph;
pilihan = pilihan%5;
kode = kode - ph;
kode = kode%7;
}
else if (tahun2>tahun1){
for(int y=tahun1;y<tahun2;){
if (y%4==0)
ph = ph+366;
else
ph = ph+365;
y = y + 1;
}

for(int x=bulan1;x>0;){
x=x-1;
switch (x){

case 1:case 3:case 5:case 7:case 8:case 10:case 12:
kd = kd+31;
break;
case 4:case 6:case 9:case 11:

kd = kd+30;
break;
case 2:
if(tahun1%4==0)
kd = kd+29;
else
kd = kd+28;
break;
default:
break;
}
}
kd = kd + hari1;
ph = ph - kd;
for(int x=bulan2;x>0;){
x=x-1;
switch (x){

case 1:case 3:case 5:case 7:case 8:case 10:case 12:
ph = ph+31;
break;
case 4:case 6:case 9:case 11:

ph = ph+30;
break;
case 2:
if(tahun2%4==0)
ph = ph+29;
else
ph = ph+28;
break;
default:
break;
}
}
ph = hari2 + ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println( "Penambahan harinya = " +ph);
pilihan = pilihan +ph;
pilihan = pilihan%5;
kode = kode + ph;
kode = kode%7;
}
else if (bulan1>bulan2){
for(int x=bulan2;x>0;){
x=x-1;
switch (x){
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
kd = kd+31;
break;

case 4:case 6:case 9:case 11:

kd = kd+30;
break;
case 2:
if(tahun2%4==0)
kd = kd+29;
else
kd = kd+28;
break;
default:
break;
}
}

kd = kd + hari2;
ph = ph - kd;
for(int x=bulan1;x>0;){
x=x-1;

switch (x){

case 1:case 3:case 5:case 7:case 8:case 10:case 12:
ph = ph+31;
break;
case 4:case 6:case 9:case 11:

ph = ph+30;
break;
case 2:
if(tahun1%4==0)
ph = ph+29;
else
ph = ph+28;
break;
default:
break;
}
}
ph = hari1 + ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println( "Pengurangan harinya = " +ph);
pilihan = pilihan -ph;
pilihan = pilihan%5;
kode = kode - ph;
kode = kode%7;
}
else if (bulan2>bulan1){
for(int x=bulan1;x>0;){
x=x-1;
switch (x){

case 1:case 3:case 5:case 7:case 8:case 10:case 12:
kd = kd+31;
break;
case 4:case 6:case 9:case 11:

kd = kd+30;
break;
case 2:
if(tahun1%4==0)
kd = kd+29;
else
kd = kd+28;
break;
default:
break;
}
}
kd = kd + hari1;
ph = ph - kd;
for(int x=bulan2;x>0;){

x =x-1;
switch (x){
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
ph = ph+31;
break;
case 4:case 6:case 9:case 11:

ph = ph+30;
break;
case 2:
if(tahun2%4==0)
ph = ph+29;
else
ph = ph+28;
break;
default:
break;
}
}
ph = hari2 + ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println( "Penambahan harinya = " +ph);
pilihan = pilihan +ph;
pilihan = pilihan%5;
kode = kode + ph;
kode = kode%7;

}
else if(hari1>hari2){
ph = hari1-hari2;
kode = kode - ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Pengurangan harinya = " +ph);
pilihan = pilihan -ph;
pilihan = pilihan%5;
kode = kode%7;
}
else {
ph = hari2-hari1;
kode = kode+ph;
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
pilihan = pilihan +ph;
pilihan = pilihan%5;
System.out.println("Penambahan harinya = " +ph);
kode = kode%7;
}
switch (kode){
case 0:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Minggu");
break;
case 1:case -6:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Senin");
break;
case 2:case -5:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Selasa");
break;
case 3:case -4:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Rabu");
break;
case 4:case -3:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Kamis");
break;
case 5:case -2:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Jumat");
break;
case 6:case -1:
System.out.println("Hari pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Sabtu");
break;
default:
System.out.println("Tidak mungkin");
break;
}
switch (pilihan){
case 0:
System.out.println("Hari jawa tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Wage");
break;
case 1:case -4:

System.out.println("Hari jawa pada tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Kliwon");
break;
case 2:case -3:

System.out.println("Hari jawa tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Legi");
break;
case 3:case -2:

System.out.println("Hari jawa tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Pahing");
break;
case 4:case -1:

System.out.println("Hari jawa tanggal "+hari2+"/"+bulan2+"/"+tahun2+" adalah hari Pon");
break;
default:

System.out.println("Tidak mungkin");
break;
}
}}}}
input.close();
}}