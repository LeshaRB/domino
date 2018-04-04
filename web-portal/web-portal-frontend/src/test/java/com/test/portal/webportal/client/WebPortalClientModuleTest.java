package com.test.portal.webportal.client;

import static junit.framework.TestCase.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.progressoft.brix.domino.api.client.annotations.ClientModule;
import com.progressoft.brix.domino.test.api.client.ClientContext;
import com.progressoft.brix.domino.test.api.client.DominoTestClient;
import com.test.portal.webportal.client.presenters.WebPortalPresenter;
import com.test.portal.webportal.client.presenters.WebPortalPresenterSpy;
import com.test.portal.webportal.client.presenters.home.HomeWebPortalPresenterSpy;
import com.test.portal.webportal.client.presenters.home.IHomeWebPortalPresenter;
import com.test.portal.webportal.client.requests.WebPortalServerRequest;
import com.test.portal.webportal.client.views.FakeWebPortalView;
import com.test.portal.webportal.client.views.home.FakeHomeWebPortalView;
import com.test.portal.webportal.shared.request.WebPortalRequest;
import com.test.portal.webportal.shared.response.WebPortalResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@ClientModule(name = "TestWebPortal")
@RunWith(GwtMockitoTestRunner.class)
public class WebPortalClientModuleTest {

  private WebPortalPresenterSpy presenterSpy;
  private HomeWebPortalPresenterSpy homeWebPortalPresenterSpy;

  private FakeWebPortalView fakeView;
  private FakeHomeWebPortalView fakeHomeWebPortalView;

  private ClientContext clientContext;

  @Before
  public void setUp() {
    presenterSpy = new WebPortalPresenterSpy();
    homeWebPortalPresenterSpy = new HomeWebPortalPresenterSpy();

    DominoTestClient.useModules(new WebPortalModuleConfiguration(), new TestWebPortalModuleConfiguration())
        .replacePresenter(WebPortalPresenter.class, presenterSpy)
        .viewOf(WebPortalPresenter.class, view -> fakeView = (FakeWebPortalView) view)
        .onStartCompleted(clientContext -> this.clientContext = clientContext)
        .start();
    DominoTestClient.useModules(new WebPortalModuleConfiguration(), new TestWebPortalModuleConfiguration())
        .replacePresenter(IHomeWebPortalPresenter.class, homeWebPortalPresenterSpy)
        .viewOf(IHomeWebPortalPresenter.class, view -> fakeHomeWebPortalView = (FakeHomeWebPortalView) view)
        .onStartCompleted(clientContext -> this.clientContext = clientContext)
        .start();

    assertNotNull(fakeView);
    assertNotNull(fakeHomeWebPortalView);
  }

  @Test
  public void givenWebPortalModule_whenContributingToMainExtensionPoint_thenShouldReceiveMainContext()
      throws Exception {
    assertThat(presenterSpy.getMainContext()).isNotNull();
  }

  @Test
  public void givenWebPortalClientModule_whenWebPortalServerRequestIsSent_thenServerMessageShouldBeRecieved() {
    clientContext.forRequest(WebPortalServerRequest.class)
        .returnResponse(new WebPortalResponse("Server message"));

    new WebPortalServerRequest(new WebPortalRequest("client message")).onSuccess(
        response -> assertThat(response.getServerMessage()).isEqualTo("Server message"))
        .onFailed(failedResponse -> fail(failedResponse.getError()
            .getMessage()))
        .send();
  }
}
