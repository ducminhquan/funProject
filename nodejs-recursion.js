console.time('Running Time');
var n = 9;
var tryNext = function(arrNum, next, i) { return (+( arrNum.join('') + next) % i === 0); };
var check = function(arrNum, next, i) {	return (arrNum.indexOf(next) == -1) && tryNext(arrNum, next,i); };
var getNum = function(result, i) {
	if (i > n) {
		console.log(result.join('')); 
	};
	for(var j=1; j<=n; j++) {	
		if (check(result, j, i)) {
			result[i-1] = j;
			getNum(result, i + 1);
			result[i-1] = '';			
		};		
	}	
};
getNum([], 1);
console.timeEnd('Running Time');
