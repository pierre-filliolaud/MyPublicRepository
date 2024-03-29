package com.my.gae.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.place.AbstractProxyListView;
import java.util.HashSet;
import java.util.Set;

public class PersonListView extends PersonListView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static com.my.gae.client.managed.ui.PersonListView instance;

    @UiField
    Button newButton;

    public PersonListView() {
        init(BINDER.createAndBindUi(this), table, newButton);
        table.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.DISABLED);
        init();
    }

    public static com.my.gae.client.managed.ui.PersonListView instance() {
        if (instance == null) {
            instance = new PersonListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    interface Binder extends UiBinder<HTMLPanel, PersonListView> {
    }
}
