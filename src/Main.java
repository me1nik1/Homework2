public class Main {
    public static void main(String[] args) {
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var fighterWeight1 = 78.2;
        System.out.println(fighterWeight1);
        var fighterWeight2 = 82.7;
        System.out.println(fighterWeight2);
        var sumWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Общий вес бойцов " + sumWeight + " кг");
        var differenceWeight = fighterWeight1 - fighterWeight2;
        System.out.println(differenceWeight);
        var differWeight = fighterWeight2 % fighterWeight1;
        System.out.println("Разница в весе между бойцами " + differWeight + " кг");

        var workingHours = 640;
        System.out.println(workingHours);
        var dailyHours = 8;
        System.out.println(dailyHours);
        var totalEmployees = workingHours / dailyHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        dailyHours = workingHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + dailyHours + " часов работы может быть поделено между сотрудниками!");










    }
}