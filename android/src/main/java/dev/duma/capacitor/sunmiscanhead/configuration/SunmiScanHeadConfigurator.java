package dev.duma.capacitor.sunmiscanhead.configuration;


import dev.duma.android.sunmi.scanconfigurationhelper.IConfigurationWriteContextHelper;

public class SunmiScanHeadConfigurator {
    private final IConfigurationWriteContextHelper configurationWriteContextHelper;

    public SunmiScanHeadConfigurator(IConfigurationWriteContextHelper configurationWriteContextHelper) {
        this.configurationWriteContextHelper = configurationWriteContextHelper;
    }

    public ScanModeConfigurator scanMode() {
        return new ScanModeConfigurator(configurationWriteContextHelper);
    }

    public DataOutputModeConfigurator dataOutputMode() {
        return new DataOutputModeConfigurator(configurationWriteContextHelper);
    }

    public BroadcastingConfigurator broadcasting() {
        return new BroadcastingConfigurator(configurationWriteContextHelper);
    }

    public CodeTypeConfigurator codeType() {
        return new CodeTypeConfigurator(configurationWriteContextHelper);
    }

    public PromptSettingsConfigurator promptSettings() {
        return new PromptSettingsConfigurator(configurationWriteContextHelper);
    }

    public AdvancedFormatConfigurator advancedFormat() {
        return new AdvancedFormatConfigurator(configurationWriteContextHelper);
    }







}
