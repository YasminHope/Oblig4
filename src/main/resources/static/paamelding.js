class Paameldingsskjema {
    #root;
    #fornavn;
    #etternavn;
    #mobil;
    #passord;
    #gpassord;
    #mann;
    #kvinne;

    constructor(root) {
        this.#root = root;
        this.#fornavn = document.getElementById("fornavn");
        this.#etternavn = document.getElementById("etternavn");
        this.#mobil = document.getElementById("mobil");
        this.#passord = document.getElementById("passord");
        this.#gpassord = document.getElementById("gpassord");
        this.#mann = document.getElementById("mann");
        this.#kvinne = document.getElementById("kvinne");

        const meldPåKnapp = this.#root.querySelector("input[type='submit']");
        meldPåKnapp.addEventListener("click", () => registrering);
    }

}