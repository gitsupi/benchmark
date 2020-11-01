import io.jooby.Jooby;

public class App extends Jooby {

  {
    get("/", ctx -> "fuck u spring web flux");
  }

  public static void main(String[] args) {
    runApp(args, App::new);
  }
}