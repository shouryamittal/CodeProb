/**
 * Q: Check if set of points forms a straight line.
 */
/**
 * We have used three point collinearity method. 
 */
/**
 * @param {number[][]} coordinates
 * @return {boolean}
 */

var checkStraightLine = function(coordinates) {
    let breakLoop = true;
    if(coordinates.length == 2) {
        return true;
    }
    let slope = (coordinates[1][0] - coordinates[0][0])/ (coordinates[1][1] - coordinates[0][1]);

    for(let i = 2; i < coordinates.length; i++) {
        let slope1 = (coordinates[i][0] - coordinates[0][0]) / (coordinates[i][1] - coordinates[0][1]);
        let slope2 = (coordinates[i][0] - coordinates[1][0]) / (coordinates[i][1] - coordinates[1][1]);
        console.log(slope, slope1, slope2);
        if(Math.abs(slope) != Math.abs(slope1) || Math.abs(slope) != Math.abs(slope2) || Math.abs(slope1) != Math.abs(slope2)){
            breakLoop = false;
            break;
        }
    }

    return breakLoop;
};

checkStraightLine();

