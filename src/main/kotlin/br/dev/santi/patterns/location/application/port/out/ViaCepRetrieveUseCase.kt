package br.dev.santi.patterns.location.application.port.out

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.service.annotation.GetExchange
import org.springframework.web.service.annotation.HttpExchange

private const val VIACEP_URL_SUFIX = "/json"

@HttpExchange(value = "/ws")
interface ViaCepRetrieveUseCase {
    @GetExchange(value = "/{cep}$VIACEP_URL_SUFIX")
    fun retrieveViaCepData(@PathVariable("cep") cep: String): ResponseEntity<ViaCepDataDto>
}