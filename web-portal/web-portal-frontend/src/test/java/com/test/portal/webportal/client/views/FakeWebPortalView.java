package com.test.portal.webportal.client.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;

@UiView(presentable = WebPortalPresenter.class)
public class FakeWebPortalView implements WebPortalView {

  @Override
  public void testView(String text) {

  }

  @Override
  public void setUiHandlers(WebPortalUiHandlers uiHandlers) {

  }
}
