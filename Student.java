package refactor;

public class Student {

    public static class UserInfo {
        int id;
        String name;
        String username;
        String password;
        String capchar;

        public UserInfo(int id, String name, String username, String password, String capchar) {
            this.id = id;
            this.name = name;
            this.username = username;
            this.password = password;
            this.capchar = capchar;
        }
    }

    public void createNewUser(UserInfo userInfo) {
        System.out.println(userInfo.id + " " + userInfo.name);
    }
}
