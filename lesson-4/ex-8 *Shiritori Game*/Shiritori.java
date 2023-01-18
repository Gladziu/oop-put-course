import java.util.ArrayList;

public class Shiritori {
    ArrayList<String> wordsList = new ArrayList<String>();

    private boolean game_over = false;

    public boolean play(String word){
        if(game_over == true){
            return game_over;
        }

        if(wordsList.contains(word)){
            System.out.println( word + " has already been used");
            return game_over = true;
        }

        if (wordsList.size() == 0){
            wordsList.add(word);
            return game_over = false;
        } else {
            wordsList.add(word);
        }

        String perviousWord = wordsList.get(wordsList.size() - 2);
        String lastLetter = perviousWord.substring(perviousWord.length() - 1);

        if (!word.substring(0, 1).equals(lastLetter)) {
            System.out.println("'" + word + "' does not start with '" + lastLetter + "'");
            return game_over = true;
        }
        return game_over = false;
    }

    public void restart(){
        wordsList.clear();
        game_over = false;
        System.out.println("Game Restarted!\n");
    }

    public void printWords(){
        System.out.println(wordsList);
    }
}
