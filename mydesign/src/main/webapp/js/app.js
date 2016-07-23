'use strict';
var app = angular.module('my-design', []);

app.config(['$routeProvider',
                   function($routeProvider) {
                     $routeProvider.
                       when('/home', {
                         templateUrl: 'templates/home.html'
                       }).
                       otherwise({
                         redirectTo: '/home'
                       });
                   }]);

