package nyc.c4q.m47bell;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by c4q-marbella on 10/25/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class ExpressionTree {

    static String expression = "a b + c d e + * *";

    public static void main(String[] args) {
        Scanner input = new Scanner(expression);
        Stack<Node> stack = new Stack<>();

        while (input.hasNext()) {
            String symbol = input.next();
            Node node = new Node(symbol);

            if (isOperator(symbol)) {
                node.left = stack.pop();
                node.right = stack.pop();

            }
            stack.push(node);
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("invalid stack");
        }

        Node expressionTreeRoot = stack.pop();

    }

    private static boolean isOperator(String symbol) {
        return "+-*/".contains(symbol);
    }

}

class Node {

    Node left;
    Node right;
    String symbol;

    public Node(String s) {
        this.symbol = s;
    }

}