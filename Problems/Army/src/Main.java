public static void createArmy() {
    Unit[] units = new Unit[]{
            new Unit("First unit"),
            new Unit("Second unit"),
            new Unit("Third unit"),
            new Unit("Fourth unit"),
            new Unit("Fifth unit")
    };
    Knight[] knights = new Knight[]{
            new Knight("First knight"),
            new Knight("Second knight"),
            new Knight("Third knight"),
    };
    new General("General");
    new Doctor("Doctor");
}