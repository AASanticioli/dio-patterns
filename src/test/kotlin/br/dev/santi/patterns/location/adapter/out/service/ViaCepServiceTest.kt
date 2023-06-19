package br.dev.santi.patterns.location.adapter.out.service

import br.dev.santi.patterns.EXCEPTION
import br.dev.santi.patterns.EXTERNAL_SERVICE
import br.dev.santi.patterns.location.application.port.out.ViaCepDataDto
import br.dev.santi.patterns.location.application.port.out.ViaCepRetrieveUseCase
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.springframework.core.codec.DecodingException
import org.springframework.http.ResponseEntity



class ViaCepServiceTest {

    private lateinit var viaCepService: ViaCepService
    private lateinit var retrieveUseCase: ViaCepRetrieveUseCase

    @BeforeEach
    fun init() {
        viaCepService = ViaCepService()
        retrieveUseCase = viaCepService.getViaCepRetrieveUseCase()
    }

    @Test  @Tag(EXTERNAL_SERVICE)
    @DisplayName("ViaCep - Known Data for Known Cep")
    fun retrieveCepDataFromViaCepService_KnownCep_Success() {
        // given
        val cep = "01001000"

        val expected = ViaCepDataDto(
            cep = "01001-000",
            logradouro = "Praça da Sé",
            complemento = "lado ímpar",
            bairro = "Sé",
            localidade = "São Paulo",
            uf = "SP",
            ibge = "3550308",
            gia = "1004",
            ddd = "11",
            siafi = "7107"
        )

        // when
        val viaCepDataDto: ResponseEntity<ViaCepDataDto> = retrieveUseCase.retrieveViaCepData(cep)

        // then
        assertTrue(viaCepDataDto.hasBody())
        assertEquals(expected, viaCepDataDto.body)
    }

    @Test @Tag(EXCEPTION) @Tag(EXTERNAL_SERVICE)
    @DisplayName("ViaCep - DecodingException for Unknown Cep")
    fun retrieveCepDataFromViaCepService_UnknownCep_DecodingExceptionThrows() {
        // given
        val cep = "00000000"

        // then
        assertThrows(DecodingException::class.java) {
            retrieveUseCase.retrieveViaCepData(cep)
        }
    }
}