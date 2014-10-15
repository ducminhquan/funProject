var _ = require('lodash');

var a = c = g = i = ['1', '3', '7', '9'];
var b = d = f = h = ['2', '4', '6', '8'];
var e = ['5'];
var sums = [];

a.forEach(function(_a){
	b.forEach(function(_b){
		c.forEach(function(_c){
			d.forEach(function(_d){
				e.forEach(function(_e){
					f.forEach(function(_f){
						g.forEach(function(_g){
							h.forEach(function(_h){
								i.forEach(function(_i){									
									var tmp = [_a,_b,_c,_d,_e,_f,_g,_h,_i];
									tmp = _.uniq(tmp);
									
									if(tmp.length === 9) {	
																			
										var sum = '';
										for(ii=0; ii < 9; ii++) {
											sum = sum + tmp[ii];												
										};
										sums.push(sum);	
									}
								});
							});
						});
					});
				});
			});
		});
	});
});

sums.forEach(function(sum) {
	var tmp = '';
	var result = true;
	
	for (i=0; i<9; i++) {
		tmp = tmp + sum[i];
		if (+(tmp) % (i+1) != 0) { result=false; break;}
	}
	
	if(result)console.log(sum);
});
