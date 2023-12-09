public class Main {
    public static void main(String[] args) {
        ArithmeticExpression expression = new ModuloExpression(
                new SumExpression(
                        new NumberExpression(3),
                        new ProductExpression(
                                new NumberExpression(2),
                                new NumberExpression(5)
                        )
                ),
                new NumberExpression(4)
        );

        System.out.println(expression.getStringRepresentation());
        System.out.println(ArithmeticOperator.evaluate(expression));
    }
}
