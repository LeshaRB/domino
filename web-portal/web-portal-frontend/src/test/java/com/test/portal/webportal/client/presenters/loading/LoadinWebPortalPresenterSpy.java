package com.test.portal.webportal.client.presenters.loading;

import com.test.portal.webportal.shared.extension.WebPortalContext;

/**
 * LoadinWebPortalPresenterSpy.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
public class LoadinWebPortalPresenterSpy extends LoadingWebPortalPresenter {

  private WebPortalContext webPortalContext;

  @Override
  public void contributeToLoadingModule(WebPortalContext context) {
    super.contributeToLoadingModule(context);
    this.webPortalContext = context;
  }

  public WebPortalContext getWebPortalContext() {
    return webPortalContext;
  }

  @Override
  protected String getConcrete() {
    return LoadingWebPortalPresenter.class.getCanonicalName();
  }
}
