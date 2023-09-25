package formacao_java.projetos.curso6;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
        public static void main(String[] args) {

                Integer idadeRef = Integer.valueOf(29); // autoboxing
                System.out.println(idadeRef.intValue()); // unboxing

                Double dRef = Double.valueOf(3.2);// autoboxing
                System.out.println(dRef.doubleValue());// unboxing

                Boolean bRef = Boolean.FALSE;
                System.out.println(bRef.booleanValue());

                Number numero = Integer.valueOf(15);
                System.out.println(numero);

                List<Number> lista = new ArrayList<>();
                lista.add(10);
                lista.add(32.6);
                lista.add(25.6f);
        }
}
