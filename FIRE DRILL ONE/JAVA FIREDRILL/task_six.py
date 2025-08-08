for index in range (1, 11):
	multiple4 = 1
	multiples8 = 1
	for times in range(1 , 6):
		if(index % 4 == 0):
			multiple4 *= 4			
			print(multiple4)
			print(" ")
	for time in range(1, 6):
		if(index % 8 == 0):
			multiples8 *= 8
			print(multiples8)
			print(" ")
			
					
