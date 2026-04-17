public static void main(String args[]) {

    int a = 20, b = 7;
    char chr = '+';
    int result = 0;

    switch (chr) {
        case '+':
            result = a + b;
            break;
        case '-':
            result = a - b;
            break;
        case '*':
            result = a * b;
            break;
        case '/':
            result = a / b;
            break;
        default:
            result = -1;
    }

    System.out.println(result);
}