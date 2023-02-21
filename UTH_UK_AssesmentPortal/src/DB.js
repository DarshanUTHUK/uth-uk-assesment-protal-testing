var mysql = require('mysql');  
const express = require('express'); //Line 1
const app = express(); //Line 2
const port = process.env.PORT || 3001; //Line 3
const cors = require('cors');

app.use(express.json());
app.use(cors());

var con = mysql.createConnection({  
    host: "localhost",  
    user: "root",  
    password: "root@123",  
    database: "freshers"
    });

    con.connect(function(err) {  
        if (err) throw err;  
        console.log("Connected!");   
    });  

app.post("/register", (req,res)=>{

    const username = req.body.username
    const password = req.body.password
    console.log(username);   
    console.log(password);   
    
    con.query("INSERT INTO freshers (id, username, password) VALUES (1,?,?)",
     [username, password], 
     function (err, result) {  
    if (err) throw err;  
    console.log("1 record inserted");  
    });  
});

// This displays message that the server running and listening to specified port
app.listen(port, () => console.log(`Database listening on port ${port}`)); //Line 6
