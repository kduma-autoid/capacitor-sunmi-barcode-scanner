package dev.duma.android.sunmi.scantriggercontrol;

import android.content.Context;
import android.content.Intent;

public class TriggerControlHelper implements ITriggerControlHelper {
    private final Context context;

    public TriggerControlHelper(Context context) {
        this.context = context;
    }

    @Override
    public void enable() {
        setTrigger(true);
    }

    @Override
    public void disable() {
        setTrigger(false);
    }

    protected void setTrigger(boolean enabled) {
        Intent intent = new Intent();
        intent.setAction("com.sunmi.scanner.ACTION_TRIGGER_CONTROL");
        intent.putExtra("enable", enabled);
        context.sendBroadcast(intent);
    }
}
