package id.annotation.javac;

import com.sun.source.util.JavacTask;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;

public class Plugin implements com.sun.source.util.Plugin {

  @Override
  public String getName() {
    return "Plugin";
  }

  @Override
  public void init(JavacTask javacTask, String... args) {

  }

}
