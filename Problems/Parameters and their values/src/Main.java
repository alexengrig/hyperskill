class Problem {
    public static void main(String[] args) {
        assert args.length % 2 == 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "=" + args[++i]);
        }
    }
}