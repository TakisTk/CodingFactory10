package gr.aueb.cf.ch17.enums;

public class Main {
    static void main() {
        UserRole userRole = UserRole.ADMIN;

        String userRoleStr = userRole.name();  //ADMIN
        UserRole userRole2 = UserRole.valueOf("ADMIN");

        for (UserRole role : UserRole.values()) {
            System.out.println(role.ordinal() + ": " + role.name());
        }
    }
}
