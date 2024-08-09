class CadetUntil {
    public static void insert(Cadet[] cadets, Cadet cadet) { //Correct
        if (cadet.id < 0 || cadet.id >= cadets.length) {
            System.out.println("Invalid ID range");
            return;
        }
        cadets[cadet.id] = cadet;
    }

    public static Cadet search(Cadet[] cadets, int id) { //Correct
        if (id < 0 || id >= cadets.length) {
            System.out.println("Invalid ID range");
            return null;
        }
        return cadets[id];
    }

    public static void delete(Cadet[] cadets, int id) { //Correct
        if (id < 0 || id >= cadets.length) {
            System.out.println("Invalid ID range");
            return;
        }
        cadets[id] = null;
    }

    public static void printInfo(Cadet[] cadets, int id) { //Correct
        Cadet cadet = search(cadets, id);
        if (cadet != null) {
            System.out.println(cadet);
        } else {
            System.out.println("Cadet not found");
        }
    }

    public static void printAll(Cadet[] cadets) {
        for (Cadet cadet : cadets) {
            if (cadet != null) {
                System.out.println(cadet);
            }else{
                System.out.println("Cadets not found");
                return;
            }
        }
    }
}
