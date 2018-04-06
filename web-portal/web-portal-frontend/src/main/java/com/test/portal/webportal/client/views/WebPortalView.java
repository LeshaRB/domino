package com.test.portal.webportal.client.views;

import com.progressoft.brix.domino.api.client.mvp.view.HasUiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.UiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.test.portal.webportal.client.views.WebPortalView.WebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext;

public interface WebPortalView extends View, HasUiHandlers<WebPortalUiHandlers> {

  void testView(String text);

  void setContentMain(WebPortalContext.WebPortalMainContent content);

  void setContentLoading(WebPortalContext.WebPortalLoadingContent content);

  interface WebPortalUiHandlers extends UiHandlers {

    void onTestShow(String text);

    void onLoading(boolean show);
  }
}