import javax.swing.*;


public class estudiante extends persona
{
	
	private String universidad;
	private String carnet; 
	private String carrera; 
	private float prom; 
	

	
	public estudiante(String nombre, float altura, int edad, float peso, String personalidad, String universidad,
			String carnet, String carrera, float prom) 
	{
		super(nombre, altura, edad, peso, personalidad);
		this.universidad = universidad;
		this.carnet = carnet;
		this.carrera = carrera;
		this.prom = prom;
	}



	public String getUniversidad() {
		return universidad;
	}



	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}



	public String getCarnet() {
		return carnet;
	}



	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}



	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}



	public float getProm() {
		return prom;
	}



	public void setProm(float prom) {
		this.prom = prom;
	}
	
	

	public void estudiar()
	{
		JOptionPane.showMessageDialog(null, nombre + " esta estudianto...");
	}

	public void informacion()
	{
		String texto =  "NOMBRE: " + nombre + "\tEDAD: " + edad + "\n"
						 + "ALTURA: " + altura + "\tPERSONALIDAD: " + personalidad + "\n"
						 + "PESO: " + peso + "\n"
						 + "UNIVERSIDAD: " + universidad + "\tCARRERA: " + carrera + "\n"
						 + "CARNET: " + carnet + "\tPROMEDIO: " + prom);

		JtextArea imp = new JtextArea(); 
		JTextArea imp = new JTextArea(); 
		imp.setText(texto); 
		imp.setEditable(false);
		JOptionPane.showMessageDialog(null, imp);
	}

	
}
