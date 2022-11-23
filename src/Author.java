import java.util.Objects;

public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return this.name + " " + this.secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}
