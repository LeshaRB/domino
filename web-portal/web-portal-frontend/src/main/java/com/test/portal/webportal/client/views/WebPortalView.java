package com.test.portal.webportal.client.views;

import com.progressoft.brix.domino.api.client.mvp.view.HasUiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.UiHandlers;
import com.progressoft.brix.domino.api.client.mvp.view.View;
import com.test.portal.webportal.client.views.WebPortalView.WebPortalUiHandlers;

public interface WebPortalView extends View, HasUiHandlers<WebPortalUiHandlers> {

  void testView(String text);

  interface WebPortalUiHandlers extends UiHandlers {

    void onTestShow(String text);
  }
}