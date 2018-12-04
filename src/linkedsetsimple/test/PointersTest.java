package linkedsetsimple.test;
import linkedsetsimple.structs.MyLinkedSet;
public class PointersTest extends Test
{
    MyLinkedSet<String> set;
    public PointersTest() {
        set = new MyLinkedSet();        
    }
    //<editor-fold desc="relleno de datos">
        private void cargando(){
            set.clear();
            set.add("Deborah");
            set.add("Tommy");
            set.add("Franco");
            set.add("Manuela");
            set.add("Miguel");
            set.add("Denisse");
        }
    //</editor-fold>
    //<editor-fold desc="pruebas">
        private void probando_punteros_nulos() throws Exception {
            set.clear();
            comprobar_que(set.first() == null && set.last() == null);
        }
        private void probando_punteros_normales() throws Exception {
            this.cargando();
            comprobar_que(set.first().equalsIgnoreCase("Deborah") && set.last().equalsIgnoreCase("Denisse"));
        }
        private void probando_punteros_borrados_facil() throws Exception {
            this.cargando();
            comprobar_que(set.first().equalsIgnoreCase("Deborah") && set.last().equalsIgnoreCase("Denisse"));
            set.remove("Deborah");
            set.remove("Denisse");
            comprobar_que(!set.first().equalsIgnoreCase("Deborah") && !set.last().equalsIgnoreCase("Denisse"));
        }
        private void probando_punteros_borrados_pares() throws Exception {
            this.cargando();
            comprobar_que(set.first().equalsIgnoreCase("Deborah") && set.last().equalsIgnoreCase("Denisse"));
            set.remove("Tommy");
            set.remove("Manuela");
            set.remove("Denisse");
            comprobar_que(set.first().equalsIgnoreCase("Deborah") && set.last().equalsIgnoreCase("Miguel"));
        }
        private void probando_punteros_borrados_impares() throws Exception {
            this.cargando();
            comprobar_que(set.first().equalsIgnoreCase("Deborah") && set.last().equalsIgnoreCase("Denisse"));
            set.remove("Deborah");
            set.remove("Franco");
            set.remove("Miguel");
            comprobar_que(!set.first().equalsIgnoreCase("Deborah") && !set.first().equalsIgnoreCase("Miguel"));
        }
    //</editor-fold>
    @Override
    public void test() {
        try {
           probando_punteros_nulos();
           probando_punteros_normales();
           probando_punteros_borrados_facil();
           probando_punteros_borrados_pares();
           probando_punteros_borrados_impares();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }    
}