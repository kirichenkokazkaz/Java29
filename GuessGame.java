public class GuessGame {
 player p1;
 player p2;
 player p3;
 
  public void startGame () {
   p1= new player ();
   p2= new player ();
   p3= new player ();
   
   int guessp1 = 0; 
   int guessp2 = 0;
   int guessp3 = 0;

   boolean pl1 = false;
   boolean pl2 = false;
   boolean pl3 = false;

   int targetNumber = (int) (Math.random() * 10);
   System.out.println("Ya zagadyvay chislo ot 0 do 9...");

   while(true) {
    System.out.println ("Chislo, kotoroe nyzhno ugadat, -" + targetNumber);

p1.guess();
p2.guess();
p3.guess();

guessp1 = p1.number;
System.out.println("Pervyi igrok dymaet. wo eto chislo - " + guessp1);

guessp2 = p2.number;
System.out.println ("Vtoroi igrok dymaet. wo eto chislo - " + guessp2);

guessp3 = p3.number;
System.out.println ("Tretii igrok dymaet. wo eto chislo  - " + guessp3);

if (guessp1 == targetNumber) {
pl1 = true;
}

if (guessp2 == targetNumber) {
pl2 = true;
}

if (guessp3 == targetNumber) {
pl3 = true;

if (pl1 || pl2 || pl3);

  System.out.println ("We have winner");
  System.out.println ("This first player?" + pl3);
  System.out.println ("This the second player?" + pl2);
  System.out.println ("This the 3 player?" + pl3);
  System.out.println ("The end.");
  break;

} else {
System.out.println ("Player could play game again.");
}
}
}
}


