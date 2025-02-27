package Empresa;

import Poo.Exception.EmpresaCompletaException;
import Poo.Exception.EmpresaEmpleadoExistenteException;
import Poo.Exception.EmpresaEmpleadoNoExisteException;

public class Empresa {

		// Atributos
		private String nombre;
		private String cif;
		private String telefono;
		private String direccion;
		private Empleado[] empleados;

		// Constructores
		/**
		 * @param nombre
		 * @param cIF
		 */
		public Empresa(String nombre, String cif) {
			// Comprobar validez de nombre y cif levantar excepcion en caso contrario de tipo empresaNoValdaExcepcion
			this.nombre = nombre;
			this.cif = cif;
			this.telefono = "";
			this.direccion = "";
			this.empleados = new Empleado[100];
		}
		/**
		 * @param nombre
		 * @param cif
		 * @param telefono
		 * @param direccion
		 */
		public Empresa(String nombre, String cif, String telefono, String direccion) {
			this(nombre, cif);
			this.telefono = telefono;
			this.direccion = direccion;
			this.empleados = new Empleado[100];
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Empleado[] getEmpleados() {
			return empleados;
		}
		public void setEmpleados(Empleado[] empleados) {
			this.empleados = empleados;
		}
		public String getNombre() {
			return nombre;
		}
		public String getCif() {
			return cif;
		}
		
		public void anadirEmpleado(Empleado empleado) throws EmpresaCompletaException, EmpresaEmpleadoExistenteException {
			boolean existeEmpleado = false;
			int indice = 0;
			int indiceVacio = -1;

			while (indice < this.empleados.length && !existeEmpleado) {
				Empleado empleadoAct = this.empleados[indice];
				if (indiceVacio < 0 && null == empleadoAct) {
					indiceVacio = indice;
				}
				if (null != empleadoAct && empleadoAct.equals(empleado)) {
					existeEmpleado = true;
				}
				indice++;
			}
			if (indiceVacio < 0) {
				throw new EmpresaCompletaException("La capacidad de empleados de la empresa está completa");
			}
			if (existeEmpleado) {
				String mensaje = "El empleado con dni " + empleado.getDni() + " ya existe en la empresa";
				throw new EmpresaEmpleadoExistenteException();
			} else {
				this.empleados[indiceVacio] = empleado;
			}
		}

		/**
		 * Elimina de la empresa el empleado que coincide con el pasado por parámetro
		 * 
		 * @param empleado
		 * @throws EmpresaEmpleadoNoExisteException
		 */
		public void eliminarEmpleado(Empleado empleado) throws EmpresaEmpleadoNoExisteException {
			boolean eliminado = false;
			int i = 0;
			while (!eliminado && i < this.empleados.length) {
				Empleado empActual = this.empleados[i];
				if (null != empActual && null != empleado && empActual.equals(empleado)) {
					this.empleados[i] = null;
					eliminado = true;
				}
			}
			if (!eliminado) {
				throw new EmpresaEmpleadoNoExisteException(
						"El empleado que se desea eliminar no forma parte de la empresa");
			}
		}

		public void mostrarInfoEmpleados() {
			int i = 1;
			System.out.println("Información de los empleados de la empresa " + this.nombre);
			for (Empleado empleado : this.empleados) {
				if (null != empleado) {
					System.out.println("" + i++ + ". " + empleado);
				}
			}
		}

		public void mostrarDniSueldoEmpleados() {
			StringBuilder sb = new StringBuilder();
			for (Empleado empleado : this.empleados) {
				sb.append("D.N.I. ").append(empleado.getDni());
				sb.append(" Sueldo bruto: ").append(empleado.getSueldoBruto());
				// TODO: sb.append(" Sueldo neto: ").append(empleado.getSueldoNeto());
			}
			System.out.println(sb);
		}

		/**
		 * Devuelve la suma de todos los sueldos brutos de los empleados
		 * 
		 * @return sumaBrutos
		 */
		public double sumaSueldoBrutoEmpleados() {
			double sumaBrutos = 0d;
			for (Empleado empleado : this.empleados) {
				if (null != empleado) {
					sumaBrutos += empleado.getSueldoBruto();
				}
			}
			return sumaBrutos;
		}
		public double sumaSueldoNetooEmpleados() {
			double sumaNeto = 0d;
			for (Empleado empleado : this.empleados) {
				if (null != empleado) {
					sumaNeto += empleado.getSueldoNeto();
				}
			}
			return sumaNeto;
		}
}
