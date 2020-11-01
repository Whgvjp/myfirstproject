package cn.itcast.day11.demo07;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        // 设置英雄技能
        //hero.setSkill(new SkillImpl()); // 使用单独定义的实现类
        /*Skill skill = new Skill(){
          @Override
          public void use(){
              System.out.println("Pia~pia~pia~");
          }
        };*/

        hero.setSkill(new Skill(){
            @Override
            public void use(){
                System.out.println("Biu~pia~biu~pia");
            }

        });
        hero.attack();

    }

}
