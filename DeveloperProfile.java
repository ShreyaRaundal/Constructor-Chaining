public class DeveloperProfile {
    String name;
    String primarySkill;
    int experience;
    String location;
    String email;

    // No-arg constructor
    DeveloperProfile() {
        this("Unknown", "Java", 0, "Remote", "not_provided@dev.com");
        System.out.println("No-arg constructor executed");
    }

    // 2-arg constructor
    DeveloperProfile(String name, String primarySkill) {
        this(name, primarySkill, 1, "Bangalore", "default@developer.com");
        System.out.println("2-arg constructor executed");
    }

    // 3-arg constructor
    DeveloperProfile(String name, String primarySkill, int experience) {
        this(name, primarySkill, experience, "Pune", "contact@dev.com");
        System.out.println("3-arg constructor executed");
    }

    // Full-arg constructor
    DeveloperProfile(String name, String primarySkill, int experience, String location, String email) {
        this.name = name;
        this.primarySkill = primarySkill;
        this.experience = experience;
        this.location = location;
        this.email = email;
        System.out.println("Full-arg constructor executed");
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Skill: " + primarySkill);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Location: " + location);
        System.out.println("Email: " + email);
    }
}
