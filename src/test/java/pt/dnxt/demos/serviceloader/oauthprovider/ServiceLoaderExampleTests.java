package pt.dnxt.demos.serviceloader.oauthprovider;

import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceLoaderExampleTests {

	@Test
	void testServiceLoader() {
		ServiceLoader<IOAuthService> sl = ServiceLoader.load(IOAuthService.class);
		IOAuthService cmdAuthService = sl.stream().filter(provider -> "CMD".equals(provider.get().getProvider()))
				.findFirst().get().get();

		log.info("CMD: {}", cmdAuthService.login("tokencmd"));

		IOAuthService keycloakAuthService = sl.stream()
				.filter(provider -> "Keycloak".equals(provider.get().getProvider())).findFirst().get().get();
		log.info("Keycloak: {}", keycloakAuthService.login("tokenkeycloak"));
	}

}
