var express = require('express');
var bodyParser = require('body-parser');
var cookieParser = require('cookie-parser');
var moment = require('moment');

var config = require('./lib/config.json');

var app = express();


/* Setup and Config */
var proj = {
  express: express,
  moment: moment,
  config: config,
};

proj.config = require('./lib/config.json');

// Start listening on web port
// Note: port is assigned to server and not app so it can be used by both express and socket.io
server.listen(proj.config.webport);
console.log('Listening on port ' + proj.config.webport + ' settings');

/*
  Set Up Web Server
*/


// Session
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

function logger(req, res, next) {
  console.log('%s %s %s', req.method, req.url, req.path);
  next(); //continue
}

//log all webrequests to logfile and console?
app.use(logger);

// load routes 
app.use('/api/test', require('./lib/api/ENDPOINT.js')(proj));


// catch all static files that exist 
app.use(express.static(__dirname + '/www'));


//Catch other routes for static html files
//404 for uncaught errors
app.use(function(req, res, next) {
  res.send(404, 'page not found');
});