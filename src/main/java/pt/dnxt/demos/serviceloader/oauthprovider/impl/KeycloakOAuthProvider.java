package pt.dnxt.demos.serviceloader.oauthprovider.impl;

import java.util.Map;

import lombok.Data;
import pt.dnxt.demos.serviceloader.oauthprovider.IOAuthService;

@Data
public class KeycloakOAuthProvider implements IOAuthService {

	private final String providerName = "Keycloak";

	public KeycloakOAuthProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getProvider() {
		return this.providerName;
	}

	@Override
	public Map<String, String> login(String authenticationToken) {
		return Map.of("NIF", "227723694");
	}
}
