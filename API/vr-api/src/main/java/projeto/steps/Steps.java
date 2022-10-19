package projeto.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import projeto.api.Actions;

public class Steps {

Actions action = new Actions();

@Dado("que tenho acesso a API")
public void que_tenho_acesso_a_api() {
		action.acessarApi();
	}

@Então("valido a consulta  com metodo GET e id")
public void valido_a_consulta_com_metodo_get_e_id() {
		
	action.ValidarStatusCodeId();

	}
}
