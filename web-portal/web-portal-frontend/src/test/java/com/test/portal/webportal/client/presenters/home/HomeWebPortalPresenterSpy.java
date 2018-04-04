package com.test.portal.webportal.client.presenters.home;

import com.progressoft.brix.domino.api.shared.extension.MainContext;

/**
 * HomeWebPortalPresenterSpy.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public class HomeWebPortalPresenterSpy extends HomeWebPortalPresenter {

  private MainContext mainContext;

  @Override
  public void contributeToMainModule(MainContext context) {
    super.contributeToMainModule(context);
    this.mainContext = context;
  }

  public MainContext getMainContext() {
    return mainContext;
  }

  @Override
  protected String getConcrete() {
    return HomeWebPortalPresenter.class.getCanonicalName();
  }
}
