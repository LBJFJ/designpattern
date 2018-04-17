package builder.sample03_seperate;

public class Builder {
    String name;
    String favorite;
    String birthPlace;

    public Builder name(String name) {
        this.name = name;
        return this;
    }
    
    public Builder favorite(String favorite) {
        this.favorite = favorite;
        return this;
    }

    public Builder birthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setName(name);
        person.setFavorite(favorite);
        person.setBirthPlace(birthPlace);
        
        return person;
    }
}
