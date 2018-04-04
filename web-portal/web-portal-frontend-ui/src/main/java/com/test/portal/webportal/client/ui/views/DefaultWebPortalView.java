package com.test.portal.webportal.client.ui.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.TimeZone;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.client.views.WebPortalView;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import java.util.Date;

@UiView(presentable = WebPortalPresenter.class)
public class DefaultWebPortalView extends Composite implements WebPortalView {

  private static DefaultWebPortalViewUiBinder ourUiBinder = GWT.create(DefaultWebPortalViewUiBinder.class);
  //  @UiField
  //  DivElement mainDiv;
  //  @UiField
  //  DivElement testDiv;
  @UiField
  MaterialButton btnPushMe;

  private WebPortalUiHandlers uiHandlers;

  public DefaultWebPortalView() {
    initWidget(ourUiBinder.createAndBindUi(this));
    RootPanel.get().add(this);
    //    mainDiv.setInnerHTML("<h1>Hello world!</h1>");
    //    Document.get()
    //        .getBody()
    //        .appendChild(mainDiv);
    //    Document.get()
    //        .getBody()
    //        .appendChild(testDiv);
  }

  @Override
  public void testView(String text) {
    MaterialToast.fireToast(text);
  }

  @UiHandler("btnPushMe")
  void handleClick(ClickEvent event) {
    DateTimeFormat dtf = DateTimeFormat.getFormat("yyyy-MM-dd HH:mm:ss");
    uiHandlers.onTestShow(dtf.format(new Date(), TimeZone.createTimeZone(0)));
  }

  @Override
  public void setUiHandlers(WebPortalUiHandlers uiHandlers) {
    this.uiHandlers = uiHandlers;
  }

  interface DefaultWebPortalViewUiBinder extends UiBinder<MaterialPanel, DefaultWebPortalView> {

  }
}