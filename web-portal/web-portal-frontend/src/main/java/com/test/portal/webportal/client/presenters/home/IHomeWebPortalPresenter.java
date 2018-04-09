package com.test.portal.webportal.client.presenters.home;

import com.test.portal.webportal.shared.extension.WebPortalContext;
import com.test.portal.webportal.shared.extension.WebPortalExtensionPoint;
import org.dominokit.domino.api.client.annotations.InjectContext;
import org.dominokit.domino.api.client.mvp.presenter.Presentable;

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
