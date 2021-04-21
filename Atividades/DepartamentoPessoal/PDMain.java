package DepartamentoPessoal;
import java.util.Scanner;
/**
 * @author Matheus Santana
 */
public class PDMain {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- PROGRAMA DE CADASTRO DE EMPRESA ---");
        
        System.out.println("QUAL É O NOME DA EMPRESA?");
        String nome = entrada.nextLine();
        
        Empresa emp = new Empresa(nome, Math.random(), 2021);
        PDMain.abrirMenuInicial(entrada, emp);
    }
    
    private static void abrirMenuInicial(Scanner entrada, Empresa emp) {
        String opcao = "x";
        while (!opcao.equals("4")) {
            System.out.println("\nO QUE DESEJA FAZER?\n"
                    + "1) CONSULTAR DADOS DA EMPRESA\n"
                    + "2) CADASTRAR DEPARTAMENTO\n"
                    + "3) CADASTRAR FUNCIONÁRIO\n"
                    + "4) SAIR");
            opcao = entrada.nextLine();
            
            if (opcao.equals("1")) {
                System.out.println("DADOS DA EMPRESA");
                System.out.print(emp.getDados());
                
            } else if (opcao.equals("2")) {
                System.out.println("QUAL É O NOME DO DEPARTAMENTO?");
                String nomeDep = entrada.nextLine();
                emp.criarDepartamento(new Departamento(nomeDep));
                
            } else if (opcao.equals("3")) {
                PDMain.cadastrarFuncionario(entrada, emp);
            }
            
        }
    }
    
    private static void cadastrarFuncionario(Scanner entrada, Empresa emp) {
        System.out.println("QUAL É O NOME DO FUNCIONÁRIO?");
        String nomeFunc = entrada.nextLine();
        
        System.out.println("QUAL É O CARGO?");
        String cargo = entrada.nextLine();
        
        Funcionario func = new Funcionario(nomeFunc, cargo);
        
        System.out.println("QUAL É O DEPARTAMENTO?");
        System.out.print(emp.getListaDepartamentos());
        int dep = entrada.nextInt();
        emp.buscarDepartamento(dep).incluirFuncionario(func);
        entrada.nextLine();
    }
}
