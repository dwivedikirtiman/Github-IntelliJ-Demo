package UserInputDirectoryChapter3;

public class typeConversionTopic {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);  //normal printing of a integer
        float d= 4;
        System.out.println(d); //float can take integer value so it is implicit conversion
        double dk= 5.66f;
        System.out.println(dk); //doulbe  can contain float value so it is also implicit conversion

        //Now  it's time for explicit conversion
        int tk=  (int) 5.6f;   //integer can not contain float value but here we are giving it a float value so it is compulsory to make it cast or  say do the explicit conversion by mentioning same data type in "()"
        System.out.println(tk);

        float gg = (float) 95555555555L;
        System.out.println(gg);  //float value can't contain long  so explicit conversion is needed
    }
}
