package Tugas;
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe","Abu-abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haum Haum","Hitam Manis");
        Singa singa = new Singa("Cingacing", 4, "Roarr Roarr","Coklat");
    
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
    }
}
