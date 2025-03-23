package Fight.Modules;

import javax.lang.model.element.Name;

// character
public class Character {
    // definindo as variaveis
    protected int life;
    protected int strength;
    protected int stamina;
    protected int speed;
    protected String name;


    // constructor for character
    public Character(int life, int strength, int stamina, int speed, String name) {
        this.life = life;
        this.strength = strength;
        this.stamina = stamina;
        this.speed = speed;
        this.name = name;
    }


    // getters
    public int getLife() {return life;}
    public int getStrength() {return strength;}
    public int getStamina() {return stamina;}
    public int getSpeed() {return speed;}
    public String getName() {return name;}

    //
}
