public class Main {
    public static void main(String[] args) {
        Cadet[] cadets = new Cadet[32];

        CadetUntil.insert(cadets, Cadet.of(0, "John", "Doe", SpecialityTrends.CyberSecurity));
        CadetUntil.insert(cadets, Cadet.of(1, "Jane", "Smith", SpecialityTrends.MachineLearning));

        CadetUntil.printInfo(cadets, 0);

        CadetUntil.printAll(cadets);

        CadetUntil.delete(cadets, 1);

        CadetUntil.printInfo(cadets, 1);
    }
}