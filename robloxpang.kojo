clear
switchToDefault2Perspective()
sakta(1)
bredd(1)
var hasStolen = false
val p2 = new Padda(0, 0)
val p3 = new Padda(0,0)
val p1 = new Padda(0, 0)
p3.osynlig
p2.osynlig
val npc = new Padda(250, 0)
npc.kostym ("~/downloads/pic/npc.png")
osynlig
var ammo = 60
var mag = 30
var ammoNPC = 60
var magNPC = 30
var npcHP = 104
p1.kostym ("~/downloads/pic/karaktär.png")
var x = 0
var burst = false
var burstNPC = false
var y = 0
var npcX = 250
var npcY = 0
var lasttimenpcmoved = 25
val repeat = true
var ammoX = -100
var ammoY = 50
var p1HP = 104
p1.sakta(1)
p3.sakta(1)
p2.sakta(1)
sakta(1)

  norr
  hoppaTill(-320, 250)
  färg(svart)
  skriv("Semiautomatisk (B)")
  norr; hoppaTill(250, 250); färg(svart); skriv("Skott: "); hoppaTill(305, 250); skriv(ammo)
  norr; hoppaTill(250, 230); färg(svart); skriv("Mag: "); hoppaTill(295, 230); skriv(mag)
  p2.sudda
  p2.osynlig
  p2.norr; p2.hoppaTill(0, 250); p2.färg(svart); p2.skriv("HP: "); p2.öster; p2.hoppa(30); p2.norr; p2.skriv(npcHP)

def updateNPCHealth(){
  p2.sudda
  p2.osynlig
  if (burst){
    npcHP = npcHP - 12
  }
  else {
    npcHP = npcHP - 4
  }
  p2.norr; p2.hoppaTill(-50, 250); p2.färg(svart); p2.skriv("Motståndarens HP: "); p2.öster; p2.hoppa(170); p2.norr; p2.skriv(npcHP)
  Thread.sleep(50)
}

def updateNPCAmmo(){
  p3.sakta(1)
  p3.öster; p3.färg(vit); p3.fyll(vit); p3.hoppaTill(295, -295); p3.cirkel(150)
  p3.norr; p3.hoppaTill(250, -250); p3.färg(svart); p3.skriv("Skott: "); p3.hoppaTill(305, -250); p3.skriv(ammoNPC)
  p3.norr; p3.hoppaTill(250, -230); p3.färg(svart); p3.skriv("Mag: "); p3.hoppaTill(295, -230); p3.skriv(magNPC)
}

def updateP1Health(){
  p3.sudda
  p3.osynlig
  if (burstNPC){
    p1HP = p1HP - 12
  }
  else {
    p1HP = p1HP - 4
  }
  p3.norr; p3.hoppaTill(-50, -250); p3.färg(svart); p3.skriv("Motståndarens HP: "); p3.öster; p3.hoppa(170); p3.norr; p3.skriv(p1HP)
  Thread.sleep(50)
}

def burstTextNPC(){
  if(burstNPC){
    Thread.sleep(50)
    p3.osynlig
    p3.sakta(1)
    p3.öster; p3.färg(vit); p3.fyll(vit); p3.hoppaTill(-285, -370); p3.cirkel(140)
    p3.norr
    p3.hoppaTill(-320, -250)
    p3.färg(svart)
    p3.skriv("Burst (M)")
    Thread.sleep(50)
  }
  else{
    Thread.sleep(50) 
    p3.sakta(1)
    p3.osynlig
    p3.öster; p3.färg(vit); p3.fyll(vit); p3.hoppaTill(-285, -370); p3.cirkel(140)
    p3.norr
    p3.hoppaTill(-320, -250)
    p3.färg(svart)
    p3.skriv("Semiautomatisk (M)")
    Thread.sleep(50)
  }
}

updateNPCHealth()
updateP1Health()
updateNPCAmmo()
burstTextNPC()

def updateAmmo(){
  öster; färg(vit); fyll(vit); hoppaTill(315, 205); cirkel(150)
  norr; hoppaTill(250, 250); färg(svart); skriv("Skott: "); hoppaTill(305, 250); skriv(ammo)
  norr; hoppaTill(250, 230); färg(svart); skriv("Mag: "); hoppaTill(295, 230); skriv(mag)
}

def burstText(){
  if(burst){
    Thread.sleep(50)
    sakta(1)
    öster; färg(vit); fyll(vit); hoppaTill(-245, 200); cirkel(140)
    norr
    hoppaTill(-320, 250)
    färg(svart)
    skriv("Burst (B)")
    Thread.sleep(50)
  }
  else{
    Thread.sleep(50) 
    sakta(1)
    öster; färg(vit); fyll(vit); hoppaTill(-245, 200); cirkel(140)
    norr
    hoppaTill(-320, 250)
    färg(svart)
    skriv("Semiautomatisk (B)")
    Thread.sleep(50)
  }
}

while (repeat){
  Thread.sleep(1)
        if (isKeyPressed(Kc.VK_A)) {
          if (x < -250){
            
          }
          else {
             p1.hoppaTill(x-50, y)
             x = x - 50
             Thread.sleep(100)
          }
            
        }
        if (isKeyPressed(Kc.VK_D)) {
          if (x < 250){
             p1.hoppaTill(x+50, y)
             x = x + 50
             Thread.sleep(100)
          }
          else{
              
          }
        }
        if (isKeyPressed(Kc.VK_W)) {
             p1.hoppaTill(x,50)
             Thread.sleep(250)
             p1.hoppaTill(x,0)
             Thread.sleep(100)  
        }
        if (isKeyPressed(Kc.VK_LEFT)) {
          if (npcX < -250){
            
          }
          else {
             npc.hoppaTill(npcX-50, y)
             npcX = npcX - 50
             Thread.sleep(100)
          }
            
        }
        if (isKeyPressed(Kc.VK_RIGHT)) {
          if (npcX < 251){
             npc.hoppaTill(npcX+50, y)
             npcX = npcX + 50
             Thread.sleep(100)
          }
          else{
              
          }
        }
        if (isKeyPressed(Kc.VK_UP)) {
             npc.hoppaTill(npcX,50)
             Thread.sleep(250)
             npc.hoppaTill(npcX,0)
             Thread.sleep(100)  
        }
        if (isKeyPressed(Kc.VK_M)) {
          if (burstNPC == true){
            burstNPC = false; burstTextNPC(); Thread.sleep(500)
          }
          else
            burstNPC = true; burstTextNPC(); Thread.sleep(500)
             
        }
        if (isKeyPressed(Kc.VK_B)) {
          if (burst == true){
            burst = false; burstText(); Thread.sleep(500)
          }
          else
            burst = true; burstText(); Thread.sleep(500)
             
        }
        if (isKeyPressed(Kc.VK_R)) {
          if (ammo > 0){
            if (mag < 30){
              playMp3("~/downloads/sounds/ladda.mp3")
              Thread.sleep(100)
              val oldmag = mag // spara gamla ammot i maget
              val removeAmmo = 30 - oldmag // räkna ut hur mycket man ska ta bort
              ammo = ammo - removeAmmo // ta bort
              mag = removeAmmo + oldmag // lägg in i maget
              Thread.sleep(5000)
              updateAmmo()
              Thread.sleep(50)
            }
          }
          else
            updateAmmo(); Thread.sleep(100)
        }
        if (isKeyPressed(Kc.VK_K)) {
          if (ammoNPC > 0 ){
            if (magNPC < 30){ 
              playMp3("~/downloads/sounds/ladda.mp3")
              Thread.sleep(100)
              val oldmagNPC = magNPC // spara gamla ammot i maget
              val removeAmmoNPC = 30 - oldmagNPC // räkna ut hur mycket man ska ta bort
              ammoNPC = ammoNPC - removeAmmoNPC // ta bort
              magNPC = removeAmmoNPC + oldmagNPC // lägg in i maget
              Thread.sleep(5000)
              updateNPCAmmo()
              Thread.sleep(50)
            }
          }
          else
            updateNPCAmmo(); Thread.sleep(100)
        }
        if (isKeyPressed(Kc.VK_L)) {
            var number = 0
            if (burstNPC){
              if (magNPC < 3) {
                playMp3("~/downloads/sounds/noammo.mp3")
                Thread.sleep(500)
              }
              else{ 
                magNPC = magNPC - 3
                playMp3("~/downloads/sounds/burst.mp3")
                Thread.sleep(500)
                while (number < 2 ){
                  number = number + 1
                  hoppaTill(npcX-50, npcY+5); väster;
                  var timesdone = 0
                  Thread.sleep(200)
                  while (timesdone < 4){
                  Thread.sleep(50)
                  bredd(5) 
                  timesdone = timesdone + 1
                  fyll(gul); färg(gul); fram(5); fyll(vit); färg(vit); fram(10); Thread.sleep(25)
                 }
                 öster; färg(vit); fyll(vit); fram(500)  
                }
                number = 0
                if (npcX - x < 270){
                if (npcY - y == 0){
                  if (npcX - x > 0){
                   Thread.sleep(10)
                   if (p1HP < 5){
                     sudda
                     hoppaTill(0,0)
                     skriv("Spelare 2 vinner!")  
                     osynlig                  
                   }
                   updateP1Health()
                  }
                }
              }
                updateNPCAmmo()
                burstTextNPC()
              }
            }
            else
              if (magNPC < 1){
                playMp3("~/downloads/sounds/noammo.mp3")
                Thread.sleep(500)
              }
              else{
                 hoppaTill(npcX-50, npcY+5); väster;
                 var timesdone = 0
                 playMp3("~/downloads/sounds/pangpang.mp3") 
                 Thread.sleep(200)
                 while (timesdone < 10){
                  Thread.sleep(50)
                  bredd(5) 
                  timesdone = timesdone + 1
                  fyll(gul); färg(gul); fram(5); fyll(vit); färg(vit); fram(10); Thread.sleep(10)
                 }
                 
                 
                 bredd(50)
               öster; färg(vit); fyll(vit); fram(500 )      
                 // hoppaTill(x+50 , y); fyll(gul); färg(gul); cirkel(5); playMp3("~/downloads/pangpang.mp3"); Thread.sleep(100); fyll(vit); färg(vit); cirkel(15);Thread.sleep(100)
              magNPC = magNPC - 1
              if (npcX - x < 270){
                if (npcY - y == 0){
                  if (npcX - x > 0){
                   Thread.sleep(10)
                   if (p1HP < 5){
                     sudda
                     hoppaTill(0,0)
                     skriv("Spelare 2 vinner!") 
                     osynlig                   
                   }
                   updateP1Health()
                  }
                }
              }
              print(npcX-x)
              updateNPCAmmo()
              burstTextNPC()
          }
        }
        if (isKeyPressed(Kc.VK_SPACE)) {
            var number = 0
            if (burst){
              if (mag < 3) {
                playMp3("~/downloads/sounds/noammo.mp3")
                Thread.sleep(500)
              }
              else{ 
                mag = mag - 3
                playMp3("~/downloads/sounds/burst.mp3")
                Thread.sleep(500)
                while (number < 2 ){
                  number = number + 1
                  hoppaTill(x+50, y+5); öster;
                  var timesdone = 0
                  Thread.sleep(200)
                  while (timesdone < 4){
                  Thread.sleep(50)
                  bredd(5) 
                  timesdone = timesdone + 1
                  fyll(gul); färg(gul); fram(5); fyll(vit); färg(vit); fram(10); Thread.sleep(25)
                 }
                 if (p1HP < 13){
                     sudda
                     hoppaTill(0,0)
                     skriv("Spelare 1 vinner!")                    
                 }
                 väster; färg(vit); fyll(vit); fram(500)  
                }
                number = 0
               if (x - npcX > -270){
                if (npcY - y == 0){
                 Thread.sleep(10)
                 if (npcHP < 13){
                     sudda
                     hoppaTill(0,0)
                     skriv("Spelare 1 vinner!")                    
                   }
                 updateNPCHealth()
               }
              }
                updateAmmo()
              }
            }
            else
              if (mag < 1){
                playMp3("~/downloads/sounds/noammo.mp3")
                Thread.sleep(500)
              }
              else{
                 hoppaTill(x+50, y+5); öster;
                 var timesdone = 0
                 playMp3("~/downloads/sounds/pangpang.mp3") 
                 Thread.sleep(200)
                 while (timesdone < 10){
                  Thread.sleep(50)
                  bredd(5) 
                  timesdone = timesdone + 1
                  fyll(gul); färg(gul); fram(5); fyll(vit); färg(vit); fram(10); Thread.sleep(10)
                 }
                 bredd(50)
               väster; färg(vit); fyll(vit); fram(500 )      
                 // hoppaTill(x+50 , y); fyll(gul); färg(gul); cirkel(5); playMp3("~/downloads/pangpang.mp3"); Thread.sleep(100); fyll(vit); färg(vit); cirkel(15);Thread.sleep(100)
              mag = mag - 1
              if (x - npcX > -270){
                if (y - npcY == 0){
                  if (x - npcX < 0){
                   Thread.sleep(10)
                   if (npcHP < 5){
                     sudda
                     hoppaTill(0,0)
                     skriv("Spelare 1 vinner!")                    
                   }
                   updateNPCHealth()
                  }
                }
              }
              print(npcHP, x - npcX)
              updateAmmo()
          }
        }
}