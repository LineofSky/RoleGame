package com.company.main.java.game.skill;

import java.util.ArrayList;
import java.util.List;

public class WarriorsSkillList {
    private BuffAttack buffAttack = new BuffAttack();
    private HolyAttack holyAttack = new HolyAttack();
    public List<String> skillList = new ArrayList<>();

    public List<String> getAvailableSkillList(int level) {
        if (!skillList.contains(buffAttack.getName()) && level > 2) {
            skillList.add(buffAttack.getName());
        }
        if (!skillList.contains(holyAttack.getName()) && level > 3) {
            skillList.add(holyAttack.getName());
        }
        return skillList;
    }

}
