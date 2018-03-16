package com.test.portal.webportal.client.presenters;

import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.test.portal.webportal.client.views.WebPortalView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class DefaultWebPortalPresenter extends BaseClientPresenter<WebPortalView> implements WebPortalPresenter {

  private static final Logger LOGGER = LoggerFactory.getLogger(DefaultWebPortalPresenter.class);

  @Override
  public void contributeToMainModule(MainContext context) {
    LOGGER.info("Main context received at presenter " + DefaultWebPortalPresenter.class.getSimpleName());
  }
}