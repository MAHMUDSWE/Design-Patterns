package compositePattern;

public class ArmyPersonnelDetails {
    public static void main(String[] args) {
        MajorGeneral mGeneral1 = new MajorGeneral(1101, "Maksudur Rahman", 50000);
        Employee mGeneral2 = new MajorGeneral(1102, "Zahid Hossain", 50000);
        Employee lGeneral1 = new LieutenantGeneral(2001, "Ataul Hakim", 60000);
        Employee lGeneral2 = new LieutenantGeneral(2002, "Matiur Rahman", 60000);
        Employee general = new General(3001, "Shafiuddin Ahmed", 80000);

        general.add(lGeneral1);
        general.add(lGeneral2);
        lGeneral1.add(mGeneral1);
        lGeneral1.add(mGeneral2);

        general.print();
    }
}
