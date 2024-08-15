package colecoes;

import java.util.Objects;

public class Usuario {

	String name;
	Usuario(String nome) {
		this.name = nome;
	}

	@Override
	public String toString() {
		return "Meu nome é " + this.name + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(name, other.name);
	}


	
	
}
