package com.test.portal.webportal.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.client.views.WebPortalView;

@UiView(presentable = WebPortalPresenter.class)
public class DefaultWebPortalView extends Composite implements WebPortalView {

  private static DefaultWebPortalViewUiBinder ourUiBinder = GWT.create(DefaultWebPortalViewUiBinder.class);
  @UiField
  DivElement mainDiv;

  public DefaultWebPortalView() {
    initWidget(ourUiBinder.createAndBindUi(this));
    mainDiv.setInnerHTML("<h1>Hello world!</h1>");
    Document.get()
        .getBody()
        .getStyle()
        .setBackgroundColor(Bundle.INSTANCE.style()
            .webPortal());
    Document.get()
        .getBody()
        .appendChild(mainDiv);
  }

  interface DefaultWebPortalViewUiBinder extends UiBinder<HTMLPanel, DefaultWebPortalView> {

  }
}