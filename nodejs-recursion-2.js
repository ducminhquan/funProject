console.time('Running Time');
var n = 9;
var options = [];
options[1] = options[3] = options[7] = options[9] = [1, 3, 7, 9];
options[2] = options[4] = options[6] = options[8] = [2, 4, 6, 8];
options[5] = [5];

var tryNext = function(arrNum, next, i) { return (+( arrNum.join('') + next) % i === 0); };
var check = function(arrNum, next, i) {	return (arrNum.indexOf(next) == -1) && tryNext(arrNum, next,i); };
var getNum = function(result, i) {
	if (i > n) {
		console.log(result.join('')); 
	} else {
		options[i].forEach(function(j) {
			if (check(result, j, i)) {
				result[i-1] = j;
				getNum(result, i + 1);
				result[i-1] = '';			
			};	
		});
	}
};
getNum([], 1);
console.timeEnd('Running Time');
