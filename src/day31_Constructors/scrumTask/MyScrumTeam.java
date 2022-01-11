package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        //3 tester objects

        Tester tester1 = new Tester("Layan", 1134, "SDET", 110000);
        Tester tester2= new Tester("Lala", 23,"SDET",115000);
        Tester tester3= new Tester("Hulya", 11, "QA",85000);

        Tester[] testers = {tester1, tester2, tester3};

        //4 developer objects

        Developer developer1 = new Developer("Bruce", 134, "Developer", 125000);
        Developer developer2 = new Developer("Brian", 1344, "Developer", 145000);
        Developer developer3 = new Developer("Olga", 3223, "Selenium Developer", 132000);
        Developer developer4 = new Developer("Bruce", 1353, "Java Developer", 104000);

        Developer[] developers = {developer1, developer2, developer3, developer4};
        //1 Scrum Team object

        ScrumTeam scrumTeam = new ScrumTeam("Nigara", "Huseyin", "Ali", 14);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);

        System.out.println("--------------------------");

        for(Tester eachTester : scrumTeam.testersList){
            System.out.println(eachTester.name + " ; " + eachTester.salary);
        }

        System.out.println("-----------");

        for(Developer eachDeveloper : scrumTeam.devopsList){
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("--------------");

        scrumTeam.removeTester(23);

        System.out.println("-------------");

        scrumTeam.removeDeveloper(1353);

    }
}
