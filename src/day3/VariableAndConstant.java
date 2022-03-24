package day3;

public class VariableAndConstant {

    public static void main(String[] args) {
        String videoId = "asdasdasd";

        videoId = "dfdfdfefd";

        final String TITLE = "Some Title";
//        TITLE = "Changed Title";

        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }


        int a = 2;
        int b = 3;

        int c = a + b;

        int x = 0;

        x += 3; // x = x + 3;
//        x -= 3; // x = x - 3;
//        x *= 3; // x = x * 3;
//        x /= 3; // x = x / 3;

        System.out.println(x);




    }

}
