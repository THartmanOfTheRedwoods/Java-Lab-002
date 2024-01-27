import java.util.ArrayList;

public class StumpTheChump {
    // Initially working program.
    public static void main(String[] args) {
        System.out.println("Hi Chump, can you be stumped?");
        System.out.println("These are the chumps...");
        ArrayList<String> chumps = new ArrayList<String>();
        chumps.add("Joseph");
        chumps.add("William");
        chumps.add("Sebastian");
        chumps.add("Ibrahim");

        for (int i = 0; i < chumps.size(); i++)
        System.out.print(chumps.get(i));

    }
}

