package unidad06.edificio;

import java.sql.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Edificio {
	private Set<Persona> accesoVip;
	private Map<String ,Date> ins;
	private Map<String, Date> insVip;
	public Map<String, Date> getHoraInt() {
		return insVip;
	}


	public void accesoEdificio(String persDni) {
		if(null != persDni && insVip.containsKey(persDni)) {
			Iterator<Persona> itPers = this.accesoVip.iterator();
		boolean esVip = false;
		while(!esVip && itPers.hasNext()) {
			Persona personaAct = itPers.next();
			if(persDni.equalsIgnoreCase(personaAct.getDni())) {
				esVip = true;
			}
		} if(esVip) {
			insVip.put(persDni, new Date(0));
		} else {
			System.err.println("Persona con dni " + persDni + " no tiene permisos de acceso a la zona Vip");
		}
		}	else {
			System.err.println("P ");
		}
		
	}
	
	public void salidaEdificio(String persDni) {
		if (null != persDni&& ins.containsKey(persDni)) {
			ins.remove(persDni);
		} else {
			System.err.println("Persona con dni " + persDni + "ya registrado");
		}
	}
	public Edificio(Set<Persona> accesoVip, Map<String, Date> horaInt, Map<String, Date> horaOut) {
		super();
		this.accesoVip = accesoVip;
		this.insVip = horaInt;
		this.ins = horaOut;
	}
	
}
