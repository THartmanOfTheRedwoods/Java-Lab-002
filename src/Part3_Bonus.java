
public class Part3_Bonus {
    public static void main(String[] args) {
        float testValue = 3.141592F;
        int testValue2 = 3141592;

        String text = "Sometimes its helpful to represent a decimal like %f,\nbut other times it is more precise to use integers like %d.\nOther times you might like scientific notation like %e";

        System.out.println(
                String.format(text, testValue, testValue2, testValue)
        );
    }
}