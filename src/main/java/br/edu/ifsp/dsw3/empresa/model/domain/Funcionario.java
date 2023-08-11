package br.edu.ifsp.dsw3.empresa.model.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity<Long> {
    @Column(nullable = false)
    private String nome;
    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;
    @DateTimeFormat(iso = ISO.DATE)
    @Column(nullable = false, name = "data_entrada", columnDefinition = "DATE")
    private LocalDate dataEntrada;
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "departamento_id_fk")
    private Departamento departamento;

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", dataEntrada=" + dataEntrada + ", dataSaida="
                + dataSaida + ", endereco=" + endereco + ", departamento=" + departamento + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((salario == null) ? 0 : salario.hashCode());
        result = prime * result + ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
        result = prime * result + ((dataSaida == null) ? 0 : dataSaida.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (salario == null) {
            if (other.salario != null)
                return false;
        } else if (!salario.equals(other.salario))
            return false;
        if (dataEntrada == null) {
            if (other.dataEntrada != null)
                return false;
        } else if (!dataEntrada.equals(other.dataEntrada))
            return false;
        if (dataSaida == null) {
            if (other.dataSaida != null)
                return false;
        } else if (!dataSaida.equals(other.dataSaida))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (departamento == null) {
            if (other.departamento != null)
                return false;
        } else if (!departamento.equals(other.departamento))
            return false;
        return true;
    }
}
