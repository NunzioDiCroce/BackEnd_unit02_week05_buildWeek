package laCompagniaDelCodice.epicEnergy.payloads;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorPayload {
	private String message;
	private Date timestamp;
}