package com.company.main.java.game.skill;

import java.util.ArrayList;
import java.util.List;

public class WarriorsSkillList {
    private BuffAttack buffAttack = new BuffAttack();
    private HolyAttack holyAttack = new HolyAttack();
    public List<Skill> skillList = new ArrayList<>();

    public List<Skill> getAvailableSkillList(int level) {
        if (!skillList.contains(buffAttack) && level > 2) {
            skillList.add(buffAttack);
        }
        if (!skillList.contains(holyAttack) && level > 3) {
            skillList.add(holyAttack);
        }
        return skillList;
    }

}
