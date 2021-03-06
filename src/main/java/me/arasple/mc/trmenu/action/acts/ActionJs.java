package me.arasple.mc.trmenu.action.acts;

import me.arasple.mc.trmenu.action.base.AbstractAction;
import me.arasple.mc.trmenu.utils.JavaScript;
import org.bukkit.entity.Player;

/**
 * @author Arasple
 * @date 2019/12/28 18:49
 */
public class ActionJs extends AbstractAction {

    @Override
    public String getName() {
        return "js|javascript";
    }

    @Override
    public void onExecute(Player player) {
        JavaScript.run(player, getContent());
    }

}
