fixLeadApp.factory('Lead', function ($resource) {
	return $resource('/json/leadInfo.json');
	// return $resource('http://10.168.1.32:8080/restful-api/lead/:id');
	// return $resource('http://localhost:8080/restful-api/lead/:id');
});