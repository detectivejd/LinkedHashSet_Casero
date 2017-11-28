package linkedsetsimplev1;
public class Cuerpo 
{
    public static void main(String[] args) {
        MySet<String>set = new MyLinkedSet();
        set.add("Deborah");
        set.add("Tommy");
        set.add("Franco");
        set.add("Manuela");
        set.add("Miguel");
        set.add("Denisse");
        System.out.println("\t\tORDEN NORMAL");
        set.stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("");
        MyLinkedSet<String>set2 = new MyLinkedSet();
        set2.add("Franco");
        set2.add("Miguel");
        set2.add("Manuela");
        set2.add("Tommy");        
        set2.add("Deborah");
        set2.add("Denisse");
        System.out.println("\t\tORDEN NINGUNO");        
        set2.stream().forEach((s) -> {
            System.out.println(s);
        });
    }    
}