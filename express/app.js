var express = require('express');
var app = express();
var path = require('path');

app.use(express.static(__dirname + '/public'));

app.get('/mal8', function (req, res) {
    res.sendFile(path.join(__dirname + '/public/index.html'));
});

app.listen(3000);

