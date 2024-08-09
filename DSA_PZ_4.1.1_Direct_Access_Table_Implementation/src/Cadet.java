public class Cadet {
    public int id;
    public String name;
    public String lastName;
    public SpecialityTrends speciality;

    private Cadet(int id, String name, String lastName, SpecialityTrends speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }
    public static Cadet of(int id, String name, String lastName, SpecialityTrends speciality) {
        return new Cadet(id, name, lastName, speciality);
    }

    @Override
    public String toString() {
        return "Cadet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality=" + speciality +
                '}';
    }
}
