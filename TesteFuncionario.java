public class TesteFuncionario {
     public static void main(String[] args) {
         

        Funcionario f = new Funcionario();
        
        f.setCargo("Auxiliar administrativo");
        f.setSalario(1.500);

        System.out.println(f.getCargo());
        System.out.println(f.getSalario());
     }


    }
