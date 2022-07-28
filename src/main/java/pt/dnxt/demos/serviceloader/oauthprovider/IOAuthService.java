package pt.dnxt.demos.serviceloader.oauthprovider;

import java.util.Map;

public interface IOAuthService {

	String getProvider();

	Map<String, String> login(String authenticationToken);

}
