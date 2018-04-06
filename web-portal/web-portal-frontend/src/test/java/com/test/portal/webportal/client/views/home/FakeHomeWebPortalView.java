package com.test.portal.webportal.client.views.home;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.home.IHomeWebPortalPresenter;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalMainContent;

/**
 * FakeHomeWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
@UiView(presentable = IHomeWebPortalPresenter.class)
public class FakeHomeWebPortalView implements IHomeWebPortalView {

  @Override
  public void setUiHandlers(HomeWebPortalUiHandlers uiHandlers) {

  }

  @Override
  public WebPortalMainContent getContent() {
    return null;
  }
}
