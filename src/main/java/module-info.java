module me.davidrosenstein.allstationspathfinder {
  requires javafx.controls;
  requires javafx.fxml;


  opens me.davidrosenstein.allstationspathfinder to javafx.fxml;
  exports me.davidrosenstein.allstationspathfinder;
}