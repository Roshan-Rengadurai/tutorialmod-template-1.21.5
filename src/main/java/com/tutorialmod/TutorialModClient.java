package com.tutorialmod;

import net.fabricmc.api.ClientModInitializer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This is where you can register client-side features, such as rendering and GUI elements.
        // For example, you can register custom item renderers or screen handlers here.
        System.out.println("TutorialMod Client Initialized");
    }

}
