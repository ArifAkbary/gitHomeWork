package steps;

import pages.DashbordPage;
import pages.LoginPage;
import pages.addEmployeePage;

public class pageInitilize {
    public static LoginPage login;
    public static DashbordPage dash;

    public static addEmployeePage addEmplyee;

    public static void initializePageObjects(){
        login = new LoginPage();
        dash=new DashbordPage();
        addEmplyee=new addEmployeePage();


    }


}
