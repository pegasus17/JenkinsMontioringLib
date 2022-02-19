import at.gardeners.MarkLogger

def call (LinkedHashMap<String,String>config=[:]) {
  if (config.containsKey('message')) {
    def logger = new MarkLogger()
    logger.start();
    logger.stop();
  }
}

def info(message) {
  println("#INFO: ${message}")
}

def warning(message) {
  println ("#WARNING: ${message}")
}
