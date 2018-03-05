package com.test.portal.webportal.client.views;

import com.test.portal.webportal.client.views.WebPortalView;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.progressoft.brix.domino.api.client.annotations.UiView;

@UiView(presentable=WebPortalPresenter.class)
public class FakeWebPortalView implements WebPortalView {

}
