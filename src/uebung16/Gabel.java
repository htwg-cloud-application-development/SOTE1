package uebung16;

public class Gabel {
  protected int nummer;
  protected boolean liegtAufTisch = true;
  
  public Gabel(int nummer) {
    this.nummer = nummer;
  }

  protected synchronized boolean greifeGabel(Philosoph philosoph) {
    if (liegtAufTisch) {
      System.out.println(philosoph + " greift erfolgreich nach Gabel "+ nummer);
      liegtAufTisch = false;
      return true;
    } else {
      System.err.println(philosoph + " greift erfolglos nach Gabel" + nummer);
      return false;
    }
  }

  protected synchronized void legeGabelHin(Philosoph philosoph) {
    System.out.println(philosoph + " legt Gabel " + nummer + " hin");
    liegtAufTisch = true;
    notify();
  }

  protected synchronized void warteAuf(Philosoph philosoph) {
    while (!greifeGabel(philosoph)) {
      try {
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}