1. db.addresses.find()

2. db.addresses.aggregate([
	{$project: {restaurant_id:1,name:1,borough:1,cuisine:1}}
	])

3.db.addresses.aggregate([
	{$project: {_id:0,restaurant_id:1,name:1,borough:1,cuisine:1}}
	])

4.db.addresses.aggregate([
	{$project: {_id:0,restaurant_id:1,name:1,borough:1,"address.zipcode":1}}
	])

5.db.addresses.aggregate([
	{$match:{borough:"Bronx"}},
	{$limit:5}
	])

6. db.addresses.aggregate([
	{$match:{borough:"Bronx"}}
	])

7. db.addresses.find().skip(5)

8. db.addresses.aggregate([
	{$unwind:"$grades"},
	{$group:{_id:"$name",totalscore:{$sum:"$grades.score"}}},
	{$match:{totalscore:{$gte: 90}}}
	])

9.db.addresses.aggregate([
	{$unwind:"$grades"},
	{$group:{_id:"$name",totalscore:{$sum:"$grades.score"}}},
	{$match:{totalscore:{$gte: 80,$lt:100}}}
	])



10.db.addresses.aggregate([
	{$match:{"address.coord.0":{$lt : -95.754168}}}
	])


11.db.addresses.aggregate([ 
	{$match:{cuisine:{$not:/American /}}}, 
	{$unwind:"$grades"}, 
	{$group:{_id:{name:"$name",cuisine:"$cuisine",address:"$address"},totalscore:{$sum:"$grades.score"}}}, 
	{$match:{$and:[
		{totalscore:{$gt:70}},
		{"_id.address.coord.0":{$lt:-65.754168}}
		]}}
	])


12. db.addresses.aggregate([ 
	{$match:{cuisine:{$not:/American /}}}, 
	{$unwind:"$grades"}, 
	{$group:{_id:{name:"$name",cuisine:"$cuisine",address:"$address"},totalscore:{$sum:"$grades.score"}}}, 
	{$match:{$and:[
		{totalscore:{$gt:70}},
		{"_id.address.coord.1":{$lt:-65.754168}}
		]}}
	])

{"$grades.grade":"A"},

13. db.addresses.aggregate([
	{$unwind:"$grades"}, 
	{$match:{$and:
		[{cuisine:{$not:/American /}},
		{borough:{$not:/Brooklyn/}}
		]}
	},  
	{$group:{_id:{name:"$name",cuisine:"$cuisine",grade:"$grades.grade",borough:"$borough"}}}, 
	{$match:{"_id.grade":'A'}},
	{$sort :{"_id.cuisine" : -1}}
	])

14. db.addresses.aggregate([
	{$match:{name:/^Wil/}},
	{$project: {name:1,borough:1,restraurat_id:1,cuisine:1}}
	])

15. db.addresses.aggregate([
	{$match:{name:/ces$/}},
	{$project: {name:1,borough:1,restraurat_id:1,cuisine:1}}
	])

16. db.addresses.aggregate([
	{$match:{name:/reg/i}},
	{$project: {name:1,borough:1,restraurat_id:1,cuisine:1}}
	])


17.db.addresses.aggregate([
	{$match:{$and:[
	{borough:"Bronx"},
	{$or:[{cuisine:"American "},{cuisine:"Chinese"}]}
	]}},
	
	])
18.db.addresses.aggregate([
	{$match:{$or:[
	{borough:"Bronx"},
	{borough:"Brooklyn"},
	{borough:"Queens"},
	{borough:"Staten Island"}
	]}}
	])

19. db.addresses.aggregate([
	{$match:{$and:[
	{borough:{$not: /Bronx/}},
	{borough:{$not:/Brooklyn/}},
	{borough:{$not: /Queens/}},
	{borough:{$not: /Staten Island/}}
	]}}
	])

20. db.addresses.aggregate([
	{$unwind:"$grades"},
	{$group:{_id:{name:"$name",borough:"$borough",
	cuisine:"$cuisine",RestID:"$restaurant_id"},
	totalscore:{$sum:"$grades.score"}}},
	{$match:{totalscore:{$lte: 10}}}
	])

21. db.addresses.aggregate([
	{$match:{$or:[
	{$and:[{cuisine:{$not:/American /}},{cuisine:{$not:/chinese/}}]},
	{name:/^Wil/}]}},
	{$project: {name:1,borough:1,restaurant_id:1,cuisine:1}}


	])

22. db.addresses.aggregate([ 
	{ $unwind: "$grades" }, 
	{ $match: { $and: [ 
		{ "grades.grade": 'A' }, 
		{ "grades.score": 11 }, 
		{ "grades.date": ISODate("2014-08-11T00:00:00Z") }
		] } },
	{$project: {name:1,restaurant_id:1,"grades.grade":1}}

	])

23. db.addresses.aggregate([  
	{ $match: { $and: [ 
		{ "grades.1.grade": 'A' }, 
		{ "grades.1.score": 9 }, 
		{ "grades.1.date": ISODate("2014-08-11T00:00:00Z") }
		] } },
	{$project: {name:1,restaurant_id:1,"grades.grade":1}}

	])

24. db.addresses.aggregate([  
	{ $match:  
		{ "address.coord.1": {$gt:42 , $lte:52} }
	},
	{$project: {name:1,restaurant_id:1,"address.coord":1}}

	])

25. db.addresses.aggregate([
	{$sort:{name: -1}}
	])