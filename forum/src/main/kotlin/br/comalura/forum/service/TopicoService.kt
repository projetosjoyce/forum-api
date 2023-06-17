package br.comalura.forum.service

import br.comalura.forum.model.Curso
import br.comalura.forum.model.Topico
import br.comalura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {

    fun listar(): List<Topico> {
        val topico = Topico (
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso (
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario (
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        return Arrays.asList(topico,topico,topico)
    }

}
