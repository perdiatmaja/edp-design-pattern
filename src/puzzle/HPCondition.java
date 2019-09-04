package puzzle;

import base.Condition;

public class HPCondition extends Condition {

    public HPCondition(PotionBehaviour potionBehaviour){
        this.potionBehaviour = potionBehaviour;
    }

    @Override
    public void low() {
        potionBehaviour.usePotion();
    }
}