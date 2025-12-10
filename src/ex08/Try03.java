package ex08;

// 잘못된 처리를 하는 곳
class Controller {
    static void login(String username, String passward) {
        Service.loginporocess(username, passward);
    }
}

class Service {
    static void loginporocess(String username, String passward) {
        if (username.length() < 5) {
            throw new RuntimeException("유저길이가 짧아요");
        }

        if (!passward.equals("1234")) {
            throw new RuntimeException("패스워드가 틀렸어요");
        }
    }
}

public class Try03 {
    public static void main(String[] args) {
        try {
            Controller.login("ssar", "1234");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
