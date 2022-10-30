class Debug {
    public static void main(String[] args) {
        if(evaluateLeft() || evaluateRight()) {
            System.out.println("At least one was true");
        }
        if(evaluateLeft() && evaluateRight()) {
            System.out.println("Both were true");
        }
    }
    static boolean evaluateLeft() {
        System.out.println("Now evaluating left-hand expression");
        return true;
    }

    static boolean evaluateRight() {
        System.out.println("Now evaluating right-hand expression");
        return false;
    }
}
