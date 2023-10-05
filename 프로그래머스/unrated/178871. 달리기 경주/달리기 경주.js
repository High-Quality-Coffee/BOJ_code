// function solution(players, callings) {
//     var array=[];
//     var index;
//     let a;
//     for (var i =0; i<callings.length;i++){    
//         index=players.indexOf(callings[i]);
//         if(index>0){
//             a=players[index];
//             players[index]=players[index-1];
//             players[index-1]=a;
//         }
//     }
    
//     return players;
// }

function solution(players, callings) {
    const playerPositions = {};
    
    for (let i = 0; i < players.length; i++) {
        playerPositions[players[i]] = i;
    }

    for (let i = 0; i < callings.length; i++) {
        const calling = callings[i];
        const currentIndex = playerPositions[calling];
        
        if (currentIndex > 0) {
            const previousPlayer = players[currentIndex - 1];
            players[currentIndex - 1] = calling;
            players[currentIndex] = previousPlayer;
            playerPositions[calling] = currentIndex - 1;
            playerPositions[previousPlayer] = currentIndex;
        }
    }

    return players;
}
