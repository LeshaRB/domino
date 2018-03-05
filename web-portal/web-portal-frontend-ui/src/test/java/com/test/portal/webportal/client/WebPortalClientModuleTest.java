package com.test.portal.webportal.client;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.gwtmockito.WithClassesToStub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import static org.junit.Assert.*;

import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.client.presenters.WebPortalPresenterSpy;
import com.test.portal.webportal.client.views.WebPortalViewSpy;

import com.progressoft.brix.domino.test.api.client.DominoTestClient;

@RunWith(GwtMockitoTestRunner.class)
@WithClassesToStub(RootPanel.class)
public class WebPortalClientModuleTest{

    private WebPortalPresenterSpy presenterSpy;
    private WebPortalViewSpy viewSpy;

    @Before
    public void setUp() {
        presenterSpy = new WebPortalPresenterSpy();
        viewSpy = new WebPortalViewSpy();
        DominoTestClient.useModules(new WebPortalModuleConfiguration(), new WebPortalUIModuleConfiguration())
                .replacePresenter(WebPortalPresenter.class, presenterSpy)
                .replaceView(WebPortalPresenter.class, viewSpy)
                .start();
    }

    @Test
    public void nothing() throws Exception {

    }
}
