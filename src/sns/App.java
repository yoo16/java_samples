package sns;

import sns.entity.UserBean;

public class App {

	public static void main(String[] args) {
		UserBean user = new UserBean();
//        user.name = "東京　太郎";
        user.email = "test@example.com";
//        user.password = "pass12345";

        user.setName("東京　太郎");
        user.setEmail("test@example.com");
        user.setPassword("pass12345");
        
//        System.out.println(user.name);
//        System.out.println(user.email);
//        System.out.println(user.password);

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
	}

}
