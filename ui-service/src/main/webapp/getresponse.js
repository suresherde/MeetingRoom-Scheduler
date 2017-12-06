angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:7001/rest/db/room/getAllRoom').
        then(function(response) {
            $scope.greeting = response.data;
        });
});