package br.com.cicom.sisef.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lucas Matos e Souza
 */
@Entity
@Table(name = "TBL_MESA")
public class Guarnicao {
    @Id
    private int idGuarnicao;
    private String cmd;
    private String motorista;
    private String patrulheiro1;
    private String patrulheiro2;

    public int getIdGuarnicao() {
        return idGuarnicao;
    }

    public void setIdGuarnicao(int idGuarnicao) {
        this.idGuarnicao = idGuarnicao;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPatrulheiro1() {
        return patrulheiro1;
    }

    public void setPatrulheiro1(String patrulheiro1) {
        this.patrulheiro1 = patrulheiro1;
    }

    public String getPatrulheiro2() {
        return patrulheiro2;
    }

    public void setPatrulheiro2(String patrulheiro2) {
        this.patrulheiro2 = patrulheiro2;
    }

    @Override
    public String toString() {
        return "Guarnicao{" + "idGuarnicao=" + idGuarnicao + ", cmd=" + cmd + ", motorista=" + motorista + ", patrulheiro1=" + patrulheiro1 + ", patrulheiro2=" + patrulheiro2 + '}';
    }
    
}
