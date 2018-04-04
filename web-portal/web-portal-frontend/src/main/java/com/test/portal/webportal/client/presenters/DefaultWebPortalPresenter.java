package com.test.portal.webportal.client.presenters;

import com.progressoft.brix.domino.api.client.annotations.Presenter;
import com.progressoft.brix.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.test.portal.webportal.client.views.WebPortalView;
import com.test.portal.webportal.client.views.WebPortalView.WebPortalUiHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class DefaultWebPortalPresenter extends BaseClientPresenter<WebPortalView> implements WebPortalPresenter,
    WebPortalUiHandlers {

  private static final Logger LOGGER = LoggerFactory.getLogger(DefaultWebPortalPresenter.class);

  @Override
  public void contributeToMainModule(MainContext context) {
    LOGGER.info("Main context received at presenter " + DefaultWebPortalPresenter.class.getSimpleName());
  }

  @Override
  public void onTestShow(String text) {
    StringBuilder sb = new StringBuilder("---").append(text)
        .append("---");
    LOGGER.info("onTestShow " + sb.toString());
    view.testView(sb.toString());
  }

  @Override
  public void initView(WebPortalView view) {
    view.setUiHandlers(this);
  }
}