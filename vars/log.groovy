def call (LinkedHashMap<String,String>config=[:]) {
  if (config.containsKey('message')) {
    info(config['message'])
  }
}

def info(message) {
  println("#INFO: ${message}")
}

def warning(message) {
  println ("#WARNING: ${message}")
}
