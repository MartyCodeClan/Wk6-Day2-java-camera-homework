// class AnalogueCamera extends Camera implements Printable {
  
// }

import java.util.*;

class AnalogueCamera implements Printable {

  private String make;
  private String model;
  private Boolean filter;
  private String resolution;

  public AnalogueCamera(String make, String model, Boolean filter, String resolution){
    this.make = make;
    this.model = model;
    this.filter = filter;
    this.resolution = resolution;
  }

  public String printDetails(){
    return this.make + this.model + this.filter + this.resolution;
  }
}