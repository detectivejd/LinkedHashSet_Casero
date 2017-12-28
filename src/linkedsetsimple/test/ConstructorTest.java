package linkedsetsimple.test;
import linkedsetsimple.structs.MyMap;
import linkedsetsimple.structs.MyLinkedSet;
public class ConstructorTest extends Test
{
    private void creando_set_vacio() throws Exception{
        MyLinkedSet<String>set = new MyLinkedSet();
        this.comprobar_que(set.isEmpty());
    }
    private void creando_set_normal() throws Exception {
        MyLinkedSet<String>set = new MyLinkedSet();
        set.add("Deborah");
        set.add("Tommy");
        set.add("Franco");
        set.add("Manuela");
        this.comprobar_que(set.size() == 4);
    }
    private void creando_set_con_capacidad_de_dos_elementos() throws Exception{
        MyLinkedSet<String>set = new MyLinkedSet(2);
        set.add("Paula");
        set.add("Pedro");
        set.add("Fabio");
        set.add("John");
        set.add("Manuela");
        set.add("Andrea");
        set.add("Luisa");
        this.comprobar_que(set.size() == 7);
    }
    private void creando_set_con_capacidad_de_un_elemento() throws Exception{
        MyLinkedSet<String>set = new MyLinkedSet(1);
        set.add("Luis");
        set.add("Edelma");
        set.add("Arnoldno");
        set.add("Edinson");
        this.comprobar_que(set.size() == 4);
    }
    private void pasar_datos_de_hashset_a_nuestro_set() throws Exception{
        java.util.HashSet<String>s1 = new java.util.HashSet();
        s1.add("Agustin");
        s1.add("Amanda");
        s1.add("Olivia");
        s1.add("Maite");
        /*---------------------------------------*/
        MyLinkedSet<String>set = new MyLinkedSet(s1);
        this.comprobar_que(set.size() == 4);
    }
    private void pasar_datos_de_arraylist_a_nuestro_set() throws Exception{
        java.util.ArrayList<String>a1 = new java.util.ArrayList();
        a1.add("Agustin");
        a1.add("Amanda");
        a1.add("Olivia");
        a1.add("Maite");
        /*---------------------------------------*/
        MyLinkedSet<String>set = new MyLinkedSet(a1);
        this.comprobar_que(set.size() == 4);
    }
    private void pasar_datos_de_hashmap_a_nuestro_set() throws Exception{
        MyMap<Integer, String> m = new MyMap();
        m.put(1, "Agustin");
        m.put(2, "Amanda");
        m.put(3, "Olivia");
        m.put(4, "Maite");
        /*---------------------------------------*/
        MyLinkedSet<String>set = new MyLinkedSet(m.values());
        this.comprobar_que(set.size() == 4);
    }
    @Override
    public void test() {
        try {
            this.creando_set_vacio();
            this.creando_set_normal();
            this.creando_set_con_capacidad_de_dos_elementos();
            this.creando_set_con_capacidad_de_un_elemento();
            this.pasar_datos_de_hashset_a_nuestro_set();
            this.pasar_datos_de_arraylist_a_nuestro_set();
            this.pasar_datos_de_hashmap_a_nuestro_set();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}