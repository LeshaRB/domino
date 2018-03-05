package com.test.portal.webportal.client;

import com.google.gwtmockito.GwtMockitoTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.client.requests.WebPortalServerRequest;
import com.test.portal.webportal.shared.request.WebPortalRequest;
import com.test.portal.webportal.shared.response.WebPortalResponse;
import com.test.portal.webportal.client.presenters.WebPortalPresenterSpy;
import com.test.portal.webportal.client.views.FakeWebPortalView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;


@ClientModule(name="TestWebPortal")
@RunWith(GwtMockitoTestRunner.class)
public class WebPortalClientModuleTest{

    private WebPortalPresenterSpy presenterSpy;
    private FakeWebPortalView fakeView;
    private ClientContext clientContext;

    @Before
    public void setUp() {
        presenterSpy = new WebPortalPresenterSpy();
        DominoTestClient.useModules(new WebPortalModuleConfiguration(), new TestWebPortalModuleConfiguration())
                .replacePresenter(WebPortalPresenter.class, presenterSpy)
                .viewOf(WebPortalPresenter.class, view -> fakeView= (FakeWebPortalView) view)
                .onStartCompleted(clientContext -> this.clientContext = clientContext)
                .start();
    }

    @Test
    public void givenWebPortalModule_whenContributingToMainExtensionPoint_thenShouldReceiveMainContext() throws Exception {
        assertThat(presenterSpy.getMainContext()).isNotNull();
    }

    @Test
    public void givenWebPortalClientModule_whenWebPortalServerRequestIsSent_thenServerMessageShouldBeRecieved() {
        clientContext.forRequest(WebPortalServerRequest.class).returnResponse(new WebPortalResponse("Server message"));

        new WebPortalServerRequest(new WebPortalRequest("client message")).onSuccess(response -> assertThat(response.getServerMessage()).isEqualTo("Server message"))
        .onFailed(failedResponse -> fail(failedResponse.getError().getMessage()))
        .send();
    }
}
