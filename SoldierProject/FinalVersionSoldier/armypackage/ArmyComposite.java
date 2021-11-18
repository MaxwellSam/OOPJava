package armypackage;
import java.util.ArrayList;
import java.util.List;

import visitorpackage.*;
import soldierpackage.SuperSoldierInterface;

public class ArmyComposite implements SuperSoldierInterface {
    private List<SuperSoldierInterface> army;

    public ArmyComposite(){
        army = new ArrayList<SuperSoldierInterface>();
    }

    @Override
    public int hit() {
        int totalForce = 0;
        for (int i = 0; i < army.size(); i++){
            totalForce += army.get(i).hit();
        }
        return totalForce;
    }

    @Override
    public boolean ward_off(int force) {
        force = force / army.size();
        int cnt = 0; // to count the number of element which died 
        int sizeInit = army.size();
        for (int i = 0; i < army.size(); i++){
            if (!army.get(i).ward_off(force)){
                army.remove(i);
                cnt ++;
            }
        }
        return cnt != sizeInit;
    }

    @Override
    public int getLife() {
        int lifeArmy = 0;
        for (int i = 0; i < army.size(); i++){
            lifeArmy += army.get(i).getLife();
        }
        return lifeArmy;
    }
    

    @Override
    public void addSword(int life) {
        for (int i = 0; i < army.size(); i++){
            army.get(i).addSword(life);
        }
    }

    @Override
    public void addShield(int life) {
        for (int i = 0; i < army.size(); i++){
            army.get(i).addShield(life);
        } 
    }

    public void addElement(SuperSoldierInterface element){
        army.add(element);
    }

    public void removeElement(SuperSoldierInterface element){
        army.remove(element);
    }

    public List<SuperSoldierInterface> getArmy(){
        return new ArrayList<SuperSoldierInterface>(this.army);
    }

    public void accept(InterfaceVisitor visitor){
        visitor.visit(this);
    }
}
