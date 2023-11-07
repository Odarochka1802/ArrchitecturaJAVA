

const route = (event)=>{
	event = event || window.event;
	event.preventDefault();
	window.history.pushState({},"",event.target.href);
	handleLocation();
};


const handleLocation = async () =>{
	const path = window.location.pathname;
	const route = routes[path] || routes[404];
	const html = await fetch(route).then((page) => page.text());
	document.getElementById("main-page").innerHTML = html;
};



const routes = {
	"/": "/pages/home.html",
	"/about": "/pages/about.html",
	"/settings": "/pages/settings.html",
	404 : "/pages/404.html",
	"/login": "/pages/login.html"
}

window.onpopstate = handleLocation;
window.route = route();

handleLocation();

function search() {

  var searchValue = document.getElementById("searchInput").value;

  var mainPage = document.getElementById("main-page");
  mainPage.innerHTML = "Search results for: " + searchValue;
}

var searchForm = document.getElementById("searchForm");
searchForm.addEventListener("submit", function(event) {
  event.preventDefault(); // prevent the form from submitting
  search();
});



