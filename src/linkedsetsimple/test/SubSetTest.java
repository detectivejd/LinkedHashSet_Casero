package linkedsetsimple.test;
import linkedsetsimple.structs.MyLinkedSet;
public class SubSetTest extends Test
{
    //<editor-fold desc="relleno de datos">
        private void cargando(MyLinkedSet<String> set){            
            set.add("Deborah");
            set.add("Tommy");
            set.add("Franco");
            set.add("Manuela");
            set.add("Miguel");
            set.add("Denisse");
        }
    //</editor-fold>
    //<editor-fold desc="pruebas">
        private void probando_subconjunto_normal() throws Exception {
            MyLinkedSet<String>s1 = new MyLinkedSet();
            this.cargando(s1);
            MyLinkedSet<String>s2 = new MyLinkedSet();
            s2.add("Deborah");
            s2.add("Manuela");
            this.comprobar_que(s1.containsAll(s2));
        }
        private void probando_subconjunto_S1_vacio() throws Exception {
            MyLinkedSet<String>s1 = new MyLinkedSet();
            MyLinkedSet<String>s2 = new MyLinkedSet();
            s2.add("Deborah");
            s2.add("Manuela");
            this.comprobar_que(!s1.containsAll(s2));
        }
        private void probando_subconjunto_S2_vacio() throws Exception {
            MyLinkedSet<String>s1 = new MyLinkedSet();
            this.cargando(s1);
            MyLinkedSet<String>s2 = new MyLinkedSet();
            this.comprobar_que(!s1.containsAll(s2));
        }
        private void probando_subconjunto_S1yS2_vacio() throws Exception {
            MyLinkedSet<String>s1 = new MyLinkedSet();
            MyLinkedSet<String>s2 = new MyLinkedSet();
            this.comprobar_que(!s1.containsAll(s2));
        }
        private void probando_subconjunto_a_S1_mismo() throws Exception {
            MyLinkedSet<String>s1 = new MyLinkedSet();
            this.cargando(s1);
            this.comprobar_que(s1.containsAll(s1));
        }
    //</editor-fold>
    @Override
    public void test() {
        try {
            this.probando_subconjunto_normal();
            this.probando_subconjunto_S1_vacio();
            this.probando_subconjunto_S2_vacio();
            this.probando_subconjunto_S1yS2_vacio();
            this.probando_subconjunto_a_S1_mismo();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }   
}