package com.test.portal.webportal.client.presenters.loading;

import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.BaseClientPresenter;
import com.test.portal.webportal.client.views.loading.ILoadingWebPortalView;
import com.test.portal.webportal.client.views.loading.ILoadingWebPortalView.LoadingWebPortalUiHandlers;
import com.test.portal.webportal.shared.extension.WebPortalContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LoadingWebPortalPresenter.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
@Presenter
public class LoadingWebPortalPresenter extends BaseClientPresenter<ILoadingWebPortalView> implements
    ILoadingWebPortalPresenter, LoadingWebPortalUiHandlers {

  private static final Logger LOGGER = LoggerFactory.getLogger(LoadingWebPortalPresenter.class);

  @Override
  public void contributeToLoadingModule(WebPortalContext context) {
    context.setContentLoading(view.getContent());
    LOGGER.info("Main context received at presenter " + LoadingWebPortalPresenter.class.getSimpleName());
  }

  @Override
  public void initView(ILoadingWebPortalView view) {
    view.setUiHandlers(this);
  }

}
