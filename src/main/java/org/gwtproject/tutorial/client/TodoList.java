package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

public class TodoList implements EntryPoint {

    public void onModuleLoad() {
        // We have to load icon sets before run application
        Polymer.importHref("iron-icons/iron-icons.html", new Function() {
            public Object call(Object arg) {
                // The app is executed when all imports succeed.
                startApplication();
                return null;
            }
        });
    }

    private void startApplication() {
        RootPanel.get().add(new Main());
    }
}