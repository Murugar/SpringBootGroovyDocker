@RestController
class HelloworldController {
  @RequestMapping("/")
  String home() {
    return "Docker Spring Boot Groovy Hello!"
  }
}