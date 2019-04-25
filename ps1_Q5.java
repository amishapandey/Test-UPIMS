def value(ri): 
    
    if (ri == 'V'): 
        return 5
    if (ri == 'I'): 
        return 1
    if (ri == 'X'): 
        return 10
    
    return -1
  
def Decimal(str): 
    r= 0
    i = 0
  
    while (i < len(str)): 
        s1 = value(str[i]) 
        if (i+1 < len(str)): 
            s2 = value(str[i+1]) 
            if (s1 >= s2):  
                r = r + s1 
                i = i + 1
            else:
                r = r + s2 - s1 
                i = i + 2
        else: 
            r = r + s1 
            i = i + 1
  
    return r 
n=input()
print(Decimal(n))  
