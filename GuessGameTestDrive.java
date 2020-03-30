class GuessGameTestDrive {
public static void main (String[] args) {
 GuessGame game = new GuessGame();
 game.startGame();
}
}

class player {
 int number = 0;
public void guess () {
number = (int) (Math.random() * 10);
System.out.println ("This is number is " + number);
}
}

