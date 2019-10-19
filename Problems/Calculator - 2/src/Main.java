class Problem {
    public static void main(String[] args) {
        assert args.length > 1;
        String operation = args[0];
        switch (operation) {
            case "MAX":
                int max = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    int number = Integer.parseInt(args[i]);
                    if (number > max) {
                        max = number;
                    }
                }
                System.out.println(max);
                break;
            case "MIN":
                int min = Integer.parseInt(args[1]);
                for (int i = 1; i < args.length; i++) {
                    int number = Integer.parseInt(args[i]);
                    if (number < min) {
                        min = number;
                    }
                }
                System.out.println(min);
                break;
            case "SUM":
                int sum = 0;
                for (int i = 1; i < args.length; i++) {
                    int number = Integer.parseInt(args[i]);
                    sum += number;
                }
                System.out.println(sum);
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }
}