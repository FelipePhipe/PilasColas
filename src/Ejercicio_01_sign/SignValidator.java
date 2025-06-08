package Ejercicio_01_sign;

import Materia.Controller.StackG;

public class SignValidator {
    public boolean isValid(String s) {
        StackG<Character> pila = new StackG<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                    pila.push(c);
                } else {
                    if (pila.isEmpty()) return false;
    
                    char tope = pila.pop();
                    if ((c == ')' && tope != '(') ||
                        (c == '}' && tope != '{') ||
                        (c == ']' && tope != '[')) {
                        return false;
                    }
                }
            }
    
            return pila.isEmpty();
        }
    }
    

