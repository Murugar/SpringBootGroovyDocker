@RestController
class MainController {
  @RequestMapping("/")
  String home() {
    return "Docker Spring Boot Groovy Hello!"
  }
}
