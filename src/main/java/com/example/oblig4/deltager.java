package com.example.oblig4;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
public class deltager {
    @Pattern(regexp = "^\\d{8}$", message="Mobilnummer må være eksakt 8 siffer")
    @NotNull(message = "Mobil er obligatorisk")
    private String mobil;
    @Size(min=8, message="Passord må inneholde bokstaver, tall og minst ett spesielt tegn")
    @Pattern(regexp = "")
    @NotNull(message="Passord er obligatorisk")
    private String passord;
    @Size(min=2, message="Fornavn må inneholde minst 2 tegn og maks 20 tegn")
    @NotNull(message="Fornavn er obligatorisk")
    private String fornavn;
    @Size(min=2, message="Etternavn må inneholde minst 2 tegn og maks 20 tegn")
    @NotNull(message="Etternavn er obligatorisk")
    private String etternavn;
    @NotNull(message="Kjønn er obligatrisk")
    private String kjonn;

    public deltager(String mobil, String passord, String fornavn, String etternavn, String kjonn) {
        this.mobil = mobil;
        this.passord = passord;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
    }


    public String getMobil() {
        return mobil;
    }

    public String getPassord() {
        return passord;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getKjonn() {
        return kjonn;
    }
}
