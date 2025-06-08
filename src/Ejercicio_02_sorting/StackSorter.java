package Ejercicio_02_sorting;

import Materia.Controller.StackG;

public class StackSorter {

    public void ordenarStack(StackG<Integer> original) {
        StackG<Integer> auxiliar = new StackG<>();

        while (!original.isEmpty()) {
            int temp = original.pop();

            
            while (!auxiliar.isEmpty() && auxiliar.peek() > temp) {
                original.push(auxiliar.pop());
            }

            auxiliar.push(temp);
        }

        
        while (!auxiliar.isEmpty()) {
            original.push(auxiliar.pop());
        }
    }

    
}

