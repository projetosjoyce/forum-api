package br.comalura.forum.controller

import br.comalura.forum.model.Curso
import br.comalura.forum.model.Topico
import br.comalura.forum.model.Usuario
import br.comalura.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }

}