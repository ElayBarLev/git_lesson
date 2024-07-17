public class Person {
    private String numOnArm;
    private int shitPerDay;
    private double pissPerDay;

    public Person(String numOnArm, double pissPerDay, int shitPerDay) {
        this.shitPerDay = shitPerDay;
        this.pissPerDay = pissPerDay;
        this.numOnArm = numOnArm;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person" + numOnArm
                " shits " + shitPerDay +
                "and piss " + pissPerDay +
                " Per Day" +'\'';
    }
}
