package builder.sample04_allinone;

public class Person {
    private String name;
    private String favorite;
    private String birthPlace;

    private Person(Builder builder) {
        this.name = builder.name;
        this.favorite = builder.favorite;
        this.birthPlace = builder.birthPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public static class Builder {
        private String name;
        private String favorite;
        private String birthPlace;

        public Builder(String name) {
            this.name = name;
        }

        public Builder favorite(String favorite){
            this.favorite = favorite;
            return this;
        }
        
        public Builder birthPlace(String birthPlace){
            this.birthPlace = birthPlace;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
