public class Main {

    public static void main(String[] args) {
	int[] sayilar=new int [] {1,2,5,7,9,0};
	int aranacak=5;
	boolean dogru=false;

	for (int i=0;i<sayilar.length;i++){ // for(int sayi : sayilar) denedebilirdi.
	    if (aranacak==sayilar[i]){
	        System.out.println("Aranan sayı dizi içerisindedir.");
	        dogru=true;
	        break;
        }
    }
		if(dogru==false) {
		System.out.println("Aranan sayı dizi içerisinde değildir");
		}

    }
}
