import сharacters.*;
import cosmicobjects.*;
import states.State;
import states.UpsideDown;
import states.Weightlessness;

public class Main {
    public static void main(String[] args) {
        // создаю космические объекты
        CosmicObject earth = new Earth("Земля", 9.8, CosmicObjectsTypes.Planet, 6371.0, 5.97 * (10 ^ 6));
        CosmicObject moon = new Moon("Луна", 1.6, CosmicObjectsTypes.Sputnic , 1737.4, 7.36 * (10 ^ 4));
        CosmicObject sun = new Sun("Солнце", 274, CosmicObjectsTypes.Star, 696340, 1.99 * (10 ^ 12));
        Human neznaika = new Neznaika("Незнайка", 15.0, moon);
        Human ponchik = new Ponchik("Пончик", 17.0, moon);
        Human neznaika2 = new Neznaika("Незнайка", 90.0, earth);
        Human ponchikd = new Ponchik("Пончик", 100.0, earth);
        State weightlessness = new Weightlessness("невесомость", 0, "нет");
        State upsidedown = new UpsideDown("перевернуто",0 ,"вверх тормашками");
        State up = new UpsideDown("повернуто",0 ,"вверху");
        State down = new UpsideDown("повернуто",0 ,"внизу");
        Boots boots = new Boots("Сапожки Пончика", 1.0, "резина", "скользкий" );



        System.out.println("На "  + earth.getSurfaceGravity());
        System.out.println("На "  + moon.getSurfaceGravity());
        System.out.println("На " + moon.getName() + " сила тяжести в " + 6 + " раз меньше, чем на " + earth.getName() + ".");
        System.out.println();
        moon.attracts(neznaika, earth);
        moon.attracts(ponchik, earth);
        System.out.println();
        System.out.println(neznaika.getName() + " и " + ponchik.getName() + " долгое время провели в состоянии  " + weightlessness.getName() + ", отвыкли от " + earth.getSurfaceGravity() + ".");
        neznaika.notjump(moon);
        neznaika.walk();
        ponchik.notjump(moon);
        ponchik.walk();
        System.out.println();
        System.out.println(ponchik.getName() + " думал, что " + moon.getName() +  " , " +
                neznaika.getName() + " и " + ponchik.getName() + " "  + upsidedown.getName() +
                " " + upsidedown.getDirection( ) + ".");
        System.out.println( ponchik.getName() + "у мерещилось, что " + moon.getName()
        + " " + up.getDirection() + " , " + sun.getName() + " " + down.getDirection()
        + " ,a " + ponchik.getName() + " " + upsidedown.getName() +
                " " + upsidedown.getDirection( ) + " прицепившись к " + moon.getName() + ".");
        System.out.println();
        ponchik.afraid(); System.out.print(boots.getOwnername() + " и "); ponchik.fly();
        System.out.print(upsidedown.getDirection() + " ,а " + boots.getOwnername());
        boots.stay(); System.out.print(moon.getName() + ".");
        System.out.println();
        System.out.print("Это заставляло " + ponchik.getName());
        ponchik.grab();
        System.out.print(boots.getOwnername());
        ponchik.tighten();
        System.out.println();


    }





}
