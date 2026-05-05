package com.chechire.boomsday;

import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import org.jetbrains.annotations.NotNull;

public class TestCommand extends CommandBase {
    public TestCommand(String name) {
        super("lol", "description");
    }

    @Override
    protected void executeSync(@NotNull CommandContext commandContext) {

    }
}
