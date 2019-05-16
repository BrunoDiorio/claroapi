package br.com.claro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoError {
	private String title;
	private Long status;
	private Long timestamp;
	private String message;
}
