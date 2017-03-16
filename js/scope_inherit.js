var app = angular.module("myApp", []);
app.controller('MainController',['$scope',function($scope){
	$scope.time = "morning";
	$scope.name = "grandpa";
}])
app.controller('ChildController',['$scope',function($scope){
	$scope.name = "papa";
}])
app.controller('GrandchildController',['$scope',function($scope){
	$scope.time = "evening";
	$scope.name = "son";
}])