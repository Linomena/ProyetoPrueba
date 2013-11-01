package logica;

public class Hilo implements Runnable{
	
	private boolean ejecutando;
	private boolean pausado;
	private long velocidad;
	ThreadExample tr;
	
	
	public Hilo() {
		ejecutando=true;
		tr=new ThreadExample();
		velocidad=10000;
        run();
		}
	
	public void iniciar(){
		tr.start();
		
	}
	
	public void detener(){
		
	}

	@Override
	public void run() {
	
		
		try {
			while (ejecutando) {
				System.out.println("hola mundo");
			}
			//tr.sleep(velocidad);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		Hilo h=new Hilo();
		
	}

}
