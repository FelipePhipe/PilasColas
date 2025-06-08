import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Controller.StackG;

public class App {
public static void main(String[] args) {
    StackSorter stackSorter = new StackSorter();
    StackG<Integer> pila = new StackG<>();
    SignValidator signValidator= new SignValidator();

    System.out.println(signValidator.isValid("([]){}"));  
    System.out.println(signValidator.isValid("({)}"));    
    System.out.println(signValidator.isValid("((()))"));  
    System.out.println(signValidator.isValid("(()"));    

    pila.push(5);
    pila.push(1);
    pila.push(4);
    pila.push(2);

    System.out.println("Original:");
    pila.printStack(); 

    stackSorter.ordenarStack(pila);

    System.out.println("----Ordenado----");
    pila.printStack(); 

    }
}
