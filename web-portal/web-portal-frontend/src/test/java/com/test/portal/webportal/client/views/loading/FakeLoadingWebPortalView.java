package com.test.portal.webportal.client.views.loading;

import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.loading.ILoadingWebPortalPresenter;
import com.test.portal.webportal.shared.extension.WebPortalContext.WebPortalLoadingContent;

/**
 * FakeLoadingWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
@UiView(presentable = ILoadingWebPortalPresenter.class)
public class FakeLoadingWebPortalView implements ILoadingWebPortalView {

  @Override
  public WebPortalLoadingContent getContent() {
    return null;
  }

  @Override
  public void setUiHandlers(LoadingWebPortalUiHandlers uiHandlers) {

  }
}
