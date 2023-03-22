public class Psyduck extends Pokemon implements INoise {
    public Psyduck(String name, int level) {

        super(name, level);
        type = new WaterType();
    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(20*level);
        lifePoint++;
        this.levelUp();
    }

    @Override
    public void levelUp() {
        if(lifePoint > 10*level){
            level++;
            System.out.println("Psyduck has leveled up");
        }else{
            System.out.println("Not enough experience for Psyduck");
        }
    }

    @Override
    public String makeNoise() {
        return "Psy~~~duck";
    }
}
