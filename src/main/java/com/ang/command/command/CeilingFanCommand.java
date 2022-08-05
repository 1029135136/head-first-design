package com.ang.command.command;

import com.ang.command.model.CeilingFan;

import static com.ang.command.model.CeilingFan.HIGH;
import static com.ang.command.model.CeilingFan.LOW;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public abstract class CeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;

    /**
     * 记录前一个速度
     */
    protected int preSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        /**
         * 默认为OFF
         */
        preSpeed = CeilingFan.OFF;
    }

    @Override
    public abstract void execute();

    @Override
    public void undo() {
        switch (preSpeed) {
            case HIGH:
                ceilingFan.high();
                break;
            case LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
        }
    }
}
