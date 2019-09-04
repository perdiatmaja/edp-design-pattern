package puzzle;

import base.Condition;

public class MPCondition extends Condition {
    public MPCondition(PotionBehaviour potionBehaviour){
        this.potionBehaviour = potionBehaviour;
    }

    @Override
    public void low() {
        potionBehaviour.usePotion();
    }
}