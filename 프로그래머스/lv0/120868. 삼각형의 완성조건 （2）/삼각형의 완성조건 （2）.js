function solution(sides) {
  
    sides.sort((a,b)=>a-b);
    
    return  (sides[1]-(sides[1]-sides[0])) + (((sides[0]+sides[1]) - sides[1]) -1);
}