public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon();
        weapon.setTypeWeapon("Firearms");
        weapon.setNameWeapon("Grenade launcher");


        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamage(40);
        boss.setProtect("Fire");
        boss.setWeapon(weapon);


        System.out.println( "Health: [" + boss.getHealth() + "]\nDamage: [" + boss.getDamage() +
                "]\nProtect: [" + boss.getProtect() + "]\nWeapon type: [" + boss.getWeapon().getTypeWeapon() + "]" +
                "\nName: [" + boss.getWeapon().getNameWeapon() + "]");
    }
}

