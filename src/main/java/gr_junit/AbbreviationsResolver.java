package gr_junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbbreviationsResolver {
    private final HashMap<String, String> abbreviations;

    public AbbreviationsResolver() {
        this.abbreviations = new HashMap<String, String>();
    }

    public String createAbbreviations(String name) {
        if(name.matches("^[a-zA-Z].*\\p{Punct}+[a-zA-Z].*$")){

            throw new RuntimeException("Name 1");
        }
        String[] words = name.split(" ");
        if (words.length < 2) {
            throw new RuntimeException("Name 2");
        }
        StringBuilder abbreviation = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            abbreviation.append(words[i].toUpperCase().charAt(0));
        }
        abbreviations.put(name, abbreviation.toString());
        return abbreviation.toString();
    }

    public boolean abbreviationExits(String abbreviation) {
        if (!abbreviation.toUpperCase().equals(abbreviation)) {
            throw new RuntimeException("Abbreviation should be in upper case");
        }
        return abbreviation.contains(abbreviation);
    }

    public List<String> resolveAbbreviation(String abbreviation) {
        List<String> matchNames = new ArrayList<>();
        for (Map.Entry<String, String> entry : abbreviations.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(abbreviation)) {
                matchNames.add(entry.getKey());
            }
        }
        return matchNames;
    }
}
