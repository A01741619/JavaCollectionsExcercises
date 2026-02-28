import java.util.*;

public class TranslationDictionary {

    private Map<String, Map<String, String>> dictionary = new HashMap<>();

    public void addTranslation(String englishWord, String language, String translation) {

        Map<String, String> translations =
                dictionary.computeIfAbsent(englishWord, k -> new TreeMap<>());

        translations.put(language, translation);
    }

    public Map<String, String> getTranslations(String englishWord) {
        return dictionary.get(englishWord);
    }

    public Set<String> getLanguages(String englishWord) {
        Map<String, String> translations = dictionary.get(englishWord);
        return translations != null ? translations.keySet() : Collections.emptySet();
    }

    public static void main(String[] args) {

        TranslationDictionary dict = new TranslationDictionary();

        dict.addTranslation("apple", "Spanish", "manzana");
        dict.addTranslation("apple", "French", "pomme");
        dict.addTranslation("apple", "German", "Apfel");

        dict.addTranslation("car", "Spanish", "auto");
        dict.addTranslation("car", "French", "voiture");

        
        dict.addTranslation("car", "Spanish", "auto"); //update

        // Lookup a word
        System.out.println("Buscar 'apple'");
        Map<String, String> appleTranslations = dict.getTranslations("apple");
        System.out.println(appleTranslations);

        System.out.println("Idiomas disponibles para 'apple':");
        System.out.println(dict.getLanguages("apple"));

        
    }
}
