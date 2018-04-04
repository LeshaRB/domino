package com.test.portal.webportal.client.ui.views.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.test.portal.webportal.client.presenters.home.HomeWebPortalPresenter;
import com.test.portal.webportal.client.views.home.IHomeWebPortalView;
import gwt.material.design.client.ui.MaterialFAB;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialSideNavDrawer;

/**
 * IHomeWebPortalView.
 *
 * @author Aliaksei Labotski.
 * @since 4/4/18.
 */
@UiView(presentable = HomeWebPortalPresenter.class)
public class HomeWebPortalView extends Composite implements IHomeWebPortalView {

  private static HomeWebPortalViewUiBinder ourUiBinder = GWT.create(HomeWebPortalViewUiBinder.class);

  @UiField
  MaterialHeader header;
  @UiField
  MaterialNavBar navBar;
  @UiField
  MaterialFAB fab;
  @UiField
  MaterialSideNavDrawer sideNav;

  @Override
  public void setUiHandlers(HomeWebPortalUiHandlers uiHandlers) {
  }

  public HomeWebPortalView() {
    initWidget(ourUiBinder.createAndBindUi(this));
  }

  interface HomeWebPortalViewUiBinder extends UiBinder<MaterialPanel, HomeWebPortalView> {

  }
}
