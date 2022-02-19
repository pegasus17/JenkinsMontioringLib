import at.gardeners.MarkLogger

def call (LinkedHashMap<String,String>config=[:]) {
  def logger = new MarkLogger()
  logger.debug('class')
  println ("[dbg]:start")
  if (config.containsKey('message')) {

    logger.start();
    logger.stop();
  }
  println ("[dbg]:end")
  println "ELAPSED TIME: ${currentBuild.rawBuild.getTimestampString()}"
}

def info(message) {
  println("#INFO: ${message}")
}

def warning(message) {
  println ("#WARNING: ${message}")
}
