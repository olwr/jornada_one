package formacao_java.projetos.curso6;

public class TesteWrapper {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); // unboxing
        System.out.println(valor);

        String s1 = args[0];
        String s2 = args[1];

        Integer numero = Integer.valueOf(s1);
        System.out.println(numero);

        int numero2 = Integer.parseInt(s2);
        System.out.println(numero2);
    }
}
