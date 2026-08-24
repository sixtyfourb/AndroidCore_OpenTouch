package com.opentouchgaming.androidcore;

import android.app.Activity;

/**
 * In-game engine options dialog, shown over the running game in the :game process.
 * Implementations are named in RunInfo.inGameOptionsClass and instantiated by reflection,
 * so they need a public no-arg constructor.
 */
public interface InGameOptionsInterface
{
    interface CommandSender
    {
        void send(String command);
    }

    /** Show the dialog; send console commands through sender when it is dismissed. */
    void showDialog(Activity activity, CommandSender sender);
}
