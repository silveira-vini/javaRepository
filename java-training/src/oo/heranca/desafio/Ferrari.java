package oo.heranca.desafio;

public class Ferrari extends Carro {

	@Override
	public void acelerar() {
		if (this.getVelocidade() > this.getVELOCIDADE_MAXIMA()) {
			this.setVelocidade(this.getVELOCIDADE_MAXIMA());
		} else {
			this.setVelocidade(getVELOCIDADE_MAXIMA() + 15);
		}
	}

	@Override
	public void freiar() {
		this.setVelocidade(getVelocidade() - 15);
	}

}
