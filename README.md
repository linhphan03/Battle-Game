# BattleGame

1. Description:
- This is a computer-version Battle Game between two races, Terran and Protoss, playing through console
- Each team has the following features:
  + Hit Points (HP): If HP is 0, the soldier will be killed
    * For Protoss team, the soldiers have Plasma Shields. If they are attacked, PS will be reduced first, and if PS is 0, HP will be reduced.
  + Move Mode: Either Air or Ground
  + Ground Attack and Air Attack ability
 
- Terran has 3 types of soldier:
  + Marine:
    * Move mode: Ground
    * HP: 80
    * Ground Attack: 12
    * Air Attack: 12
  + Firebat: 
    * Move mode: Ground
    * HP: 100
    * Ground Attack: 12
    * Air Attack: 0 (unable to attack soldier with Air Move mode)
  + Wraith:
    * Move mode: Air
    * HP: 120
    * Ground Attack: 8
    * Air Attack: 20

- Protoss has 3 types of soldiers:
  + Zealot: 
    * Move mode: Ground
    * HP: 80
    * Ground Attack: 16
    * Air Attack: 0 
    * PS: 20
  + Dragon:
    * Move mode: Ground
    * HP: 90
    * Ground Attack: 20
    * Air Attack: 20 
    * PS: 30
  + Scout:
    * Move mode: Air
    * HP: 100
    * Ground Attack: 8
    * Air Attack: 28 
    * PS: 40
    
- There are 4 attacking tactics to choose. The most approriate tactics are randomly chosen by computer
  + Randomly select one soldier from the other team to attack.
  + Randomly select solider that can be attacked (For example, ground soldier can only choose ground soldier to attack, and vice versa)
  + Choose the solider that can be attacked and has the least HP (and PS).
  + Choose the most attackable and dangerous soldier
  
- Each team take turn to attack until one does not have any solder left.
- During the battle, report each attack turn to console

2. Data Structure and Concepts used:
- Object - Oriented Programming: Inheritance, Polymorphism, Abstract and Interface
  + Create superclass for Races (ChungToc.java), and subclasses "Terran" and "Protoss" of races. 
  + Terran has subclasses Marine, Firebat, and Wraith, which are the type of soldiers. While Protoss has Zealot, Dragon and Scout subclasses
- Strategy: use an interface to generate a randomm tactics for each turn
  + AttackLeastHP, AttackMostDangerous, AttackPossible, and AttackRandom: implement Strategic to operate
- Move Mode and Type: use ENUM to create constants
- Store team members: ArrayList

3. Future improvement:
- Create a GUI for the game

  
  
   
    
