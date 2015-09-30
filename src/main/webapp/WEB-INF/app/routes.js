fixLeadApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'app/loadLead.html',
        controller: 'leadCtrl'
      }).
      when('/lead/:id', {
        templateUrl: 'app/fixLead.html',
        controller: 'fixLeadCtrl',
        resolve: {
        	leadInfo: function ($route, Lead) {
            // console.log($route.current.params);
        		return Lead.get({
              'id': $route.current.params.id
            }).$promise;
        	}
        }
      }).
      otherwise({
        redirectTo: '/'
      });
  }]);