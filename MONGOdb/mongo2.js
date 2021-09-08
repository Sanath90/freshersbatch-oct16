1. db.zipcodes.find({city:"ATLANTA"})
2. db.zipcodes.aggregate({$match:{city:"ATLANTA"}})
3. db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$_id"}},
	{$count:"total zipcodes"}
   ])
4.db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$city",totalpop:{$sum: "$pop"}}
    ])


2)
1. db.zipcodes.find({city:"ATLANTA"})
2. db.zipcodes.aggregate({$match:{city:"ATLANTA"}})
3. db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$_id"}},
	{$count:"total zipcodes"}
   ])
4.db.zipcodes.aggregate([
	{$match:{city:"ATLANTA"}},
	{$group:{_id:"$city",totalpop:{$sum: "$pop"}}
    ])
	
3)
1.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}}
	])
3.db.zipcodes.aggregate([
	{$group:{_id:"$state", totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
//top 3 highest populated state = CA>NY>TX

//--------------------population by city----------------------------------
1.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}}
	])
3.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
	// chicago>brooklyn>LA
4.db.zipcodes.aggregate([
	{$match:{state:"TX"}},
	{$group:{_id:{city:"$city",state:"$state"}, totalpop:{$sum:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])
5)
1.db.zipcodes.aggregate([
	{$group:{_id:{city:"$city",state:"$state"}, AVGpop:{$avg:"$pop"}}}
	])
2.db.zipcodes.aggregate([
	{$group:{_id:"$state", AVGpop:{$avg:"$pop"}}},
	{$sort:{totalpop : -1}},
	{$limit:3}
	])