var leadControllers = angular.module('leadControllers', []);

leadControllers.controller('leadCtrl', ['$scope', '$location', function ($scope, $location) {
	$scope.leadId = '';
	$scope.getLead = function () {
		$location.path('/lead/' + $scope.leadId);
	};

}]);

leadControllers.controller('fixLeadCtrl', ['$scope', 'leadInfo', '$routeParams', 'Lead',
function ($scope, leadInfo, $routeParams, Lead) {
	$scope.lead = leadInfo;
	if (!$scope.lead.offerPrice) {
		$scope.lead.offerPrice = 0;
	}
	$scope.minPrice = $scope.lead.offerPrice - 5000 < 0 ? 0 : $scope.lead.offerPrice - 5000;
	$scope.maxPrice = $scope.lead.offerPrice + 5000;
	$scope.tmvPosition = 100 * (leadInfo.TMV - $scope.minPrice) / ($scope.maxPrice - $scope.minPrice); 

	$scope.fake = {
		advertisement: false,
		photos: 1,
		incentive: false
	};
	$scope.minPhotos = $scope.fake.photos - 10 < 0 ? 0 : $scope.fake.photos - 10;
	$scope.maxPhotos = $scope.fake.photos + 10;
	$scope.rate= leadInfo.rate * 100;
	$scope.id = $routeParams.id;

	$scope.$watch('lead', function (newValue, oldValue) {
		if (oldValue !== newValue) {
			Lead.get({
				'id': $scope.id,
				'offerPrice': newValue.offerPrice,
				'pricePromise': newValue.pricePromise,
				'carcode': newValue.carcode
			}, function (data) {
				$scope.rate = data.rate * 100;
			});
		} 
	}, true);

	$scope.$watch('fake', function (newValue, oldValue) {
		if (oldValue !== newValue) {
			Object.keys(newValue).forEach(function(key) {
				if (newValue[key] !== oldValue[key]) {
					$scope.rate = $scope.rate + (newValue[key] - oldValue[key]);
				}
			});
		}
	}, true);

}]);