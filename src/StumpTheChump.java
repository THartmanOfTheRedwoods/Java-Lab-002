public class StumpTheChump {
    // Initially working program.
    static String date = "";
    static int day = 24;
    static int month = 1;
    static int year = 2024;

    public static String encrypt(String s, int r)
    {
        for (int i = 0; i <= r; i++)
        {
            if(i%2 == 0){
                s = s.replace("%s", "s%");
            }
            s = s.replace("%", "%s%s");
        }
        return s;
    }

    public static String decrypt(String s, int r)
    {
        for(int i = r; i >= 0; i--)
        {
            s = s.replace("%s%s", "%");
            if(i%2 ==0)
            {
                s = s.replace("s%", "%s");
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        date = month+"/"+day+"/"+year;
        System.out.printf("\nCurrent Date (American): " + decrypt("sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss/sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss/sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss" + "\n", 4), month, day, year);
        date = day+"/"+month+"/"+year;
        System.out.printf("\nCurrent Date (European): " + decrypt("sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss/sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss/sss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sssss%s%ss%s%sss%s%ss%s%ssss%s%ss%s%sss%s%ss%s%sss" + "\n", 4), day, month, year);
    }
}
