day = "thursday"
match (day):
            case "monday":
                print("Basketball")
                
            case "tuesday":
                print("Tennis")   

            case "wednesday":
                print("Basketball")
              
            case "thursday":
                print("Cricket")
               
            case "friday":
                print("Fotball")
                
            case "saturday":
                println("Excerise")
               
            case "sunday":
                println("Holiday")
            
            case _:
                print("invalid "+day)
                
      