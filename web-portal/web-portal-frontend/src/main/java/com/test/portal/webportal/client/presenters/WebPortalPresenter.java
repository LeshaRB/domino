package com.test.portal.webportal.client.presenters;

import com.progressoft.brix.domino.api.client.annotations.InjectContext;
import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;
import com.progressoft.brix.domino.api.shared.extension.MainContext;
import com.progressoft.brix.domino.api.shared.extension.MainExtensionPoint;

public interface WebPortalPresenter extends Presentable {

  @InjectContext(extensionPoint = MainExtensionPoint.class)
  void contributeToMainModule(MainContext context);
}