package com.test.portal.webportal.client.presenters;

import org.dominokit.domino.api.client.annotations.InjectContext;
import org.dominokit.domino.api.client.mvp.presenter.Presentable;
import org.dominokit.domino.api.shared.extension.MainContext;
import org.dominokit.domino.api.shared.extension.MainExtensionPoint;

public interface WebPortalPresenter extends Presentable {

  @InjectContext(extensionPoint = MainExtensionPoint.class)
  void contributeToMainModule(MainContext context);
}