public class Weapon {
    
    //Properties/Attributes
    int damage;
    float weight;
    String name;
    String description;
    String rarity;
    boolean hasElementalDamage;

    //Method
    public void showDescription() {
        System.out.println("Description: " + description);
    }
}
