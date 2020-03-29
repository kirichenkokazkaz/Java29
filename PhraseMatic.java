public class PhraseMatic {
  public static void main (String [] args) {
     String[] wordlistone = {"Таня", "Боря", "Антон", "Саша", "Акула"};
     String[] wordlisttwo = {"поехал(а)", "пошел(ла)", "полетел", "поплыл", "рисуют"};
     String[] wordlistthree = {"учиться", "на баттл", "танцевать"};

int one = wordlistone.length;
int two = wordlisttwo.length;
int three = wordlistthree.length;

int rand1 = (int) (Math.random () * one);
int rand2 = (int) (Math.random () * two);
int rand3 = (int) (Math.random () * three);

String phrase = wordlistone [rand1] + " " + wordlisttwo [rand2] + " " + wordlistthree [rand3];

System.out.println ("Робот говорит - тогда" + phrase);
}
}