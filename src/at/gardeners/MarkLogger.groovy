package at.gardeners

class MarkLogger {
  static String mark = '§'

  def start() {
    marker('start')
  }

  def stop() {
    marker('stop')
  }

  private def marker(String text='INFO') {
    println(mark + text + ':')
  }
}
