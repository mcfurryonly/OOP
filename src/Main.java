public class Main {
    public static void main(String[] args) {
        Slytherin draco = new Slytherin("Драко Малфой", 50, 70,
                20, 50, 70, 50, 70);

        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 80, 55,
                10, 60, 60, 70, 55);

        Slytherin gregori = new Slytherin("Грегори Гойл", 30, 40,
                50, 40, 75, 90, 90);


        Ravenclaw chou = new Ravenclaw("Чжоу Чанг", 15, 25,
                15, 55, 55, 30);

        Ravenclaw padma = new Ravenclaw("Падма Патил", 25, 35,
                45, 55, 45, 75);

        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 35, 45,
                55, 65, 75, 85);


        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 12, 22,
                32, 42, 52);

        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 22, 32,
                42, 52, 62);

        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 32,
                42, 52, 62, 72);


        Gryffindor harry = new Gryffindor("Гарри Поттер", 60, 80,
                66, 47, 90);

        Gryffindor hermiona = new Gryffindor("Гермиона Грейнджер", 75, 55,
                90, 93, 60);

        Gryffindor ron = new Gryffindor("Рон Уизли", 35, 30,
                15, 40, 25);



        print(draco);
        print(chou);
        print(zakharia);
        print(harry);
        System.out.println();



        (harry).compareGryffindor(hermiona);
        System.out.println();

        (zakharia).compareHufflepuff(sedrik);
        System.out.println();

        (chou).compareRavenclaw(padma);
        System.out.println();

        (draco).compareSlytherin(gregori);
        System.out.println();




        Gryffindor.compareGryffindorStudents(harry, ron);
        System.out.println();

        Hufflepuff.compareHufflepuffStudents(zakharia, sedrik);
        System.out.println();

        Ravenclaw.compareRavenclawStudents(padma, chou);
        System.out.println();

        Slytherin.compareSlytherinStudents(draco, gregori);
        System.out.println();



        harry.compareHogwarts(draco);
        System.out.println();

        chou.compareHogwarts(gregori);
        System.out.println();

    }

    public static void print(Hogwarts students) {
        System.out.println(students);
    }
    }
