allcases = perms(1:9);
for i = 1:size(allcases,1) 
    array = allcases(i,:);
    num = array(1);
    flag = 1;
    for j = 2:9
        num = num*10 + array(j);
        if (mod(num, j) ~= 0)        
            flag = 0;
            break;
        end
    end
    if (flag == 0)
        num = -1;
    end
    if (num ~= -1)
        sprintf('RAAAAAAAAAAAAA NE: %d\n', num)
%         break;
    end
end    

