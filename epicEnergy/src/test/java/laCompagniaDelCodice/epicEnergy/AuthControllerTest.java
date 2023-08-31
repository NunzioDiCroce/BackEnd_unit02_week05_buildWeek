package laCompagniaDelCodice.epicEnergy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import laCompagniaDelCodice.epicEnergy.security.JWTTools;
import laCompagniaDelCodice.epicEnergy.services.UtenteService;

//* * * * CLASSE PER TEST AUTHCONTROLLER (LOGIN UTENTE) * * * *

@SpringBootTest
public class AuthControllerTest {

	@MockBean // ANNOTAZIONE PER CREARE UNA SIMULAZIONE DEL BEAN IN SPRING
	private UtenteService utenteService;

	@MockBean // ANNOTAZIONE PER CREARE UNA SIMULAZIONE DEL BEAN IN SPRING
	private JWTTools jwtTools;

	@Test
	public void testLoginSuccess() {

	}
}
