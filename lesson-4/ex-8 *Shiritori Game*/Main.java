public class Main{
    public static void main(String[] args) {    
    Shiritori my_shiritori = new Shiritori();
   
    my_shiritori.play("word");
    my_shiritori.play("dowry");
    my_shiritori.play("yodel");
    my_shiritori.play("leader");
    my_shiritori.play("righteous");
    my_shiritori.play("serpent");
    my_shiritori.printWords();
    my_shiritori.restart();

    my_shiritori.play("motive");
    my_shiritori.play("beach");
    my_shiritori.printWords();
    my_shiritori.restart();

    my_shiritori.play("hive");
    my_shiritori.play("eh");
    my_shiritori.play("hive"); 
    my_shiritori.printWords();
    my_shiritori.restart();
    
}
}
