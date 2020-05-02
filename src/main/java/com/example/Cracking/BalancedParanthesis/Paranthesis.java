package com.example.Cracking.BalancedParanthesis;

import java.util.Stack;

public class Paranthesis {

    public static String isBalanced(String data) throws Exception {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < data.length(); i++) {

            Character c = data.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                characterStack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (characterStack.isEmpty()) {
                    return "Unbalanced";
                } else {
                    if (arePairs(characterStack.peek(), c)) {
                        characterStack.pop();
                    } else {
                        return "Unbalanced";
                    }
                }
            } else {
                throw new Exception("Characters are not all paranthesis");
            }
        }
        return characterStack.isEmpty() ? "Balanced" : "Unbalanced";
    }

    public static boolean arePairs(Character open, Character close){
        switch (open) {
            case '(':
                return close == ')';
            case '{':
                return close == '}';
            case '[':
                return close == ']';
            default: return false;
        }
    }
}
