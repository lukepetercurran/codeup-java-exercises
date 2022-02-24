public class WoWTesting {
    public static void main(String[] args){
        float crit;
        float time;
        float effective;
        for (time = 1; time < 6.5f; time += 0.5f){
            for(crit = 10; crit < 101; crit ++){
                effective = 190 * 15 / (45 + (time / (0.2f * (crit /100))));
                System.out.println("" + crit + "" + time + "" + effective + "");
            }
        }
    }
}


// Icon Crit = 22.37%
// Sextant Crit = 24.18%
// Starfire Cast Time = 3 Seconds