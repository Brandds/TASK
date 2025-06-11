import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController // 1. Marca esta classe como um controller que lida com requisições REST
@RequestMapping("/api/tasks") // 2. Define que todos os endpoints nesta classe começarão com /api/tasks
class TaskController {

    @GetMapping("/hello") // 3. Mapeia este método para requisições GET em /api/tasks/hello
    fun sayHello(): String {
        return "Olá! Sua API de Tarefas está no ar!"
    }
}