package br.dev.santi.patterns.location.application.port.out

data class ViaCepDataDto(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ViaCepDataDto

        if (cep != other.cep) return false
        if (logradouro != other.logradouro) return false
        if (complemento != other.complemento) return false
        if (bairro != other.bairro) return false
        if (localidade != other.localidade) return false
        if (uf != other.uf) return false
        if (ibge != other.ibge) return false
        if (gia != other.gia) return false
        if (ddd != other.ddd) return false
        return siafi == other.siafi
    }
}