package com.ang.part6.command;

import com.ang.part6.model.CeilingFan;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
