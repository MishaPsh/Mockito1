package myxap.djavist_lesson;

public class WorkerNotFoundException extends RuntimeException {
  public WorkerNotFoundException(String message) {
    super(message);
  }
}
