package Controller;

public class MDC {

    // Construtor
    public MDC() {
        super();
    }

    public int mdc(int x, int y) {

        /*
         * Quando os dois números forem iguais,
         * o MDC é o próprio número.
         */
        if (x == y) {
            return x;
        }

        /*
         * Se x > y → MDC(x - y, y)
         * Se y > x → MDC(y, x)
         */
        if (x > y) {
            return mdc(x - y, y);
        } else {
            return mdc(y, x);
        }
    }
}