package cn.xdl.test;


import cn.xdl.bean.User;
import cn.xdl.view.ClientView;
import org.junit.Test;

public class ViewTest {

    @Test
    public void welcomeTest() throws Exception {
        User u = ClientView.welcomeView();
        System.out.println(u);
    }

    @Test
    public void studentMenuTest() throws Exception {
        int type = ClientView.studentMenuView();
        System.out.println(type);
    }

    @Test
    public void managerMenuTest() throws Exception {
        int type = ClientView.managerMenuView();
        System.out.println(type);
    }


}
