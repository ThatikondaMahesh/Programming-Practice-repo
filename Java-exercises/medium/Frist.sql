declare
	a number:=&a;
	b number:=&b;
	c number:=&c;
 
begin
	IF a>b and a>c   
	THEN  
 		dbms_output.put_line('a is big');

	ELSIF b>c   
	THEN  
		dbms_output.put_line('b is big');
	ELSE
		dbms_output.put_line('c is big');
	END IF; 
end;
/