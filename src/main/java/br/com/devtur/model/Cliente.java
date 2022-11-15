package br.com.devtur.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa{
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Viagem> viagem;

    public List<Viagem> getViagem() {
        return viagem;
    }

    public void setViagens(List<Viagem> viagem) {
        this.viagem = viagem;
    }

}
