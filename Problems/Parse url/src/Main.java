import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        int searchIndex = url.indexOf('?');
        if (searchIndex > -1) {
            String search = url.substring(searchIndex + 1);
            String[] parameters = search.split("&");
            String password = null;
            for (String parameter : parameters) {
                String[] param = parameter.split("=");
                String paramName = param[0];
                String paramValue = param.length > 1 ? param[1] : "not found";
                if ("pass".equals(paramName)) {
                    password = paramValue;
                }
                System.out.println(paramName + " : " + paramValue);
            }
            if (password != null) {
                System.out.print("password : " + password);
            }
        }
    }
}