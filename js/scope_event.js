var app = angular.module("myApp", []);
app.controller('MainController',['$scope',function($scope){
	$scope.count = 0;
	$scope.$on('MyEvent',function(){
		$scope.count += 2;
	})
}])
app.controller('ChildController',['$scope',function($scope){
	$scope.count = 0;
	$scope.$on('MyEvent',function(){
		$scope.count ++;
	})
}])
app.controller('GrandchildController',['$scope',function($scope){
	$scope.count = 0;
	$scope.$on('MyEvent',function(){
		$scope.count -= 2;
	})
}])