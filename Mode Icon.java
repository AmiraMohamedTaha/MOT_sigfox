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
