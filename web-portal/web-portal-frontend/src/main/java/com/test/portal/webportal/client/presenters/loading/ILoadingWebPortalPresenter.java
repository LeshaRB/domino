package com.test.portal.webportal.client.presenters.loading;

import org.dominokit.domino.api.client.annotations.InjectContext;
import org.dominokit.domino.api.client.mvp.presenter.Presentable;
import com.test.portal.webportal.shared.extension.WebPortalContext;
import com.test.portal.webportal.shared.extension.WebPortalExtensionPoint;

/**
 * ILoadingWebPortalPresenter.
 *
 * @author Aliaksei Labotski.
 * @since 4/6/18.
 */
public interface ILoadingWebPortalPresenter extends Presentable {

  @InjectContext(extensionPoint = WebPortalExtensionPoint.class)
  void contributeToLoadingModule(WebPortalContext context);
}
