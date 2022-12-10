/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class JumpingZombie extends Zombie {
    
    public JumpingZombie(int health, int level){
        super.health=health;
        super.level=level;
    }
    @Override
    public void heal(){
      switch(super.level)  {
          case 1:
              health += health * 30/100;
              break;
          case 2:
              health += health * 40/ 100;
              break;
          case 3:
              health = health * 50/100;
              break;
          default:
              System.out.println("Level Error");
              break;
                      
      }
    }
    @Override
    public void destroyed(){
        super.health -= (super.health*10/100);
    }
    @Override
    public String getZombieInfo(){
        return "Jumping Zombie Data =\nHealth = " + health + "\nLevel = " + level + "\n";
    }
}
