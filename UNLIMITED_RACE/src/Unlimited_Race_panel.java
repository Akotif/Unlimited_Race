import java.awt.Color;                                             // Ýçe aktardðýmýz gerekli sýnýflar
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Unlimited_Race_panel extends JPanel implements KeyListener,ActionListener{ //Jpanel sýnýfýný miras alan panel sýnýfý
	
	Timer timer=new Timer(10,this);                                 // yeni bir timer oluþturuluyor
	private int parkur ;                                            // Katedilen mesafeyi tutan deðiþken
	private int zaman ;												// Geçen süreyi tutan deðiþken
	private int ates ; 												// Kullanýlan sprey sayýsýný tutan deðiþken
	private BufferedImage araba,araba1,araba2,araba3,araba4,araba5; // Oyunda kullanýlan görsellerin deðiþkenlerinin atanmasý 25-31
	private BufferedImage stone;                                   
	private BufferedImage serit,yol,yol1;
	private BufferedImage mermi;
	private BufferedImage sprayleft,keys,keys1;
	private BufferedImage info,info1,info2,info3;
	private BufferedImage n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
	
	private ArrayList<Engel> engel= new ArrayList<Engel>();         // Arabalarý uzaklaþtýrmak için kullanýlan spreylerden oluþan küme
	
	private int atesx=10;                                           // Görsellerin konum deðiþkenlerinin tanýmlanmasý 35-50
	private int stone0x=-700,stone0y=0,stonex=10;
	private int stone10x=-200,stone10y=200,stone1x=10;
	private int stone20x=-600,stone20y=400,stone2x=10;
	private int engely=1,engelx=3,engel0x=-600,engel0y=25;
	private int car50x=-1000,car5x=3,car5y=2, car50y=25;
	private int car40x=-1500,car4x=2, car4y=1,car40y=425;
	private int car30x=-500,car3x=2,car3y=1,car30y=425;
	private int car20x=-200,car2x=3,car2y=1, car20y=225;
	private int car0x=1000,car0y=225,cary=25,carx=30;
	private int engel1y=1,engel1x=10,engel10=-200;
	private int engel2y=1,engel2x=10,engel20=400;
	private int engel3y=1,engel3x=10,engel30=1000;
	private int engel4y=1,engel4x=10,engel40=-800;
	private int yolx=10, yol0x=-100;
	private int yol1x=15, yol10x=500;

	public boolean check() {                                      // Spreylerin arabalara çarpma durumunu kontrol eden metotlar 52-109
		for (Engel ates:engel) {
					if(-30<(ates.getX()-engel0x)) {
						if((ates.getX()-engel0x)<30) {
							if(-30<ates.getY()) {
								if(ates.getY()<80) {
									return true;
										}
									}
								}
							}
						}
				return false;
				}
	
	public boolean check1() {
		for (Engel ates:engel) {
					if(-30<(ates.getX()-car20x)) {
						if((ates.getX()-car20x)<30) {
							if(150<ates.getY()) {
								if(ates.getY()<280) {
									return true;
										}
									}
								}
							}
						}
				return false;
				}
	
	public boolean check2() {
		for (Engel ates:engel) {
					if(-30<(ates.getX()-car30x)) {
						if((ates.getX()-car30x)<30) {
							if(290<ates.getY()) {
								if(ates.getY()<480) {
									return true;
										}
									}
								}
							}
						}
				return false;
				}
	public boolean check3() {
		for (Engel ates:engel) {
					if(-30<(ates.getX()-car40x)) {
						if((ates.getX()-car40x)<30) {
							if(290<ates.getY()) {
								if(ates.getY()<480) {
									return true;
										}
									}
								}
							}
						}
				return false;
				}
	
	
	
	public Unlimited_Race_panel() {
		try {                      								   //Görsellerin proje klasöründen okunarak deðiþkenlere aktarýlmasý 114-157
	n0=ImageIO.read(new FileImageInputStream(new File("0.png")));
	n1=ImageIO.read(new FileImageInputStream(new File("1.png")));
	n2=ImageIO.read(new FileImageInputStream(new File("2.png")));
	n3=ImageIO.read(new FileImageInputStream(new File("3.png")));
	n4=ImageIO.read(new FileImageInputStream(new File("4.png")));
	n5=ImageIO.read(new FileImageInputStream(new File("5.png")));
	n6=ImageIO.read(new FileImageInputStream(new File("6.png")));
	n7=ImageIO.read(new FileImageInputStream(new File("7.png")));
	n8=ImageIO.read(new FileImageInputStream(new File("8.png")));
	n9=ImageIO.read(new FileImageInputStream(new File("9.png")));
	n10=ImageIO.read(new FileImageInputStream(new File("10.png")));
	n11=ImageIO.read(new FileImageInputStream(new File("11.png")));
	n12=ImageIO.read(new FileImageInputStream(new File("12.png")));
	n13=ImageIO.read(new FileImageInputStream(new File("13.png")));
	n14=ImageIO.read(new FileImageInputStream(new File("14.png")));
	n15=ImageIO.read(new FileImageInputStream(new File("15.png")));
	n16=ImageIO.read(new FileImageInputStream(new File("16.png")));
	n17=ImageIO.read(new FileImageInputStream(new File("17.png")));
	n18=ImageIO.read(new FileImageInputStream(new File("18.png")));
	n19=ImageIO.read(new FileImageInputStream(new File("19.png")));
	n20=ImageIO.read(new FileImageInputStream(new File("20.png")));
			
	araba=ImageIO.read(new FileImageInputStream(new File("car1.png")));
	araba1=ImageIO.read(new FileImageInputStream(new File("car2.png")));
	araba2=ImageIO.read(new FileImageInputStream(new File("car3.png")));
	araba3=ImageIO.read(new FileImageInputStream(new File("car4.png")));
	araba4=ImageIO.read(new FileImageInputStream(new File("car5.png")));
	araba5=ImageIO.read(new FileImageInputStream(new File("car6.png")));
				
	serit=ImageIO.read(new FileImageInputStream(new File("serit.png")));
	stone=ImageIO.read(new FileImageInputStream(new File("rock.png")));
	yol=ImageIO.read(new FileImageInputStream(new File("road.png")));
	yol1=ImageIO.read(new FileImageInputStream(new File("road3.png")));
	
	mermi=ImageIO.read(new FileImageInputStream(new File("puskurtme.png")));
	
	sprayleft=ImageIO.read(new FileImageInputStream(new File("LEFT.png")));
	keys=ImageIO.read(new FileImageInputStream(new File("keys.png")));
	keys1=ImageIO.read(new FileImageInputStream(new File("keys1.png")));
	info=ImageIO.read(new FileImageInputStream(new File("info.png")));
	info1=ImageIO.read(new FileImageInputStream(new File("info1.png")));
	info2=ImageIO.read(new FileImageInputStream(new File("info2.png")));
	info3=ImageIO.read(new FileImageInputStream(new File("info3.png")));
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		zaman+=10;	                                								// Geçen süre arttýrýlýyor
		
			g.drawImage(yol,0,0,1280,680,this);    								    // Görsellerin ekrana çizilmesi 170-273
			
			g.drawImage(serit,engel10,210,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel20,210,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel30,210,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel40,210,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel10,420,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel20,420,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel30,420,serit.getWidth(),serit.getHeight(),this);
			g.drawImage(serit,engel40,420,serit.getWidth(),serit.getHeight(),this);
		
			g.drawImage(yol1,yol0x,0,yol1.getWidth(),yol1.getHeight(),this);
			g.drawImage(yol1,yol0x+400,0,yol1.getWidth(),yol1.getHeight(),this);
			g.drawImage(yol1,yol10x,0,yol1.getWidth(),yol1.getHeight(),this);
			
			g.drawImage(stone,stone0x,stone0y,75,75,this);
			g.drawImage(stone,stone10x,stone10y,75,75,this);
			g.drawImage(stone,stone20x,stone20y,75,75,this);
			
			g.drawImage(araba5,car50x,car50y,araba5.getWidth(),araba5.getHeight(),this);
			g.drawImage(araba4,car40x,car40y,araba4.getWidth(),araba4.getHeight(),this);
			g.drawImage(araba3,car30x,car30y,araba3.getWidth(),araba3.getHeight(),this);
			g.drawImage(araba2,car20x,car20y,araba2.getWidth(),araba2.getHeight(),this);
			g.drawImage(araba1,engel0x,engel0y,araba1.getWidth(),araba1.getHeight(),this);
			g.drawImage(araba,car0x,car0y,araba.getWidth(),araba.getHeight(),this);
			
			g.drawImage(sprayleft,100,550,sprayleft.getWidth(),sprayleft.getHeight(),this);
			g.drawImage(keys,450,550,keys.getWidth(),keys.getHeight(),this);
			g.drawImage(keys1,800,550,keys1.getWidth(),keys1.getHeight(),this);
			
			if(zaman<800) {
				g.drawImage(info,950,100,info.getWidth(),info.getHeight(),this);
			}
			if(800<zaman) {
				if(zaman<1800) {
					g.drawImage(info1,950,100,info1.getWidth(),info1.getHeight(),this);
				}			
			}
			if(1800<zaman) {
				if(zaman<2800) {
					g.drawImage(info2,950,100,info2.getWidth(),info2.getHeight(),this);
				}			
			}
			if(2800<zaman) {
				if(zaman<4000) {
					g.drawImage(info3,950,100,info3.getWidth(),info3.getHeight(),this);
				}			
			}
			
			if(ates==0) {
				g.drawImage(n20,127,585,n20.getWidth(),n0.getHeight(),this);
			}
			if(ates==1) {
				g.drawImage(n19,127,585,n19.getWidth(),n0.getHeight(),this);
			}
			if(ates==2) {
				g.drawImage(n18,127,585,n18.getWidth(),n0.getHeight(),this);
			}if(ates==3) {
				g.drawImage(n17,127,585,n17.getWidth(),n0.getHeight(),this);
			}if(ates==4) {
				g.drawImage(n16,127,585,n17.getWidth(),n0.getHeight(),this);
			}if(ates==5) {
				g.drawImage(n15,127,585,n15.getWidth(),n0.getHeight(),this);
			}if(ates==6) {
				g.drawImage(n14,127,585,n13.getWidth(),n0.getHeight(),this);
			}if(ates==7) {
				g.drawImage(n13,127,585,n13.getWidth(),n0.getHeight(),this);
			}if(ates==8) {
				g.drawImage(n12,127,585,n13.getWidth(),n0.getHeight(),this);
			}if(ates==9) {
				g.drawImage(n11,127,585,n11.getWidth(),n0.getHeight(),this);
			}if(ates==10) {
				g.drawImage(n10,127,585,n13.getWidth(),n0.getHeight(),this);
			}if(ates==11) {
				g.drawImage(n9,127,585,n13.getWidth(),n0.getHeight(),this);
			}if(ates==12) {
				g.drawImage(n8,127,585,n8.getWidth(),n0.getHeight(),this);
			}if(ates==13) {
				g.drawImage(n7,127,585,n7.getWidth(),n0.getHeight(),this);
			}if(ates==14) {
				g.drawImage(n6,127,585,n6.getWidth(),n0.getHeight(),this);
			}if(ates==15) {
				g.drawImage(n5,127,585,n5.getWidth(),n0.getHeight(),this);
			}if(ates==16) {
				g.drawImage(n4,127,585,n4.getWidth(),n0.getHeight(),this);
			}if(ates==17) {
				g.drawImage(n3,127,585,n3.getWidth(),n0.getHeight(),this);
			}if(ates==18) {
				g.drawImage(n2,127,585,n0.getWidth(),n0.getHeight(),this);
			}if(ates==19) {
				g.drawImage(n1,127,585,n0.getWidth(),n0.getHeight(),this);
			}if(ates>=20) {
				g.drawImage(n0,127,585,n0.getWidth(),n0.getHeight(),this);
			}

	   	for(Engel ates:engel) {                                 				 // Ekrandan çýkan spreylerin silinmesi
			if(ates.getX()<0) {
				engel.remove(ates);
			}
		}
		
		for(Engel ates :engel) {                                                 				// Spreylerin ekrana çizilmesi 271-273
			g.drawImage(mermi,ates.getX(),ates.getY(),mermi.getWidth(),mermi.getHeight(),this);
		   
		}
		
		
		if(check()) {                			// Spreylerin arbalar ile çarpýþma durumunda gerçekleþecek eylemlerin belirlenmesi 277-289
			engel0x=engel0x-100;	            // Araba 100 pixel geriye itiliyor
		}
		
		if(check1()) {
			car20x=car20x -100;                 // Araba 100 pixel geriye itiliyor
		}
		if(check2()) {
			car30x=car30x -100;                  // Araba 100 pixel geriye itiliyor
		}
		if(check3()) {
			car40x=car40x -100;                  // Araba 100 pixel geriye itiliyor
		}
	}
	
	public void repaint() {
		super.repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		}
	
	@Override
	public void keyPressed(KeyEvent e) {                 // Klavye tuþlarýna basýldýðýnda gerçekleþecek eylemler 301-392
		
		int tus=e.getKeyCode();
		
		if(tus==KeyEvent.VK_UP) {                        //  Yukarý yön tuþuna basýldýðýnda arabanýn saða gitmesini saðlayan iþlemler 305-324
			if(car0y<= 0) {
				car0y=0;
			}
			else {
				car0y-=cary;
				if(engel1x>10 && car2x>3) {          // Araba saða(ekrana göre yukarýya) doðru gittiðinde yol ve diðer nesneler yavaþlatýlýyor 311-321
					engelx-=0.5;                      
					car2x-=0.5;
					car3x-=0.5;
					car4x-=0.5;
					car5x-=0.5;
				engel1x-=0.5;
				engel2x-=0.5;
				engel3x-=0.5;
				engel4x-=0.5;
				}
			}
						
		}
		else if(tus==KeyEvent.VK_DOWN) {           //  Aþaðý yön tuþuna basýldýðýnda arabanýn sola gitmesini saðlayan iþlemler 325-344
			if(car0y>= 490) {
				car0y=490;
			}
			else {
				car0y+=cary;
				if(engel1x>10 && car2x>3) {       // Araba sola(ekrana göre aþaðýya) gittiðinde yol ve diðer nesneler yavaþlatýlýyor 331-341
					engelx-=0.5;
						car2x-=0.5;
						car3x-=0.5;
						car4x-=0.5;
						car5x-=0.5;
					engel1x-=0.5;
					engel2x-=0.5;
					engel3x-=0.5;
					engel4x-=0.5;
					}
			}
			
		}
		else if(tus==KeyEvent.VK_RIGHT) {      //  Sað yön tuþuna basýldýðýnda arabanýn yavaþlamasýný saðlayan iþlemler 345-364
			if(car0x>= 1000) {
				car0x=1000;
			}
			else {
				car0x+=carx;
				if(engel1x>10 && car2x>3) {    // Araba geriye(ekrana göre saða) gittiðinde yol ve diðer nesneler yavaþlatýlýyor 351-361
					engelx-=2;
						car2x-=2;
						car3x-=2;
						car4x-=2;
						car5x-=2;
					engel1x-=5;
					engel2x-=5;
					engel3x-=5;
					engel4x-=5;
					}
			}
			
		}
		else if(tus==KeyEvent.VK_LEFT) {      //  Sol yön tuþuna basýldýðýnda arabanýn hýzlanmasýný saðlayan iþlemler 365-384
			if(car0x<=250) {
				car0x=250;
			}
			else {
				car0x-=carx;
				if(engel1x<50 && car2x<25) {  // Araba ileriye(ekrana göre sola) gittiðinde yol ve diðer nesneler hýzlandýrýlýyor 371-381
					engelx+=1.5;
					car2x+=1.5;
					car3x+=1.5;
					car4x+=1.5;
					car5x+=1.5;
				engel1x+=2.5;
				engel2x+=2.5;
				engel3x+=2.5;
				engel4x+=2.5;
				}
			}
			
		}
		else if(tus==KeyEvent.VK_SPACE) {          //  Space tuþuna basýldýðýnda araçlarý püskürtmeye yarayan spreyin oluþturulmasý 385-392
			if(ates<20) {
			engel.add(new Engel(car0x,car0y-50));
			ates++;                                // Kullanýlan sprey sayýsý arttýrýlýyor
		    }
		}
		
		}
	
	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {  // Timer'ýn duracaðý vakte kadar tekrarlanan iþlemler 		
			
		if(parkur==50) {                                       // Parkur tamamlandýðýnda oyunun durmasýný saðlayan iþlemler 402-410
			timer.stop();                                      // Oyun durduruluyor
			String Game_Over =" Bravo! You finished parkour ...\n" +     // Oyunun bittiðine dair mesaj yazdýrýlýyor 404-408
                    " Time : " + zaman/1000.0 +" seconds"+
			        " \n Distance covered : "+ parkur*100 + "m"+
                    " \n Used spray : " + ates;
			JOptionPane.showMessageDialog(this, Game_Over);
			System.exit(0);	
		}
		 
		if((car0x-stone20x)<70) {                           // Arabamýz bir kayaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 412-428
			if(-70<(car0x-stone20x)) {                      // Araba ve kayanýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car0y<390) {                     
				if(280<car0y) {
					timer.stop();                           // Oyun durduruluyor
					String Game_Over =" Game Over! You crash ...\n" +         // Oyunun bittiðine dair mesaj yazdýrýlýyor 417-421
	                           " Time : " + zaman/1000.0 +" seconds"+
					           " \n Distance covered : "+ parkur*100 + "m"+
	                           " \n Used spray : " + ates;
					JOptionPane.showMessageDialog(this, Game_Over);
					System.exit(0);
		           
				}
			}
		}
	}
		
		if((car0x-stone10x)<70) {                       // Arabamýz bir kayaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 429-444
			if(-70<(car0x-stone10x)) {                  // Araba ve kayanýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car0y<200) { 
				if(85<car0y) {
					timer.stop();                        // Oyun durduruluyor
					String Game_Over = " Game Over! You crash ...\n" +        // Oyunun bittiðine dair mesaj yazdýrýlýyor 434-438
	                           " Time : " + zaman/1000.0 +" seconds"+
					           " \n Distance covered : "+ parkur*100 + "m"+
	                           " \n Used spray : " + ates;
					JOptionPane.showMessageDialog(this, Game_Over);
					System.exit(0);
		           
				}
			}
		}
	}
		
		if((car0x-stone0x)<40) {                   // Arabamýz bir kayaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 446-460
			if(-40<(car0x-stone0x)) {              // Araba ve kayanýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car0y<5) {
				if(-110<car0y) {
					timer.stop();                // Oyun durduruluyor
					String Game_Over = " Game Over! You crash ...\n" +     // Oyunun bittiðine dair mesaj yazdýrýlýyor 451-455
	                           " Time : " + zaman/1000.0 +" seconds"+
					           " \n Distance covered : "+ parkur*100 + "m"+
	                           " \n Used spray : " + ates;
			JOptionPane.showMessageDialog(this, Game_Over);
			System.exit(0);
				}
			}
		}
	}	
		if((car0x-car50x)<180) {                  // Arabamýz bir arabaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 461-475
			if(-180<(car0x-car50x)) {             // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car0y-car50y<70) {
				if(-80<car0y-car50y) {
					timer.stop();                 // Oyun durduruluyor
					String Game_Over = " Game Over! You crash ...\n" +           // Oyunun bittiðine dair mesaj yazdýrýlýyor 466-469
			                           " Time : " + zaman/1000.0 +" seconds"+
							           " \n Distance covered : "+ parkur*100 + "m"+
			                           " \n Used spray : " + ates;
			JOptionPane.showMessageDialog(this, Game_Over);
			System.exit(0);
				}
			}
		}
	}
		if((car30x-car40x)<180) {                 // Oyundaki diðer arabalarýn birbiri ile çarpýþmasý durumunda gerçekleþen iþlemler
			if(-180<(car30x-car40x)) {            // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car30y-car40y<80) {
				if(-80<car30y-car40y) {
					car30x-=300;
				}
			}
		}
	}
		
		if((car0x-car40x)<180) {               // Arabamýz bir arabaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 486-500
			if(-180<(car0x-car40x)) {          // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
			if(car0y-car40y<80) {
				if(-80<car0y-car40y) {
					timer.stop();              // Oyun durduruluyor
					String Game_Over =  " Game Over! You crash ...\n" +    // Oyunun bittiðine dair mesaj yazdýrýlýyor 491-495
	                           " Time : " + zaman/1000.0 +" seconds"+
					           " \n Distance covered : "+ parkur*100 + "m"+
	                           " \n Used spray : " + ates;
			JOptionPane.showMessageDialog(this, Game_Over);
			System.exit(0);
				}
			}
		}
	}
		
			if((car0x-car30x)<190) {           // Arabamýz bir arabaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 502-516
				if(-170<(car0x-car30x)) {      // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
				if(car0y-car30y<80) {
					if(-80<car0y-car30y) {
						timer.stop();            // Oyun durduruluyor
						String Game_Over =  " Game Over! You crash ...\n" +      // Oyunun bittiðine dair mesaj yazdýrýlýyor 507-511
		                           " Time : " + zaman/1000.0 +" seconds"+
						           " \n Distance covered : "+ parkur*100 + "m"+
		                           " \n Used spray : " + ates;
				JOptionPane.showMessageDialog(this, Game_Over);
				System.exit(0);
					}
				}
			}
		}
			
			if((car0x-car20x)<173) {            // Arabamýz bir arabaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 518-532
				if(-170<(car0x-car20x)) {       // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
				if(car0y-car20y<70) {
					if(-70<car0y-car20y) {
						timer.stop();            // Oyun durduruluyor
						String Game_Over =  " Game Over! You crash ...\n" +       // Oyunun bittiðine dair mesaj yazdýrýlýyor 523-527
		                           " Time : " + zaman/1000.0 +" seconds"+
						           " \n Distance covered : "+ parkur*100 + "m"+
		                           " \n Used spray : " + ates;
				JOptionPane.showMessageDialog(this, Game_Over);
				System.exit(0);
					}
				}
			}
		}
			
			if((car0x-engel0x)<180) {         // Arabamýz bir arabaya çarptýðýnda oyunun durmasýný saðlayan iþlemler 534-548
				if(-180<(car0x-engel0x)) {    // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
				if(car0y-engel0y<80) {
					if(-80<car0y-engel0y) {
						timer.stop();          // Oyun durduruluyor
						String Game_Over =  " You crash ...\n" +             // Oyunun bittiðine dair mesaj yazdýrýlýyor 539-543
		                           " Time : " + zaman/1000.0 +" seconds"+
						           " \n Distance covered : "+ parkur*100 + "m"+
		                           " \n Used spray : " + ates;
				JOptionPane.showMessageDialog(this, Game_Over);
				System.exit(0);
					}
				}
			}
		}
			
			if((car50x-engel0x)<180) {         // Oyundaki diðer arabalarýn birbiri ile çarpýþmasý durumunda gerçekleþen iþlemler 550-559
				if(-180<(car50x-engel0x)) {    // Arabalarýn konum deðiþkenlerine göre çarpýþma durumlarý kontrol ediliyor
				if(car50y-engel0y<80) {
					if(-80<car50y-engel0y) {
						car50x-=300;
				
					}
				}
			}
		}
			
		for (Engel ates: engel) {           // Spreylerin hareketinin saðlanmasý 561-563
			ates.setX(ates.getX()-atesx);
		}
	
	    stone0x+=stonex;                   // Arabalarýn ve kayalarýn ekranýn saðýna doðru hareketinin saðlanmasý 565-583
	    stone10x+=stone1x;
	    stone20x+=stone2x;
		yol10x+=yol1x;
		yol0x+=yolx;
		engel0x+=engelx;
		engel0y+=engely;
		car50x+=car5x;
		car50y+=car5y;
		car40x+=car4x;
		car40y+=car4y;
		car20x+=car2x;
		car20y+=car2y;
		car30x+=car3x;
		car30y+=car3y;
		engel10+=engel1x;
		engel20+=engel2x;
		engel30+=engel3x;
		engel40+=engel4x;
		
		if(car50y>=30) {              // Arabalarýn y eksenindeki hareketleri saðlanýyor 585-625
			car5y=-car5y;
		    }
		
			if(car50y<=20) {
				car5y=-car5y;
		    }
		
	
		if(car40y>=430) {
			car4y=-car4y;
		    }
		
			if(car40y<=420) {
				car4y=-car4y;
		    }
		
		
		if(car30y>=428) {
			car3y=-car3y;
		    }
		
			if(car30y<=423) {
				car3y=-car3y;
		    }
		
		if(car20y>=228) {
			car2y=-car2y;
		    }
		
			if(car20y<=223) {
				car2y=-car2y;
		    }
		
		if(engel0y>=30) {
		engely=-engely;
	    }
	
		if(engel0y<=20) {
		engely=-engely;
	    }
		
		if((yol0x)>=1200) {               // Ekrandan saðýndan çýkan nesnelerin ekranýn sol tarafýndan yeniden girmelerini saðlayan kodlar 627-677
			 yol0x=-200;
		}
		if((yol10x)>=1200) {
			 yol10x=-200;
		}
		
		if((engel20)>=1200) {
			 engel20=-100;
			 parkur++;
		}
		if((engel30)>=1200) {
			 engel30=-100;
		}
		if((engel40)>=1200) {
			 engel40=-100;
		}
		
		if((engel10)>=1200) {
			 engel10=-100;
		}
		if((engel0x)>=1200) {
			 engel0x=-100;
		}
		
		if((car20x)>=1200) {
			 car20x=-100;
		}
		
		if((car30x)>=1200) {
			 car30x=-100;
		}
		
		if((car40x)>=1200) {
			 car40x=-100;
		}
		
		if((car50x)>=1200) {
			 car50x=-100;
		}
		
		if((stone0x)>=1200) {
			 stone0x=-600;
		}
		
		if((stone10x)>=1200) {
			 stone10x=-600;
		}
		if((stone20x)>=1200) {
			 stone20x=-1000;
		}
		
		repaint();                    // Yer deðiþtiren nesnelerin yeniden çizilmesi
	}
}
