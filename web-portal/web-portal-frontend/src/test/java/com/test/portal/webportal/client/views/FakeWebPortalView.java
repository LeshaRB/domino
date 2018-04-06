package com.test.portal.webportal.client.views;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalLoadingContent;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalMainContent;

@UiView(presentable = WebPortalPresenter.class)
public class FakeWebPortalView implements WebPortalView {

  @Override
  public void testView(String text) {

  }

  @Override public void setContentMain(WebPortalMainContent content) {

  }

  @Override public void setContentLoading(WebPortalLoadingContent content) {

  }

  @Override
  public void setUiHandlers(WebPortalUiHandlers uiHandlers) {

  }
}
