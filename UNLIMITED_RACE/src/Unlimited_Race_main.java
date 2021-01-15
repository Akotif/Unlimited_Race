import javax.swing.JFrame;                  // Gerekli sýnýflar

public class Unlimited_Race_main extends JFrame { // Oyun panelinin görüneceði pencere sýnýfý

	public static void main(String[] args) {      // Ana sýnýf
		
		Unlimited_Race_main frame0= new Unlimited_Race_main();  // Yeni bir pencere oluþturuluyor
		
		frame0.setResizable(false);
		frame0.setFocusable(false);
		frame0.setSize(1280,720);                               // Pencere boyutu belirleniyor
		frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Unlimited_Race_panel ekran0 = new Unlimited_Race_panel();  // Yeni bir panel oluþtruluyor
		ekran0.requestFocus();                                     
		ekran0.addKeyListener(ekran0);                             
		ekran0.setFocusable(true);
		ekran0.setFocusTraversalKeysEnabled(false);
		
		frame0.add(ekran0);                                     // panel pencereye ekleniyor
		frame0.setVisible(true);                                // görünür hale getiriliyor

	}

}
