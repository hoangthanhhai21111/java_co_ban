package keThua;

public class conNguoi {
    private String name;
    private String dayOfBirth;

    conNguoi(String name, String dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void an() {
        System.out.println("an com");
    }

    public void uong() {
        System.out.println("uong nuoc");
    }
}
