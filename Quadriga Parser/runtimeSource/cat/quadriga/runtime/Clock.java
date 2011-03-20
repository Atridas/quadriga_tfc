package cat.quadriga.runtime;

import org.lwjgl.Sys;

public class Clock {
  private long lastTimeCycles;
  private long timeCycles;
  private float timeScale = 1;
  private boolean isPaused = false;
  
  private final float[] lastDeltas = new float[3];
  private int deltaIndex = 0;
  
  private static long cyclesPerSecond = Sys.getTimerResolution();
  
  public static long secondsToCycles(float seconds) {
    return (long)(seconds * cyclesPerSecond);
  }
  
  public static float cyclesToSeconds(long cycles) {
    return (float)cycles / cyclesPerSecond;
  }
  
  public Clock() {this(0);}
  
  public Clock(float startTime) {
    timeCycles = secondsToCycles(startTime);
    lastTimeCycles = Sys.getTime();
  }
  
  public long getTimeCycles() {
    return timeCycles;
  }
  
  public long getTimeMiliSeconds() {
    return timeCycles * 1000 / cyclesPerSecond;
  }
  
  public float calcDeltaSeconds(Clock other) {
    long dt = timeCycles - other.timeCycles;
    return cyclesToSeconds(dt);
  }
  
  public float update() {
    cyclesPerSecond = Sys.getTimerResolution();
    if(!isPaused) {
      long newTimeCycles = Sys.getTime();
      long dif = newTimeCycles - lastTimeCycles;
      lastTimeCycles = newTimeCycles;
      float fDif = cyclesToSeconds(dif);
      if(fDif > 1.0f/15.0f) {
        fDif = 1.0f/15.0f;
        dif = secondsToCycles(fDif); //si hem tardat massa, considerem
                                     //que hi ha hagut un breakpoint
      }
      timeCycles += dif*timeScale;
      
      lastDeltas[deltaIndex] = fDif;
      deltaIndex = (deltaIndex + 1) % lastDeltas.length;
      
      float dt = 0;
      for(float t : lastDeltas) {
        dt += t;
      }
      return dt / lastDeltas.length;
    } else {
      return 0;
    }
  }
  
  public void singleStep(float dt) {
    lastTimeCycles = Sys.getTime();
    long dif = secondsToCycles(dt);
    float fDif = cyclesToSeconds(dif);
    timeCycles += dif*timeScale;
    
    lastDeltas[deltaIndex] = fDif;
    deltaIndex = (deltaIndex + 1) % lastDeltas.length;
  }
  
  public void  setTimeScale(float s) { timeScale = s; }
  public float getTimeScale()        { return timeScale; }
  
  public void pause()  { isPaused = true;  }
  public void resume() { isPaused = false; }
}
