package com.test.portal.webportal.client.presenters;

import org.dominokit.domino.api.shared.extension.MainContext;
import com.test.portal.webportal.client.presenters.DefaultWebPortalPresenter;

public class WebPortalPresenterSpy extends DefaultWebPortalPresenter {

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
    return DefaultWebPortalPresenter.class.getCanonicalName();
  }
}
