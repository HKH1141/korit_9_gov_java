package com.korit.study.ch23;

import java.util.ArrayList;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}

public class WildCardMain {
    public static void main(String[] args) {
        WildCardMain main = new WildCardMain();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준삼");
//        names.add("김준이");
//        main.printAll2(names);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "1235"));
        users.add(new User("test3", "1233"));
        main.printAll(users);

        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));

        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("gold1", "1234"));
        goldUsers.add(new GoldUser("gold2", "5678"));
        goldUsers.add(new GoldUser("gold3", "1111"));
    }

    public void printAll(ArrayList<? extends User> list) {
        for (User s : list) {
            System.out.println(s);
        }
    }

    /**
     * 와일드카드 >>> '?' 기호
     * 어떤 타입인지 알 수 없다. 즉, 모든 타입을 유추하여 받을 수 있는 방법
     * 상한 경계 와일드카드: extends >>> extends User
     * 최대 업캐스팅 가능한 범위를 User로 하겠다. 즉, 상한선을 정하겠다라는 의미
     * 하한 경계 와일드카드: super >>> ? super GoldUser
     * 해당 객체 부터 상위로 모든 범위를 지정하겠다.즉, Object부터 GoldUser객체까지 하한선을 정하겠다는 의미
     */

    public void printAll2(ArrayList<? super GoldUser> list) {
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
