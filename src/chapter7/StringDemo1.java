package chapter7;

public class StringDemo1 {
    public static void main(String[] args) {
        String strOb1 = "pervaya stroka";
        String strOb2 = "vtoraya stroka";
        String strOb3 = strOb1;
        System.out.println(strOb1.length());
        System.out.println(strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("strOb1=strOb2");
        else System.out.println("strOb1!=strOb2");
        if (strOb1.equals(strOb2))
            System.out.println("strOb1=strOb2");
        else System.out.println("strOb1!=strOb2");
    }
}
