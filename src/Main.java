

public class Main {
    public static void main(String[] args) {
        String s1 = "I Like to code near the Lake with my friend Luke" ;

        String s2 = s1.replaceAll("L[^u]ke","BLA");

        System.out.println(s2);



        /*
        Pattern pattern = Pattern.compile("[lL]|ke");
        s1.replaceAll(pattern.pattern(),"BLA");
        System.out.println(s1);*/

        // String s2 = s1.compareToIgnoreCase(s1.substring("l"|"ke","Bla");
        //String s2 = {s1.startsWith("l")s1.startsWith("ke")+s1.replaceAll("l","BLA")+s1.replaceAll("ke","BLA")};
        //System.out.println(s2);



    }
}