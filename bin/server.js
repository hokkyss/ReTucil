// Load Node modules
var express = require('express');
const ejs = require('ejs');

// Initialise Express
var app = express();

// Render static files
app.use(express.static('public'));

// Set the view engine to ejs
app.set('view engine', 'ejs');

// Port website will run on
const port = 8000 || process.env.PORT;
const server = app.listen(port, () => {
  console.log(`App running at port ${port}`);
});

// *** GET Routes - display pages ***

// Root Route
app.get('/', function (req, res) {
    var page_name = 'index'
    res.render('pages/index', {
        page_name : page_name
    });
});

app.get('/result', function (req, res) {
    var page_name = 'result'
    res.render('pages/index', {
        page_name : page_name
    });
});

app.get('/about', function (req, res) {
    var page_name = 'about'
    res.render('pages/about', {
        page_name : page_name
    });
});