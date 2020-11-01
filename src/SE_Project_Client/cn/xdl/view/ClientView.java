package cn.xdl.view;

import cn.xdl.bean.User;

import java.util.Scanner;

/**
 * 负责打印视图给用户看，负责接受用户输入的内容，返回给调用者
 * 所有的接收客户端输入的操作，一定使用nextLine();
 * @author  whgvjp
 */
public class ClientView {

    /**
     * 用来接受用户输入的Scanner对象
     */
    private static Scanner input = new Scanner(System.in);


    /**
     * 欢迎视图
     */
    public static User welcomeView(){
        System.out.println("****************************************************");
        System.out.println("********\t\t欢迎来到在线考试系统\t\t********");
        System.out.println("********\t\t请根据提示 进行操作\t\t\t********");
        System.out.println("********\t\t请先登陆：\t\t\t\t\t********");
        System.out.println("********\t\t请输入账号：\t\t\t\t********");
        String uname = input.nextLine();
        System.out.println("*****\t\t请输入密码：\t\t\t\t*****");
        String upass = input.nextLine();
        return new User(uname,upass);
    }

    /**
     * 学生登录成功后，展示的视图
     * @return 学生选择的菜单：<br>
     *     0：退出 <br>
     *     1：修改密码<br>
     *     2：开始考试<br>
     *     3：查询历史成绩<br>
     *     4：导出所有成绩
     */
    public static int studentMenuView(){
        System.out.println("****************************************************");
        System.out.println("********\t\t欢迎登录学员考试系统\t\t********");
        System.out.println("********\t\t请根据提示 进行操作\t\t\t********");
        System.out.println("********\t\t0.退出\t\t\t\t\t\t********");
        System.out.println("********\t\t1.修改密码\t\t\t\t\t********");
        System.out.println("********\t\t2.开始考试\t\t\t\t\t********");
        System.out.println("********\t\t3.查询历史成绩\t\t\t\t********");
        System.out.println("********\t\t4.导出所有成绩\t\t\t\t********");
        String text = input.nextLine();
        int type = -1;
        try{
            type = Integer.parseInt(text);
        }catch (NumberFormatException e){
            //用户输入的数字有问题，则不进行赋值，采用默认值 -1
        }
        if(type<0||type>4){
            //用户输入的菜单存在问题，请用户重新输入
            System.out.println("********\t\t输入错误，请重新输入\t\t\t\t\t********");
            return studentMenuView();
        }
        return type;
    }

    /**
     * 管理员菜单视图
     * @return 用户选择的内容
     * 0：退出<br>
     * 1：增加考试学员<br>
     * 2：删除考试学员<br>
     * 3：修改考试学员<br>
     * 4：查询考试学员<br>
     * 5：增加考试试题<br>
     * 6：删除考试试题<br>
     * 7：修改考试试题<br>
     * 8：查询考试试题<br>
     * 9：批量导入试题
     */
    public static int managerMenuView(){
        System.out.println("****************************************************");
        System.out.println("********\t\t欢迎大佬来到本系统\t\t\t********");
        System.out.println("********\t\t请根据提示 进行操作\t\t\t********");
        System.out.println("********\t\t0.退出\t\t\t\t\t\t********");
        System.out.println("********\t\t1.增加考试学员\t\t\t\t********");
        System.out.println("********\t\t2.删除考试学员\t\t\t\t********");
        System.out.println("********\t\t3.修改考试学员\t\t\t\t********");
        System.out.println("********\t\t4.查询考试学员\t\t\t\t********");
        System.out.println("********\t\t5.增加考试试题\t\t\t\t********");
        System.out.println("********\t\t6.删除考试试题\t\t\t\t********");
        System.out.println("********\t\t7.修改考试试题\t\t\t\t********");
        System.out.println("********\t\t8.查询考试试题\t\t\t\t********");
        System.out.println("********\t\t9.批量导入试题\t\t\t\t********");
        String text = input.nextLine();
        int type = -1;
        try{
            type = Integer.parseInt(text);
        }catch (NumberFormatException e){
            //用户输入的数字有问题，则不进行赋值，采用默认值 -1
        }
        if(type<0||type>9){
            //用户输入的菜单存在问题，请用户重新输入
            System.out.println("********\t\t输入错误，请重新输入\t\t\t\t\t********");
            return managerMenuView();
        }
        return type;
    }

    /**
     *  添加学员的视图
     * @return
     */
    public static User addUserView(){
        System.out.println("****************************************************");
        System.out.println("********\t\t请根据提示 进行操作\t\t\t********");
        System.out.println("********\t\t请输入新学员的账号\t\t\t\t********");
        String uname = input.nextLine();
        System.out.println("********\t\t请输入新学员的密码\t\t\t\t********");
        String upass = input.nextLine();
        return new User(uname, upass);
    }

    /**
     *  删除学员的视图
     * @return
     */
    public static String deleteUserView(){
        System.out.println("****************************************************");
        System.out.println("********\t\t请根据提示 进行操作\t\t\t********");
        System.out.println("********\t\t请输入要删除的账号\t\t\t\t********");
        String uname = input.nextLine();
        return uname;
    }

}
