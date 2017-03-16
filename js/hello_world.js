var app = angular.module("myApp", []);
app.controller('HelloController',['$scope',function($scope){
	$scope.name = "World";
}])