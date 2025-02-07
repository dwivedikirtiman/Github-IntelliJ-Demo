package DataTypeVariableAndConvention;

public class EscapeExamplePractice {
    public static void main(String[] args) {
        System.out.println("Kirtiman Dwivedi");
        System.out.println("Kirtiman \tDwivedi");  // \t escape sequence matlab tab
        System.out.println("Kirtiman \bDwivedi");  // \b escape sequence matlab backspace marega ek
        System.out.println("Kirtiman \nDwivedi......");  // \n escape sequence matlab new line
        System.out.println("Kirtiman \'Dwivedi\'");   // \' \' matlab single inverted comma escape sequnce
        System.out.println("Kirtiman 'Dwivedi'");     //matlab single inverted comma ko upar jaise method se bhi kar skte hai aur direct ye method se seedha single inverted comman dekar bhi kar sakte hai
        System.out.println("Kirtiman \"Dwivedi\"");  //  \" \" matlab Double inverted comma escape sequnce
    }
}
