package test1;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {
        dictionary.put(en.toLowerCase(), ru);
    }

    public String translate(String en) {

        return dictionary.getOrDefault(en.toLowerCase(), en);

    }

    public String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder translatedText = new StringBuilder();
        for (String word : words) {
            String translatedWord = translate(word);
            translatedText.append(translatedWord);
            translatedText.append(" ");
        }
        return translatedText.toString();
    }

}
