package com.test.portal.webportal.client.presenters.home;

import com.test.portal.webportal.client.views.home.IHomeWebPortalView;
import com.test.portal.webportal.client.views.home.IHomeWebPortalView.HomeWebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.BaseClientPresenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HomeWebPortalPresenter.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
@Presenter
public class HomeWebPortalPresenter extends BaseClientPresenter<IHomeWebPortalView> implements IHomeWebPortalPresenter,
    HomeWebPortalUiHandlers {

  private static final Logger LOGGER = LoggerFactory.getLogger(HomeWebPortalPresenter.class);

  @Override
  public void contributeToMainModule(WebPortalContext context) {
    context.setContentMain(view.getContent());
    LOGGER.info("Main context received at presenter " + HomeWebPortalPresenter.class.getSimpleName());
  }

  @Override
  public void initView(IHomeWebPortalView view) {
    view.setUiHandlers(this);
  }
}
