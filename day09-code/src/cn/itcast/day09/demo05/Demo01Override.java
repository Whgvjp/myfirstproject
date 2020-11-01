package cn.itcast.day09.demo05;

/*
方法覆盖重写的注意事项：
1.必须保证父子类之间方法的名称相同，参数列表也相同。
Override：写在方法前面，用来检测是不是有效的正确覆盖重写。
这个注解就算不写，只要符合重写的规范要求，也是有效的。
写上可以帮忙检测，以防参数不同，等异常状况

2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
java.lang.Object类是所有类的公共最高父类（祖宗类）,java.lang.String就是Object的子类

3.子类方法的权限必须【大于等于】父类的权限修饰符。
小扩展提示：public > protected > (default) > private
default 是指留空

 */
public class Demo01Override {



}
