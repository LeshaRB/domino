package com.test.portal.webportal.client.presenters.home;

import com.test.portal.webportal.shared.extension.WebPortalContext;

/**
 * HomeWebPortalPresenterSpy.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public class HomeWebPortalPresenterSpy extends HomeWebPortalPresenter {

  private WebPortalContext webPortalContext;

  @Override
  public void contributeToMainModule(WebPortalContext context) {
    super.contributeToMainModule(context);
    this.webPortalContext = context;
  }

  public WebPortalContext getWebPortalContext() {
    return webPortalContext;
  }

  @Override
  protected String getConcrete() {
    return HomeWebPortalPresenter.class.getCanonicalName();
  }
}
