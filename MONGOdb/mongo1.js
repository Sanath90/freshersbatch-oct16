1.db.users.find()
2. db.posts.find()
3. db.posts.find({username: "GoodGuyGreg"})
4. db.posts.find({username: "ScumbagSteve"})
5. db.comments.find()
6. db.comments.find({username: "GoodGuyGreg"})
7. db.comments.find({username: "ScumbagSteve"})
8. db.comments.aggregate({$match:{post:ObjectId("6128a1b150c1e7c3764b6091")}})


5.db.movies.find({year:{$gte:1900,$lt:2000}})
6.db.movies.find({$or:[{year:{$lt:2000}},{year:{$gt:2010}}]})
7. db.movies.updateOne({title:"The hobbit and unexpected journey"},{$set:{synopsis:"A reluctant hobbit bilbo baggins, sets out to the lonely mountain with spirited group of dwarves to reclain their mountain home - and the gold within it - from the dragon smaug"}})
8. db.movies.updateOne({title:"The hobbit: The desolation of smaug"},{$set:{synopsis:"The swarves along with bilbo baggins and gandhalf the grey, continue their quest to reclaim Erebor, their homeland, from smaug. bilbo baggins is in the possesion of mysterious and magical ring."}})
9. db.movies.update(
   { title:"pulp fiction" },
   { $push: { actors:"Samuel L Jackson" } }
)



text search*/
db.movies.createIndex( { synopsis: "text" } )
	

1.db.movies.find( { $text: { $search: "bilbo" } } )

2.db.movies.find( { $text: { $search: "gandhalf" } } )

3. db.movies.find( { $text: { $search: "bilbo -Gandhalf" } } )

4.db.movies.find( { $text: { $search: "dwarfes hobbit" } } )
5.db.movies.find( { $text: { $search:"\"gold\" \"dragon\"" } } )


Deletion*/

db.movies.deleteOne({title:"Pee Wee Herman's Big Adventure"})
db.movies.deleteOne({title:"Avatar"})


//relations

//users---------------
1. db.users.insertMany([{ 
username: "GoodGuyGreg", first_name: "Good Guy", Last_name: "Greg"}, 
{ username: "ScumbagSteve", fullname:{first : "Scumbag", last:"steve"}
}])


//posts----------

2. db.posts.insertMany([
{ 	username: "GoodGuyGreg",
	title : "passes out at party",
	body: "wakes up early and cleans house"
},
{ 	username: "GoodGuyGreg",
	title : "steals your identity",
	body: "raises your credit score"
},
{ 	username: "GoodGuyGreg",
	title : "reports a bug in your code",
	body: "sends you a pull request"
},
{ 	username: "ScumbagSteve",
	title : "borrows something",
	body: "sells it"
},
{ 	username: "ScumbagSteve",
	title : "borrows everything",
	body: "the end"
},
{ 	username: "ScumbagSteve",
	title : "forks your repo on github",
	body: "sets to private"
}
])	

//objectIds-------
    '0': ObjectId("6128a1b150c1e7c3764b608f"),
    '1': ObjectId("6128a1b150c1e7c3764b6090"),
    '2': ObjectId("6128a1b150c1e7c3764b6091"),
    '3': ObjectId("6128a1b150c1e7c3764b6092"),
    '4': ObjectId("6128a1b150c1e7c3764b6093"),
    '5': ObjectId("6128a1b150c1e7c3764b6094")

//comments----
db.comments.insertMany([
{
	username:"GoodGuyGreg",
	comment: "hope you got a good deal!",
	post: ObjectId("6128a1b150c1e7c3764b6092")
},
{
	username:"GoodGuyGreg",
	comment: "what's mine is yours!",
	post: ObjectId("6128a1b150c1e7c3764b6093")
},

{
	username:"GoodGuyGreg",
	comment: "Dont violate the licensing agreement!",
	post: ObjectId("6128a1b150c1e7c3764b6094")
},
{
	username:"ScumbagSteve",
	comment: "it still isnt clean",
	post: ObjectId("6128a1b150c1e7c3764b608f")
},
{
	username:"ScumbagSteve",
	comment: "denied your PR cause i found a hack",
	post: ObjectId("6128a1b150c1e7c3764b6091")
}
])