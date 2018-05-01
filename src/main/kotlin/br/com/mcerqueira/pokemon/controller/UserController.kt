package br.com.mcerqueira.pokemon.controller

import br.com.mcerqueira.pokemon.service.UserService
import br.com.mcerqueira.pokemon.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping("/login")
    fun login(@RequestBody user: User): User? {
        return userService.findByLoginAndPassword(user.login, user.password)
    }

    @PostMapping
    fun save(@RequestBody user: User) {
        userService.save(user)
    }
}