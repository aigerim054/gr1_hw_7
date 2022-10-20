public class Medic extends Hero {
    @Override
    public void applySuperAbility(){
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
}
        private double healPoints=18.0;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }
    public void increaseExperience(){
        for (int i = 0; i < healPoints; i+=10) {
            System.out.println("Medic experience was increased by i+");

        }
    }
}
