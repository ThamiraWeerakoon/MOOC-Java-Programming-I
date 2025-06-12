public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compareTo) {
        if (this == compareTo) {
            return true;
        }

        if (!(compareTo instanceof Archive)) {
            return false;
        }

        Archive other = (Archive) compareTo;

        return this.identifier.equals(other.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
