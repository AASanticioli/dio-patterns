package br.dev.santi.patterns.location.adapter.out.service

import br.dev.santi.patterns.location.application.port.out.ViaCepRetrieveUseCase
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.support.WebClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory


private const val SERVICE_URL:String = "https://viacep.com.br"

class ViaCepService {
    private lateinit var viaCepRetrieveUseCase: ViaCepRetrieveUseCase;

    init {

        val webClient: WebClient = WebClient.builder()
            .baseUrl(SERVICE_URL)
            .build();

        val httpServiceProxyFactory = HttpServiceProxyFactory
            .builder(WebClientAdapter.forClient(webClient))
            .build()

        viaCepRetrieveUseCase = httpServiceProxyFactory.createClient(ViaCepRetrieveUseCase::class.java)
    }


    fun getViaCepRetrieveUseCase(): ViaCepRetrieveUseCase {
        return viaCepRetrieveUseCase;
    }

}