package com.test.portal.webportal.client.presenters.home;

import com.progressoft.brix.domino.api.client.annotations.InjectContext;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.test.portal.webportal.shared.extension.WebPortalContext;
import com.test.portal.webportal.shared.extension.WebPortalExtensionPoint;

/**
 * IHomeWebPortalPresenter.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public interface IHomeWebPortalPresenter extends Presentable {

  @InjectContext(extensionPoint = WebPortalExtensionPoint.class)
  void contributeToMainModule(WebPortalContext context);
}
