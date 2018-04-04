package com.test.portal.webportal.client.presenters.home;

import com.progressoft.brix.domino.api.client.annotations.InjectContext;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;

/**
 * IHomeWebPortalPresenter.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
public interface IHomeWebPortalPresenter extends Presentable {

  @InjectContext(extensionPoint = MainExtensionPoint.class)
  void contributeToMainModule(MainContext context);
}
