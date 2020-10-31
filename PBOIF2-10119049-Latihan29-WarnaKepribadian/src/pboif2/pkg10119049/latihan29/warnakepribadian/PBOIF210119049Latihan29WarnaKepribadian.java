/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskipsi : program warna kepribadian
 */
public class PBOIF210119049Latihan29WarnaKepribadian {
    public static Scanner scan = new Scanner(System.in);
    public static String nama;
    public static String warna;
    
    // const font color
    public static final String CRESET = "\u001B[0m";
    public static final String CBLACK = "\u001B[30m";
    public static final String CRED = "\u001B[31m";
    public static final String CGREEN = "\u001B[32m";
    public static final String CYELLOW = "\u001B[33m";
    public static final String CBLUE = "\u001B[34m";
    public static final String CPURPLE = "\u001B[35m";
    public static final String CCYAN = "\u001B[36m";
    public static final String CWHITE = "\u001B[37m";
    
    // const bgcolor
    public static final String BGBLACK = "\u001B[40m";
    public static final String BGRED = "\u001B[41m";
    public static final String BGGREEN = "\u001B[42m";
    public static final String BGYELLOW = "\u001B[43m";
    public static final String BGBLUE = "\u001B[44m";
    public static final String BGPURPLE = "\u001B[45m";
    public static final String BGCYAN = "\u001B[46m";
    public static final String BGWHITE = "\u001B[47m";    
    
    
    
    public static void setData(){
        System.out.println(CRED + "YUK" + CGREEN + " CEK" + CYELLOW + " KEPRIBADIAN" + CCYAN + " DARI" + CPURPLE + " WARNA" + CBLUE + " FAVORITMU"); 
        System.out.println();
        System.out.println(CWHITE + BGRED + "        MERAH        ");
        System.out.println(CWHITE + BGGREEN + "        HIJAU        ");
        System.out.println(CWHITE + BGYELLOW + "        KUNING       ");
        System.out.println(CWHITE + BGBLUE + "        BIRU         ");
        System.out.println(CWHITE + BGPURPLE + "        UNGU         ");
        
        System.out.println(CRESET);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = scan.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");      
        nama = scan.next();
    }
    
    public static void getMerah(){
        String[] arrMerah = {"Periang", "Pemberani","Berani mengambil resiko dalam setiap langkah","Menyukai tantangan","Kurang sabar","Dapat menahan marah namun jika sudah tahap puncak toleransi kemarahannya akan sulit dikontrol","Memiliki energi dan cinta"};
        int arrLen = arrMerah.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",CRED,warna,CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrMerah[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrMerah[i]);
            }    
        }
    }
        
    public static void getHijau(){
        String[] arrHijau = {"Romantis", "Menyukai hal yang berbau alami dan keindahan", "Teguh pada prinsip","Menginginkan kesempurnaan","Mudah cemburu", "Mudah merasa iri","Menjunjung tinggi suatu nilai toleransi dan kepercayaan"};
         int arrLen = arrHijau.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",CGREEN,warna,CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrHijau[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrHijau[i]);
            }    
        }       
    }
    
    public static void getKuning(){
       String[] arrKuning = {"Optimis", "Suka bergaul", "Periang", "Senang menolong","Lincah dan aktif","Tidak suka meremehkan kekurangan orang lain","Loyal","Hangat","Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil","Cenderung penakut"};
        int arrLen = arrKuning.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",CYELLOW,warna,CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrKuning[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrKuning[i]);
            }    
        }       
    }
    
    public static void getBiru(){
        String[] arrBiru = {"Menyenangkan", "Bijaksana", "Pembawaan diri tenang saat menghadapi masalah", "Dinamis","Senang Berbagi","Bersahabat","Tidak terlalu suka menjadi sorotan banyak orang","Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai"}; 
        int arrLen = arrBiru.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",CBLUE,warna,CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrBiru[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrBiru[i]);
            }    
        }        
    }
    
    public static void getUngu(){
        String[] arrUngu = {"Optimis", "Tidak pernah ragu","Menurutnya pasangan yang ideal adalah memiliki mental yang kuat","Memiliki ambisi yang besar","Memiliki empati yang besar","Memiliki sisi misterius sebab seringkali menutupi perasaannya","Terkadang bersikap kerasa kepala dan angkuh"};
        int arrLen = arrUngu.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",CPURPLE,warna,CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrUngu[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrUngu[i]);
            }    
        }        
    }
    
    public static void getTampil(){
        System.out.printf("%n===HASIL TEST KEPRIBADIAN %s===%n",nama);
        switch(warna){
            case "MERAH" :
                getMerah();
                break;
            case "HIJAU" :
                getHijau();
                break;
            case "KUNING" :
                getKuning();
                break;
            case "BIRU" :
                getBiru();
                break;
            case "UNGU" :
                getUngu();
                break;                
            default :
                System.out.println("Warna yang dipilih salah");
                break;
        }        
    };
    
    public static void main(String[] args) {
        setData();
        getTampil();
    }
    
}
