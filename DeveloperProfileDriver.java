public class DeveloperProfileDriver {
    public static void main(String[] args) {
        System.out.println("----- Default Developer -----");
        DeveloperProfile dev1 = new DeveloperProfile();
        dev1.displayProfile();

        System.out.println("\n----- Junior Developer -----");
        DeveloperProfile dev2 = new DeveloperProfile("Shreya", "Web Development");
        dev2.displayProfile();

        System.out.println("\n----- Mid-Level Developer -----");
        DeveloperProfile dev3 = new DeveloperProfile("Ravi", "Android", 3);
        dev3.displayProfile();

        System.out.println("\n----- Senior Developer -----");
        DeveloperProfile dev4 = new DeveloperProfile("Aarti", "Machine Learning", 6, "Pune", "aarti.ml@company.com");
        dev4.displayProfile();
    }
}
