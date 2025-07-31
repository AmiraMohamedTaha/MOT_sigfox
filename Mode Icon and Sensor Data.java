let modeImgUrls = [
  "https://cdn-icons-png.flaticon.com/128/2585/2585045.png",
  "https://cdn-icons-png.flaticon.com/128/11331/11331728.png",
  "https://cdn-icons-png.flaticon.com/128/11569/11569987.png",
  "https://cdn-icons-png.flaticon.com/128/17411/17411056.png",
  "https://cdn-icons-png.flaticon.com/128/11278/11278854.png",
  "https://cdn-icons-png.flaticon.com/128/4863/4863224.png"
]

function ModeImage(ModeDecimal) {
  //body
  return '<img src= "' + modeImgUrls[ModeDecimal] + '"width=50>'
}

function FinalOutput(modeDecimal, temp, hum, lux, vibration, magnet) {
  //body
  if (modeDecimal == 0) {
    return "Stand By Mode";
  } else if (modeDecimal == 1) {
    return temp + " °C " + hum + " %";
  } else if (modeDecimal == 2) {
    return Number(lux).toFixed(2) + " Lux";
  } else if (modeDecimal == 3) {
    return "Door Mode";
  } else if (modeDecimal == 4) {
    if (vibration == 0) {
      return "No Vibration Detected"
    } else {
      return "Vibration Detected"
    }
  } else if (modeDecimal == 5) {
    if (magnet == 0) {
      return "No Magnet Detected"
    } else {
      return "Magnet Detected"
    }
  }
}
