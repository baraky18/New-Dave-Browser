package com.dialogflow.dialogflowbrowser.service;

import java.io.IOException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtGeneratorService {
	/*
	 * PRIVATE_KEY is located in file: new-dave-24849b94abbc.json that was downloaded from https://console.cloud.google.com/iam-admin/serviceaccounts/details/104646028200136259293/keys?orgonly=true&project=new-dave&supportedpurview=organizationId
	 */
	private static String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCmtEXbsNvgQmHA\n8YTbPiARSFM0WN/Pa2fBEh0KMvRD5MqK99B1JSiZU3dVd1U42IpGeL7Y/tDSHYf8\nMcqTtjm39/Obe92jHNyCZ891GCUSoxr8CY+omjPj5QA3VJvEstkpEJ7eawUchpIz\nm9DteCBW64gE9GIavWpYSNzc1SuoSDNCOCOCwrihsMaJW+INRD2W1MdJ/RK61Ru3\ny7qPB6foM2bqAmFO2qaVdGtJC+6ywBJNcI4XDcHE6n2FkZ4guYz2oqKzz3Uk3Sgb\nortnHHsNr9j8aVYI0gmB1rUbda82o40zjyf+xLqVrkpb3jaGDRg14tqOkt2XivkJ\negZbyR0PAgMBAAECggEAUk0zJhTJYQz03QCAQouH4nBuH6x3Bpz0suXB74yber+E\nXZqeUI+BXT1Pb6MEMJX7onIvastXBj0tK03bwRRYp6JjI1LCaCqyFTGyQxGiD/L1\nuhPwWGGVF8Cx3B9J7hEMVJFPleiJM/2eRZt6SRsjADa1RxjuLFxymdaTL/WQYbpC\nxcf5Oc7YcGYayYoBHUxy2/IEEy6rNKwgvSLtbliRGovk/LeXfpTz45ARJXOrHOM5\n9E/S8Zd3Q3ExoV7Cx7WraaTvPJ17YiXaa9vvp4NJ2c2/EEWY3cfMvikDoN4d4tBX\nWdUkV3hmQBFVNd1BOwJcBAt2BLFZYY/4JBkeNPqYnQKBgQDh0eij09/+3jjQWUeZ\nNmpukyethwbYoQa2JVjr71/lvECzZ2IeaPMsP1F4zyno+dLEM+6ZrnpSKTnmkg7W\n+Mdj1j2pymXkbOoP1nNyAv4S0HkSYPcyiDD77nuZ8WxoGneQ+xFe7OTXiiL6gybi\nd+NH+jkAPnV1fhEmujZSDRAOgwKBgQC8+86OIN/uQypl2qdnpon9eJopsOaIwJc3\n7dP1k6QLTWV/ZHHW3222/pXjeYApODXRGJZu5HfhF5f5euhVIYqfNlDsinIVK4kd\nmO1yLq1L/wMgbNyxndvrO8NPZp0BrpFQcI13QPw57p3sRGl28AyV/iq3eIXkrR7t\n/VUl6aOxhQKBgEenLlVFdm7NnmNl4NUZsh3R7aYfESoNti53nUaH1vrzh+glJroV\nfQuOL9DQkzDMjHcbL1tuRHvrfubNc438tG/WXAyTH0+iy4Yo+sqzbmET60bMo8NR\n+ZEG9As90rMZqtTDBZkEO/y0ZTLuCJmVhvWgzRNpviWA0fpi3bedU3n3AoGBAKwi\neBwBWba+OuoXZZAFo37a0SDUXseFFLf+yqfO2Qbqcl688OwVCuw5q/FMhC4HYw2X\n5b4QIBlI0kaNav3P1WH7qW4rFIqv4u6wkucEGRk1qHVqcwLdlKkJAHdcMfqMNRQd\n0N0kthlWfUXtclrBf9VHc0U2ZE7MWXXQ4DPuQgm5AoGBANkz8a/YxeeAn2om30kO\nU7mEjhAuL2Vg681qATb+ZKVy/o298yeJHstyxgQ70zeNXMHatmidSKS3/C/O6gDV\n/J+4lUG95OE7mHtmT7kIR3Z3tDZ8eipncJ/OZnDD+3hD6qh4UhTnWR0XozAr4PxZ\nps4KhaFutd2fKFZudLwGAhlM";
	private static String AUDIENCE = "https://oauth2.googleapis.com/token";
	private static String SCOPE = "https://www.googleapis.com/auth/cloud-platform https://www.googleapis.com/auth/dialogflow";

	
	public String createJwtRsa() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException {
		byte[] keyBytes = DatatypeConverter.parseBase64Binary(PRIVATE_KEY);
	    PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
	    KeyFactory kf = KeyFactory.getInstance("RSA");
	    
		Date now = new Date();
		// Create a JWT to authenticate this device. The device will be disconnected after the token
		// expires, and will have to reconnect with a new token. The audience field should always be set
		// to the GCP project id.
		JwtBuilder jwtBuilder =
				Jwts.builder()
				.setIssuer("serviceaccounttestagent@testagent-ui9q.iam.gserviceaccount.com")
				.setIssuedAt(now)
				.setExpiration(DateUtils.addMinutes(now, 4))
				.setAudience(AUDIENCE)
				.claim("scope", SCOPE);

		return jwtBuilder.signWith(SignatureAlgorithm.RS256, kf.generatePrivate(spec)).compact();
	}
	
	public static Claims decodeJWT(String jwt) {
	    //This line will throw an exception if it is not a signed JWS (as expected)
	    Claims claims = Jwts.parser()
	            .setSigningKey(DatatypeConverter.parseBase64Binary(PRIVATE_KEY))
	            .parseClaimsJws(jwt).getBody();
	    return claims;
	}
}
