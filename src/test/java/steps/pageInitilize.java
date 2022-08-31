package steps;

import pages.LoginPage;

public class pageInitilize {
    public static LoginPage login;

    public static void initializePageObjects(){
        login = new LoginPage();

    }


}
