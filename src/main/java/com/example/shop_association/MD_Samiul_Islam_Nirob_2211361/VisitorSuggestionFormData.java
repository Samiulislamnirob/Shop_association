package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

public class VisitorSuggestionFormData {
    private String name;
    private String email;
    private String suggestions;
    private String suggestionsType;

    public VisitorSuggestionFormData() {
    }

    public VisitorSuggestionFormData(String name, String email, String suggestions, String suggestionsType) {
        this.name = name;
        this.email = email;
        this.suggestions = suggestions;
        this.suggestionsType = suggestionsType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getSuggestionsType() {
        return suggestionsType;
    }

    public void setSuggestionsType(String suggestionsType) {
        this.suggestionsType = suggestionsType;
    }

    @Override
    public String toString() {
        return "VisitorSuggestionFormData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", suggestions='" + suggestions + '\'' +
                ", suggestionsType='" + suggestionsType + '\'' +
                '}';
    }
}
